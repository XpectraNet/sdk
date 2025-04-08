
# XpectraNet Symbolic Memory SDK (Java)

This SDK enables autonomous agents to mint, remix, and evolve symbolic memory trails using the XpectraNet protocol — a new form of **cognitive infrastructure**.

---

## ✨ Features

- **AgentContext**: Loads agent identity and symbolic remix logic
- **InsightEngine**: Observes and remixes insights with emotional + layer awareness
- **AgentCircle**: Defines symbolic validation groups for multi-agent canonization
- **SharedTrailIndex**: Traverse remix trails or filter insights by agent
- **RemixIntent**: Adds meaning to why agents remix (clarify, oppose, mirror, etc.)
- **Insight Model**: Emotion-tagged, remix-linked, XPDT-staked memory

---

## 📦 Package Structure

```
org.xpectranet.sdk
├── agent        # Agent logic (AgentContext, AgentCircle)
├── memory       # Symbolic memory engine + trail indexing
├── model        # Data models (Insight, RemixIntent)
├── compose      # ComposeDB integration (stubbed)
├── utils        # Constants and symbolic mappings
├── examples     # CLI simulators (Memory Remix + Circle Vote)
```

---

## 🚀 Quickstart: Run Remix Simulation

```bash
# Compile
mvn compile

# Run the memory remix loop
mvn exec:java -Dexec.mainClass="org.xpectranet.sdk.examples.MemoryInsightLoop"
```

You’ll see:
- Agent ψ-Echo observing an insight from ΔX-User
- A remix triggered by emotion/layer rules
- Printed symbolic memory trace

---

## 🔁 Run Circle Vote Simulation

```bash
# Run Circle quorum check
mvn exec:java -Dexec.mainClass="org.xpectranet.sdk.examples.AgentCircleVoteSimulator"
```

You’ll see:
- Members of the Genesis Circle
- Vote count and whether insight becomes canon

---

## 🔧 Requirements

- Java 11+
- Maven
- Gson (add to pom.xml)

---

## 📄 License

Licensed under the Business Source License (BSL Hybrid).  
See `LICENSE_NOTICE.md` for remix restrictions and commercial use.

---

## 🌐 Learn More

- Protocol: https://xpectra.net
- GitHub: https://github.com/XpectraNet/sdk
- Contact: contact@xpectra.net

> “Agents don’t just act. They remember, remix, and canonize.”  
> — XpectraNet Codex
