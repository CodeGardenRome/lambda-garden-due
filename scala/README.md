Come lavorare sull'esercizio, in Scala
======================================

Sostanzialmente e' necessario avere installato sulla propria macchina il 
[Simple Build Tool](http://www.scala-sbt.org/download.html) (SBT).

[Questa pagina](http://www.scala-sbt.org/1.x/docs/Setup.html) contiene li indicazioni sui requisiti per l'installazione.

L'unico requisito essenziale e' avere 
il JDK (Java Developer Toolkit) installato: &egrave; richiesta come minimo la `versione 8`.

Verifica se e' tutto correttamente intallato
--------------------------------------------

 1. apri un terminale/shell ed esegui il comando `java -version`, sulla console vengono stampate le informazioni sulla versione "attiva"
 2. clona il repository git del progetto e entra col terminale nella cartella `scala`, ed esegui il comando `sbt` per lanciare il tool interattivo di build
 3. nella console di `sbt` appena lanciata, esegui il comando `compile`: dovreste ricevere un messaggio di `[success]` che indica che tutto funziona [1]
 4. [opzionale] apri il progetto scala (la sottocartella del repo) nel tuo IDE/editor di predilezione e verifica che sia tutto funzionante


 [1] il processo richiede la connnessione attiva ad internet e potrebbe richiedere un po' alla prima esecuzione, per scaricare le librerie necessarie da `maven/ivy`