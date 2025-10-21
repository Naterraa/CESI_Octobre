### Contexte 

La ville de La Rochelle souhaite moderniser la gestion de ses parkings publics à travers une solution numérique innovante appelée SmartParking.
Ce système a pour but de faciliter la recherche, la réservation et le paiement des places de stationnement, tout en optimisant l’occupation des parkings existants.

Actuellement, les automobilistes perdent beaucoup de temps à chercher une place libre, ce qui provoque des embouteillages, du stress et une surconsommation de carburant.
De leur côté, les gestionnaires de parkings manquent de visibilité sur le taux d’occupation en temps réel et rencontrent des difficultés à contrôler les accès ou à automatiser les paiements.

Le projet SmartParking proposera une application mobile et un système embarqué connecté pour gérer le stationnement de bout en bout.
L’automobiliste pourra consulter les parkings disponibles à proximité, réserver une place avant son arrivée, et payer directement via l’application.
À l’entrée du parking, un capteur ou une barrière intelligente identifiera automatiquement le véhicule grâce à sa plaque d’immatriculation ou un QR code généré par l’application.
Une fois la session terminée, le système calculera automatiquement la durée de stationnement et débitera le montant correspondant.

Le gestionnaire du parking disposera quant à lui d’une interface web d’administration lui permettant de :

- consulter les statistiques d’occupation,
- gérer les abonnés,
- configurer les tarifs
- surveiller les équipements connectés (capteurs, bornes, barrières).

L’objectif global du projet est de proposer un service fluide, automatisé et sécurisé, réduisant le temps de recherche de stationnement tout en améliorant la gestion opérationnelle des parkings urbains.


### Partie 1 - Diagramme de cas d'utilisation (30 min)

Dans le cadre du projet SmartParking, la ville de La Rochelle a organisé plusieurs ateliers de travail avec les futurs utilisateurs, automobilistes, gestionnaires de parkings et services techniques afin d’identifier les principaux scénarios d’utilisation du système.

À l’issue de ces échanges, deux scénarios prioritaires ont été retenus pour cette première phase du projet.
Ces deux cas représentent les situations les plus fréquentes et les plus critiques pour la réussite du système.

- Scénario 1 : Réserver et utiliser une place de parking

Un automobiliste souhaite trouver une place libre avant d’arriver à destination.
Depuis l’application SmartParking, il consulte la liste des parkings disponibles à proximité, visualise le nombre de places libres et choisit l’un d’eux.
Il réserve une place pour une durée estimée, puis reçoit une confirmation de réservation avec un QR code ou un identifiant de plaque.
À son arrivée, la barrière intelligente reconnaît la plaque d’immatriculation et s’ouvre automatiquement.
À la sortie, la durée réelle de stationnement est calculée et le paiement est débité automatiquement via le moyen enregistré dans l’application.
L’utilisateur reçoit un reçu électronique et une notification de fin de session.

- Scénario 2 : Gérer le parking via l’interface administrateur

Le gestionnaire de parking utilise l’interface web d’administration pour surveiller l’état du parking en temps réel.
Il peut consulter le taux d’occupation, la liste des réservations en cours, ainsi que les alertes techniques provenant des capteurs.
Il a également la possibilité de modifier les tarifs, d’ajouter ou de supprimer des abonnés, et de générer des rapports statistiques (taux de rotation, durée moyenne de stationnement, revenus journaliers).
En cas d’anomalie détectée (capteur défectueux, barrière bloquée, incident de paiement), il peut envoyer une demande d’intervention au service technique.

Pour ces deux scénarios : 

1. Identifiez les acteurs impliqués
2. Représentez le tout dans deux diagrammes de cas d'utilisation UML distinct (un pour chaque scénario)

### Partie 2 - Diagramme de séquence (35 min)

Parmi les deux scénarios précédemment identifiés, la ville de La Rochelle a jugé que le Scénario 1 était le plus critique pour la réussite du projet SmartParking.
Ce scénario constitue le cœur fonctionnel du système : c’est celui qui relie directement l’expérience utilisateur (l’automobiliste) à l’infrastructure connectée (barrières, capteurs, application, paiement).

