# Progetto Facebook Application
## Descrizione
L'applicazione permette all'utente di fare delle richieste tramite software di API development POSTMAN, il quale fornisce i risultati delle nostre richieste in formato JSON.
Lo sviluppo dell'applicazione è stato possibile grazie al sito open-source FACEBOOK FOR DEVELOPERS, che consente di sviluppare metodi per un analisi più dettagliata della propria pagina o profilo utente(tramite token di accesso con le dovute autorizzazioni).
Il codice è stato in seguito sviluppato l'IDE di ECLIPSE in linguaggio JAVA. All'interno del progetto è inoltre presente la Web Application Spring Boot, che permette l'avvio dell'applicazione e, tramite POSTMAN, effettuare alcune richieste(con GET).
Nel dettaglio, l'applicazione permette di:
- [x] Ottenere l'elenco dei post pubblicati
- [x] Ottenere i metadati dei post
- [x] Ottenere statistiche su hashtag(hashtag più e meno usati e quante volte vengono usati, totale degli hashtag usati)
- [x] Ottenere statistiche su emoticons(emoticons più e meno usati e quante volte vengono usati, totale degli emoticons usati)
- [x] Filtri dei post in base alla presenza di un determinato hashtag/emoticon o entrambi
### Diagramma dei casi d'uso
<img src="https://github.com/Alessia2/Progetto/blob/master/UML/NewModel%20Use%20Case%20Diagram.jpg" width="600px" height="420px">

---

## Iniziamo😊
Innanzitutto bisogna munirsi di un account Facebook per accedere a Facebook for Developers. A questo punto è necessario generare il token di accesso, specificando tutti i permessi necessari(*per maggiori dettagli vedere la documentazione di Facebook for Developers https://developers.facebook.com/docs/graph-api/using-graph-api/*).
Successivamente, dopo aver scaricato i software necessari per l'utilizzo (Eclipse, Postman...), bisogna clonare questo repository GitHub, tramite: "clone a repository" --> "URL:https://github.com/Alessia2/Progetto" --> "FINISH". Per poterlo poi visualizzare sul project explorer è necessario proseguire come di seguito: "file" --> "import" --> "projects from GIT" --> "next" --> "existing local repository" --> "next" --> selezionare repository --> "next" --> "finish".
Sostituire poi nel link già presente della classe Facebook Application (riga 24) il proprio token di accesso e id della pagina.
Infine cliccare su run as Spring Boot App e aprire postman. Da quì si potranno effettuare tutte le chiamate precedute da http://localhost:8080.
### Richieste possibili
Tipo | Rotta | Descrizione
---- | ---- | ----
GET | /post | Richiesta elenco dei post sulla pagina
GET | /metadata | Richiesta elenco dei metadati
GET | /statshash | Statistiche sugli hashtag
GET | /statsemoticons | Statistiche sulle emoticons
GET | /filhash | Filtri in base all'hashtag
GET | /filemo | Filtri in base all'emoticon
GET | /FilterDouble | Filtri per emoticons e hashtag
### Filtri possibili
Nome | Operatore | Descrizione
---- | ---- | ----
hashtag | /filhash?param1=hashtag | Post con hashtag passato
emoticon | /filemo?param1=emoticon | Post con emoticon passato
hashtag, emoticon | /FilterDouble?param1=hashtag&param2=emoticon | Post con emoticon e hashtag passati
##### NOTA BENE
Per hashtag scrivere: "#" seguito dalla parola dell'hashtag.
Per le emoticons: copiare l'emoticon da cercare (ad esempio 🐝).

---

## Diagramma delle classi
### Package
<img src="https://github.com/Alessia2/Progetto/blob/master/UML/Class%20Diagram%20PACKAGE.jpg" width="600px" height="420px">

### Application
<img src="https://github.com/Alessia2/Progetto/blob/master/UML/application.FacebookApplication.jpg" width="600px" height="420px"> 

### Service
<img src="https://github.com/Alessia2/Progetto/blob/master/UML/application.service.jpg" width="600px" height="420px">

### Model
<img src="https://github.com/Alessia2/Progetto/blob/master/UML/application.model.jpg" width="600px" height="420px">


