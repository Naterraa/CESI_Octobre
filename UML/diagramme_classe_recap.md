### Exercice

Réaliser le diagramme de classe correspondant

Le propriétaire d’une petite entreprise de livraison envisage de se doter d’un système d’information lui permettant d’enregistrer les données relatives à ses clients et à ses livraisons. Après avoir étudié le problème pendant un certain temps, il est parvenu aux exigences suivantes :

Chaque client a un numéro de TVA, un nom, un numéro de téléphone et une adresse. Il n’y a pas deux clients ayant le même numéro de TVA.
Lorsqu’un client souhaite envoyer un colis à un autre client, il lui suffit de se connecter au site web de l’entreprise, de sélectionner le client auquel il souhaite envoyer le colis, d’indiquer le poids du colis et de préciser s’il s’agit d’une livraison normale ou urgente. Il reçoit alors un code d’identification unique qu’il inscrit sur le colis.
Le colis est ensuite livré par le client au centre de livraison de son choix. Un centre de livraison a un nom et une adresse uniques.
Chaque client a un centre de livraison associé. Ce centre de livraison est choisi par l’entreprise et c’est normalement celui qui est le plus proche de la maison du client.
Le colis est ensuite acheminé par un système interne jusqu’au centre de livraison du destinataire.
Le colis est alors remis en main propre au destinataire par un coursier depuis le centre de livraison.
Les coursiers ont un numéro de TVA unique, un nom et un numéro de téléphone. Chaque coursier travaille dans un seul centre de livraison.
Un coursier est affecté à un paquet dès que celui-ci est introduit dans le système