L’équipe projet doit donc produire un diagramme de séquence UML détaillant l’enchaînement des interactions entre les acteurs et les composants du système lors d’une réservation et de l’utilisation d’une place de parking.

Voici le descriptif du scénario sur lequel se baser :

- L’automobiliste ouvre l’application SmartParking et recherche un parking disponible à proximité.
- L’application envoie une requête au serveur central, qui interroge la base de données des parkings.
- Le serveur retourne la liste des parkings et leur taux d’occupation en temps réel (grâce aux capteurs connectés).
- L’utilisateur sélectionne un parking et lance une demande de réservation pour une durée donnée.
- Le système de réservation vérifie la disponibilité et confirme la réservation, tout en générant un identifiant unique (QR code ou plaque d’immatriculation).
- L’application affiche un message de confirmation avec le QR code.
- À l’arrivée du véhicule, la barrière intelligente lit la plaque (ou le QR code via un capteur) et demande l’autorisation d’accès au serveur SmartParking.
- Le serveur vérifie la validité de la réservation et, si tout est conforme, déverrouille la barrière.
- Pendant le stationnement, le capteur de place envoie au serveur l’état "occupé".
- Lors de la sortie, la barrière détecte le départ du véhicule et calcule automatiquement la durée réelle de stationnement.
- Le serveur génère le montant à payer et déclenche le paiement automatique via le module de paiement (carte enregistrée).
- Une confirmation de paiement est envoyée à l’application mobile, qui affiche un reçu électronique et envoie une notification de fin de session.

À partir de ce descriptif : 

1. Identifiez les objets ou acteurs impliqués dans ce scénario.
2. Réalisez le diagramme de séquence correspondant qui représente les échanges de messages entre ces entités dans l'ordre chronologique. Mettre en évidence au moins une condition d'une vérification clé (par exemple : disponibilité, paiement réussi...)


### Partie 3  - Diagramme de classe (45 min)

À ce stade du projet SmartParking, après avoir décrit les scénarios d’utilisation et modélisé les interactions dynamiques du système,
la ville de La Rochelle souhaite maintenant obtenir une vue statique de la structure du système : les entités principales, leurs attributs, et les liens qui les unissent.

L’objectif est de concevoir un diagramme de classes UML qui servira de base à la conception de la base de données et du code applicatif.
Ce modèle doit permettre de représenter les informations nécessaires à la gestion complète du processus de réservation et d’utilisation d’une place de parking.

- Description fonctionnelle :

Le système SmartParking gère plusieurs parkings, chacun composé de places de stationnement équipées de capteurs connectés permettant de connaître leur état (libre, occupée, en maintenance).
Un parking possède une adresse, une capacité totale et un tarif horaire configurable.

Les utilisateurs du système sont principalement les automobilistes, qui disposent d’un compte dans l’application mobile.
Chaque utilisateur peut réserver une place pour une durée donnée, payer son stationnement via un moyen de paiement enregistré, et consulter l’historique de ses réservations.

Une réservation est toujours associée :

- à un utilisateur,
- à une place de parking précise,
- à une date/heure de début et une date/heure de fin prévue,
- à un statut (en attente, confirmée, en cours, terminée).

Le module de paiement gère les transactions associées à chaque réservation, en précisant :

- le montant calculé selon la durée réelle
- le moyen de paiement utilisé
- la date de paiement
- le statut de la transaction (réussie, échouée, en attente)

Enfin, le gestionnaire de parking peut consulter et modifier les informations relatives aux parkings, aux tarifs et aux statistiques d’occupation.

À partir de cette description : 

1. Identifiez les classes principales nécessaires au système SmartParking
2. Définissez pour chacune attributs essentiels et opérations principales
3. Etablissez les associations et multiplicités entre les classes (un utilisateur peut par exemple avoir plusieurs réservation)
4. Représentez le tout dans un diagramme de classe UML complet