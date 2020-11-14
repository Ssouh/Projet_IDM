## Projet_IDM 
# Projet de modélisation des Meta-modele SIMPLEPDL et PETRINET

# Imad Abakarim

# Souhail Amghar

## Département Sciences Numériques - Deuxième année

## Novembre 2020


## Table des matières


- 1 Introduction
- 2 Description des modèles de processus
- 3 Définition des méta-modèles avec Ecore
   - 3.1 Définition des méta-modèles avec Ecore pour SimplePDL
   - 3.2 Définition des méta-modèles avec Ecore pour PetriNet
- 4 Définitions de la sémantique statique avec OCL
   - 4.1 Définitions de la sémantique statique avec OCL pour SimplePDL
   - 4.2 de la sémantique statique avec OCL pour le réseau Petri
- 5 Syntaxe concrète de SimplePDL
   - 5.1 Syntaxe concrète textuelle
   - 5.2 Syntaxe concrète graphique
- 6 Définition de la transformation modèle à modèle (M2M)
   - 6.1 Transformation modèle à modèle avec Java
   - 6.2 Transformation modèle à modèle avec ATL
- 7 Définition de la transformation modèle à texte (M2T)
- 8 Validation de la transformation SimplePDL2PetriNet
- 9 Conclusion
- 1 Exemple d’un modèle de processus Table des figures
- 2 Modèle SimplePDL
- 3 Méta-modèle SimplePDL
- 4 Architecture SimplePDL
- 5 Exemple d’un réseau Petri
- 6 Méta-modèle Petri
- 7 Architecture du réseau Petri
- 8 Syntaxe textuelle de Process
- 9 Syntaxe textuelle d’une activité
- 10 Syntaxe textuelle d’une dépendance, guidance et ressource
- 11 Syntaxe textuelle d’un paramètre
- 12 L’éditeur graphique Siruis
- 13 Syntaxe graphique du modèle étudié
- 14 Architecture de la transformation M2M avec Java
- 15 Exemple d’un modèle SimplePDL
- 16 Résultat de la transformation avec Java
- 17 Exemple d’un modèle SimplePDL
- 18 Résultat de la transformation avec ATL
- 19 L’architecture de la transformation M2T
- 20 Syntaxe graphique de la transformation M2T
- 21 Syntaxe textuelle de la transformation M2T
- 22 Architecture LTL
- 23 Les propriétés LTL pour vérifier la terminaison
- 24 Les propriétés LTL correspondant aux invariants


## 1 Introduction

L’objectif de mini-projet est de produire une chaîne de vérification des mo-
dèles de processus SimplePDL afin de vérifier leur cohérence. Pour cela, nous
utilisons les outils demodel-checkingdéfinis sur les réseaux Petri en utilisant la
boîte à outil Tina. Il nous faudra donc traduire un modèle de processus en un
réseau de Petri. Le travail se fera suivant les étapes suivantes :

1. Définition des méta-modèles avec Ecore.
2. Définition de la sémantique statique avec OCL (Complete OCL).
3. Utilisation de l’infrastructure fournie par EMF pour manipuler les mo-
    dèles.
4. Définition de transformations modèle à texte (M2T) avec Acceleo, par
    exemple pour engendrer la syntaxe attendue par Tina à partir d’un modèle
    de réseau de Petri ou engendrer les propriétés LTL à partir d’un modèle
    de processus.
5. Définition d’une transformation de modèle à modèle (M2M) avec EMF/Java
    et avec ATL.
6. Définition de syntaxes concrètes textuelles avec Xtext.
7. Définition de syntaxes concrètes graphiques avec Sirius.

## 2 Description des modèles de processus

Dans la figure 1, on donne un exemple de processus qui comprend quatre acti-
vités : Conception, RédactionDoc, Programmation et RédactionTests, et quatre
dépendances : startToStart, startToFinish, finishToStart et finishToFinish. Les
ellipses représentent les activités, est arcs représentent les dépendances.

```
Figure1 – Exemple d’un modèle de processus
```
## 3 Définition des méta-modèles avec Ecore

### 3.1 Définition des méta-modèles avec Ecore pour SimplePDL

### plePDL

On définit le modèle SimplePDL avec quatre activités (Conception, Rédac-
tionDoc, Programmation et RédactionTests), quatre dépendances (startToStart,


startToFinish, finishToStart et finishToFinish), les ressources, leurs paramètres
et guidance (commentaires).

```
Figure2 – Modèle SimplePDL
```
On visualise le modèle SimplePDL, et on obtient le méta-modèle dans la figure
3.

```
Figure3 – Méta-modèle SimplePDL
```
```
On donne aussi l’architecture du modèle.
```

```
Figure4 – Architecture SimplePDL
```
### 3.2 Définition des méta-modèles avec Ecore pour PetriNet

Un réseau Petri contient 3 éléments : des places, des transitions et des arcs
reliant une place à une transition ou une transition à une place. Chaque place
peut comporter un nombre positif ou nul de jetons.

```
Figure5 – Exemple d’un réseau Petri
```
```
On visualise le méta-modèle Petri, et on obtient le diagramme suivant :
```

```
Figure6 – Méta-modèle Petri
```
```
On donne l’architecture du réseau Petri.
```
```
Figure7 – Architecture du réseau Petri
```
## 4 Définitions de la sémantique statique avec OCL

### 4.1 Définitions de la sémantique statique avec OCL pour SimplePDL

On définit des contraintes OCL pour le méta-modèle simplePDL comme
suit :

```
— Les noms doivent respectés la règle suivante :[A−Za−z_][A−Za−z 0 −
9 _]∗
— Deux activités et deux ressources ne doivent pas avoir le même nom.
```

