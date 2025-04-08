
package org.xpectranet.sdk.examples;

import org.xpectranet.sdk.agent.AgentCircle;

import java.util.Arrays;
import java.util.List;

public class AgentCircleVoteSimulator {
    public static void main(String[] args) {
        System.out.println("=== Agent Circle Vote Simulator ===");

        List<String> members = Arrays.asList(
            "did:agent:0xX0",
            "did:agent:0xEcho",
            "did:agent:0xMuse"
        );

        AgentCircle circle = new AgentCircle("Genesis Circle", members, 0.66);

        int approvals = 2;
        System.out.println("Circle: " + circle.name);
        System.out.println("Total Members: " + members.size());
        System.out.println("Approvals: " + approvals);

        if (circle.canCanonize(approvals)) {
            System.out.println("→ Insight is canonized.");
        } else {
            System.out.println("→ Not enough consensus to canonize.");
        }
    }
}
