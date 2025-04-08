
package org.xpectranet.sdk.memory;

import org.xpectranet.sdk.model.Insight;

import java.util.*;
import java.util.stream.Collectors;

public class SharedTrailIndex {
    private final List<Insight> memory;

    public SharedTrailIndex(List<Insight> memory) {
        this.memory = memory;
    }

    public List<Insight> getTrailFor(String rootId) {
        List<Insight> trail = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(rootId);
        visited.add(rootId);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            for (Insight i : memory) {
                if (current.equals(i.remixOf) && !visited.contains(i.id)) {
                    trail.add(i);
                    queue.add(i.id);
                    visited.add(i.id);
                }
            }
        }
        return trail;
    }

    public List<Insight> getRemixesByAgent(String agentDid) {
        return memory.stream()
                .filter(i -> i.author.equals(agentDid))
                .collect(Collectors.toList());
    }
}
