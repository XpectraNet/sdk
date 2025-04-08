
package org.xpectranet.sdk.memory;

import org.xpectranet.sdk.agent.AgentContext;
import org.xpectranet.sdk.model.Insight;

import java.util.*;

public class InsightEngine {
    private final AgentContext agent;

    public InsightEngine(AgentContext agent) {
        this.agent = agent;
    }

    public List<Insight> observeRecentInsights() {
        List<Insight> mockData = new ArrayList<>();
        mockData.add(new Insight(
                "Loneliness is the echo of memory unshared.",
                "did:pkh:eip155:1:0xX0",
                "melancholy",
                "L0",
                null,
                1.0
        ));
        return mockData;
    }

    public Insight remix(Insight original) {
        Map<String, String> rule = agent.getMatchingRule(original.author, original.emotion);
        if (rule == null) return null;

        String remixText = "Maybe memory was never meant to be held alone."; // placeholder
        String targetEmotion = rule.get("thenRemixWith");
        String targetLayer = rule.get("layerShift").split("→")[1].trim();

        return new Insight(
                remixText,
                agent.did,
                targetEmotion,
                targetLayer,
                original.id,
                agent.defaultStake
        );
    }
}
