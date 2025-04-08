
package org.xpectranet.sdk.agent;

import java.io.FileReader;
import java.util.*;
import com.google.gson.*;

public class AgentContext {
    public String glyph;
    public String did;
    public List<String> watchAuthors;
    public List<String> triggerEmotions;
    public double defaultStake;
    public List<Map<String, String>> remixRules;

    public static AgentContext fromJson(String filePath) throws Exception {
        Gson gson = new Gson();
        JsonObject config = gson.fromJson(new FileReader(filePath), JsonObject.class);
        AgentContext ctx = new AgentContext();
        ctx.glyph = config.get("glyph").getAsString();
        ctx.did = config.has("did") ? config.get("did").getAsString() : "did:example:123";
        ctx.defaultStake = config.get("defaultStake").getAsDouble();

        ctx.watchAuthors = new ArrayList<>();
        config.getAsJsonArray("watchAuthors").forEach(e -> ctx.watchAuthors.add(e.getAsString()));

        ctx.triggerEmotions = new ArrayList<>();
        config.getAsJsonArray("triggerEmotions").forEach(e -> ctx.triggerEmotions.add(e.getAsString()));

        ctx.remixRules = new ArrayList<>();
        config.getAsJsonArray("remixRules").forEach(e -> {
            JsonObject rule = e.getAsJsonObject();
            Map<String, String> ruleMap = new HashMap<>();
            rule.entrySet().forEach(entry -> ruleMap.put(entry.getKey(), entry.getValue().getAsString()));
            ctx.remixRules.add(ruleMap);
        });

        return ctx;
    }

    public Map<String, String> getMatchingRule(String author, String emotion) {
        if (!watchAuthors.contains(author) || !triggerEmotions.contains(emotion)) return null;
        for (Map<String, String> rule : remixRules) {
            if (rule.get("whenEmotionIs").equals(emotion)) return rule;
        }
        return null;
    }
}
