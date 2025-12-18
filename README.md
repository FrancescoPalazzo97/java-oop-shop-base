# EX Java OOP Shop

## Consegna

**Repo:** `java-oop-shop-base`

Nel progetto java-oop-shop, package `org.lessons.java.shop`, creare la classe `Prodotto` che gestisce i prodotti dello shop. 

Un prodotto è caratterizzato da:

- codice (numero intero)
- nome
- descrizione
- prezzo
- iva

Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:

- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base 
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

Nello stesso package aggiungete una classe `Main` con metodo `main` nella quale testate tutte le funzionalità della classe `Prodotto`.

---

## Nuova consegna (Incapsulamento)

Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di "utilità" per fare in modo che:

- esistano almeno due costruttori diversi
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura

**Snack 1: Studente**

Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).

---

**Snack 2: Gestione di un Conto**

Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.

---

**Snack 3: Registro Studenti**

Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array privato per memorizzare oggetti Studente (creati nello Snack 1). Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. Aggiungi un metodo che stampi la lista degli studenti, senza utilizzare metodi helper.

---

# EX Java OOP Inheritance Shop

## Consegna

**Repo:** java-inheritance-shop

Creare la classe Prodotto che gestisce i prodotti dello shop. 

Un prodotto è caratterizzato da:

- codice (numero intero)
- nome
- marca
- prezzo
- iva

Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:

- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura

Lo shop gestisce diversi tipi di prodotto: 

- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate

Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.