## Template

Un file markdown per ogni sezione, da tenere in continuous integration col progetto.

Capitoli obbligatori:

1. ### Processo di sviluppo
    - modalità di divisione in itinere dei task
    - meeting/interazioni pianificate tra i membri del team
    - revisione in itinere dei task
    - scelta degli strumenti di test/build/continuous integration
        - Test: JUnit (unitario), ScalaTest (unitario/integrazione), Cucumber(accettazione),
          ArchUnit (non funzionali/architetturali), ?(di sistema) come testate tutto il sistema
        - Build: SBT/Gradlew(prendiamo più punti facendo il build con SBT)
        - CI: ???

2. ### Requisiti e spefica
    - business (lato azienda cosa ci da questo progetto)
        - replica di un sistema ferroviario (descrizione di cosa si vuole ottenere)
        - obiettivo: (tutti i punto sono da vedere a quanto decidiamo di fare)
            - analisi => capire come funziona un sistema ferroviario (senza costruirlo)
            - previsione => permette di stimare il comportamento del sistema a cambiamenti o eventi
            - formazione e apprendimento => fornisce un ambiente sicuro, dove le persone imparano
            - test e sviluppo => testare nuovi prototipi (prima di costruirli)
            - Ottimizzazione => prestazione del sistema, riduzione dei tempi/costi
            - valutazione rischio => identificare i possibili guasti o criticità prima che si verifichino
    - modello di dominio (identificare i concetti chiave)
        - elementi della struttura :
            - stazione
            - treno
            - binario
            - bivii
            - biglietto (non credo che ci serve)
        - elementi di gestione :
            - tratte
        - elementi temporali :
            - orario
            - data
        - elementi di contesto :
            - ambiente (clima)
            - eventi, affluenza (sciopero, festività)
            - emergenze, chiusura tratte (manutenzione, guasti, incidenti)
    - funzionalità
    - utente
    - di sistema
    - non funzionali
    - di implementazione

3. ### Architecture Design

Il tutto corredato da pochi ma efficaci diagrammi UML

- architettura complessiva (MVC, MVU, Hexagonal, ???)
- descrizione di pattern architetturali usati
- eventuali componenti del sistema distribuito (per noi no)
- scelte tecnologiche cruciali ai fini architetturali

4. ### Design di dettaglio

Il tutto corredato da pochi ma efficaci diagrammi UML

- scelte rilevanti
- pattern di progettazione
- organizzazione del codice

5. ### Implementazione

Va fatto per ogni studente

- descrizione di cosa si è fatto/co-fatto (con chi)
- descrizione di aspetti implementativi importanti (non gia presenti nel design) es: uso di meccanismi avanzati di scala

6. ### Testing
    - tecnologie usate (Junit, ScalaTest, Cucumber, ArchUnit)
    - grado di copertura
    - metodologia usata
      - TDD: test driven development con junit e scalaTest (anche test di integrazione)
      - BDD: behavior driven development con cucumber (test di accettazione) 
possiamo venderlo come metedologia o tenerlo solo come test in più senza BDD (non costa molto)
    - altri elementi utili

7. ### Retrospettiva
    - descrizione finale dettagliata dell'andamento dello sviluppo
    - descrizione dei backlog
    - descrizione delle iterazioni
    - commenti finali