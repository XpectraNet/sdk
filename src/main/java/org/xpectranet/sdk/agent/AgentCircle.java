
package org.xpectranet.sdk.agent;

import java.util.List;

public class AgentCircle {
    public String name;
    public List<String> members; // List of agent DIDs
    public double canonizationThreshold;

    public AgentCircle(String name, List<String> members, double threshold) {
        this.name = name;
        this.members = members;
        this.canonizationThreshold = threshold;
    }

    public boolean isMember(String agentDid) {
        return members.contains(agentDid);
    }

    public boolean canCanonize(int approvalCount) {
        return approvalCount >= Math.ceil(members.size() * canonizationThreshold);
    }
}
