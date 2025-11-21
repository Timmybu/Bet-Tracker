# Bet Tracker
TERRIBLE MOD PLEASE DONT USE THIS

This is a Fabric mod workspace for Minecraft 1.21.10 containing the `bet-tracker` mod skeleton and the `PaymentScreen` GUI (client-side).

Quick info
- Minecraft: 1.21.10
- Fabric Loader: 0.18.1
- Java: 21 (project targets Java 21)
- Branch pushed: `recreated`

Structure
- `src/main/java` - common/server-safe code (mod initializer, managers)
- `src/client/java` - client-only GUI and client code (e.g. `PaymentScreen`)

Prerequisites
- JDK 21 installed and `JAVA_HOME` pointing to it

Common commands (PowerShell)

Set Java home for current shell (example):
```
$env:JAVA_HOME = 'C:\\Program Files\\Java\\jdk-21'
```

Build, generate sources, and run the game (dev client):
```
.\gradlew genSources
.\gradlew runClient
```

Build a production jar:
```
.\gradlew build
```

Notes
- The GUI uses client-only Minecraft classes and lives under `src/client/java` so it is compiled against the client mappings.
- If you open this in VS Code, run "Java: Clean Java Language Server Workspace" and ensure the Gradle extension uses the wrapper and the workspace JDK is Java 21.
