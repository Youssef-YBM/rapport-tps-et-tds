# TP1 - Calculatrice avec Test First Development

## Objectif

Ce projet applique la démarche Test First Development (TFD) à une calculatrice Java. Les tests sont écrits avant l'implémentation, puis complétés pour couvrir les cas usuels.

## Prérequis

- JDK 17
- Apache Maven
- PowerShell sous Windows

Les commandes ci-dessous utilisent les outils installés dans `%LOCALAPPDATA%\Programs\TP1-Tools`. Si Java et Maven sont déjà configurés dans le `PATH`, il suffit d'ouvrir PowerShell dans le dossier du projet et d'exécuter `mvn clean test`.

## Compiler et exécuter les tests

Dans PowerShell, ouvrir le dossier `TP1-Calculator`, puis exécuter :

```powershell
$tools = Join-Path $env:LOCALAPPDATA "Programs\TP1-Tools"
$env:JAVA_HOME = Get-ChildItem (Join-Path $tools "jdk17") -Directory | Select-Object -First 1 -ExpandProperty FullName
$env:Path = "$env:JAVA_HOME\bin;$(Join-Path $tools 'apache-maven-3.9.11\bin');$env:Path"
mvn.cmd clean test
```

La commande compile les sources et lance les tests JUnit. Le résultat attendu est `BUILD SUCCESS`.

Pour compiler, exécuter les tests et créer le fichier JAR, remplacer la dernière commande par :

```powershell
mvn.cmd clean package
```

## Fonctionnalités et tests

La classe `ma.ilisi.Calculator` fournit les opérations `add` et `multiply`. La classe `CalculatorTest` vérifie huit cas, notamment l'addition et la multiplication avec zéro, des entiers positifs et des nombres négatifs.

Le projet contient une bibliothèque et des tests unitaires ; il ne possède pas de méthode `main` pour lancer une application autonome.