```
— Une activité ne doit pas dépendre d’elle même.
— La taille du nom d’une activité doit dépasser un caractère.
— Le nombre d’occurrence et la quantité des ressources doivent être positifs.
```
### 4.2 de la sémantique statique avec OCL pour le réseau Petri

A fin de de vérifier le bon fonctionnement du réseau Petri, on a définit des
contraintes OCL qui doivent être vérifier avant. Les contraintes définies sont :

```
— Deux noeuds différents ne doivent pas avoir le même nom.
— Un arc ne doit jamais relier deux noeuds de même type.
— Le nombre de jetons dans une place doit être toujours positif ou nul.
```
## 5 Syntaxe concrète de SimplePDL

La syntaxe abstraite d’un DSML exprimée en Ecore ne peut pas être mani-
pulé directement. Ainsi, on définit des syntaxes concrètes associée à la syntaxe
abstraite pour faciliter la construction et la modification des modèles. Ces syn-
taxes peuvent être textuelles ou graphiques.

### 5.1 Syntaxe concrète textuelle

En utilisant l’outil Xtext, on définit une syntaxe concrète textuelle de Sim-
plePDL avec Xtext. Pour chaque élément du modèle, on lui définit une gram-
maire qui peut être analysée en LL(k), ainsi on génère le méta-modèle Sim-
plePDL étudié.

```
Figure8 – Syntaxe textuelle de Process
```
```
Figure9 – Syntaxe textuelle d’une activité
```

```
Figure10 – Syntaxe textuelle d’une dépendance, guidance et ressource
```
```
Figure11 – Syntaxe textuelle d’un paramètre
```
### 5.2 Syntaxe concrète graphique

A l’instar de la syntaxe concrète textuelle, on peut définir une syntaxe
concrète graphique pour visualiser ou éditer le modèle étudié. Pour cela, nous
avons utilisé l’outil Siruis fournit par Eclipse.


```
Figure12 – L’éditeur graphique Siruis
```
La syntaxe concrète graphique du modèle SimplePDL étudié est dans la figure
ci-dessous.

```
Figure13 – Syntaxe graphique du modèle étudié
```
## 6 Définition de la transformation modèle à modèle (M2M)

## dèle (M2M)

Dans cette partie, nous avons défini des transformations du modèle Sim-
plePDL vers le réseau Petri. Pour cela, nous avons utilisé deux langages, Java
et ATL.


### 6.1 Transformation modèle à modèle avec Java

```
Figure14 – Architecture de la transformation M2M avec Java
```
En utilisant le langage Java, nous avons défini la transformation SimplePDL
au réseau Petri. Pour tester le programme, nous avons créé un modèle simple
comme ci dessous.


```
Figure15 – Exemple d’un modèle SimplePDL
```
En appliquant la transformation en un réseau de Petri avec Java, nous obte-
nons le résultat suivant :


```
Figure16 – Résultat de la transformation avec Java
```
### 6.2 Transformation modèle à modèle avec ATL

A l’instar de la transformation M2M avec Java, on défini une transformation
d’un modèle SimplePDL à Petri en utilisant le langage ATL. Pour tester l’effica-
cité du programme, nous avons défini un exemple de modèle comme ci-dessous.


```
Figure17 – Exemple d’un modèle SimplePDL
```
En appliquant la transformation en un réseau de Petri avec ATL, nous ob-
tenons le résultat suivant :


```
Figure18 – Résultat de la transformation avec ATL
```
## 7 Définition de la transformation modèle à texte (M2T)

Nous définissons une transformation modèle à texte avec l’outil Acceleo du
réseau Petri vers Tina. Nous commençons par créer un fichier HTML à partir
du modèle SimplePDL. Ensuite, nous obtenons le fichiertoHTML.mtl.


```
Figure19 – L’architecture de la transformation M2T
```
Le principe d’Acceleo est de s’appuyer sur des gabarits (templates) des fichiers
à engendrer. Le template se trouve dans le fichiertoHTML.mtl. La figure 20
illustre le résultat obtenu par la transformation.

```
Figure20 – Syntaxe graphique de la transformation M2T
```

```
La syntaxe textuelle de ce résultat est dans la figure 21.
```
```
Figure21 – Syntaxe textuelle de la transformation M2T
```
## 8 Validation de la transformation SimplePDL2PetriNet

Pour permettre la vérification de la transformation SimplePDL2PetriNet,
TINA dispose d’unmodel-checkerpour la logique temporelle LTL (Linear Time
Logic). Cette logique permet d’exprimer des propriétés caractéristiques de la
transformation et les vérifier.

```
Figure22 – Architecture LTL
```
Tout d’abord, nous avons engendré les propriétés LTL pour vérifier la termi-
naison sur les modèles de processus. Nous remarquons la validation de toutes
les propriétés définies.


```
Figure23 – Les propriétés LTL pour vérifier la terminaison
```
Ensuite, nous avons engendré des propriétés LTL correspondant aux inva-
riants pour valider la transformation SimplePDL vers le réseau Petri.

```
Figure24 – Les propriétés LTL correspondant aux invariants
```
Nous remarquons que la dernière propriété n’est pas vérifié, c’est propriété
qui vérifie si le processus termine ou pas. Cette propriété ne doit pas être vérifiée
parce que le processus va terminer dans un temps.

## 9 Conclusion

Ce mini-projet nous a beaucoup intéressé car il nous a permit de consolider
nos compétences en tout ce qui concerne la modélisation des transformations
classiques. Toutefois, l’utilisation d’Eclipse nous a posé des problèmes avec ses
bugs récurrent.


