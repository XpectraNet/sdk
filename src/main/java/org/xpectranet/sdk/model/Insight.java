
package org.xpectranet.sdk.model;

import java.time.Instant;
import java.util.UUID;

public class Insight {
    public String id;
    public String text;
    public String author;
    public String emotion;
    public String layer;
    public String remixOf;
    public double xpdtStake;
    public String timestamp;

    public Insight(String text, String author, String emotion, String layer, String remixOf, double xpdtStake) {
        this.id = UUID.randomUUID().toString();
        this.text = text;
        this.author = author;
        this.emotion = emotion;
        this.layer = layer;
        this.remixOf = remixOf;
        this.xpdtStake = xpdtStake;
        this.timestamp = Instant.now().toString();
    }
}
