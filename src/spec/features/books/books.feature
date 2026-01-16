#langage:en
@books @tr
Feature: Ajouter un livre dans le panier

Background:

Given Je me connecte sur le site Web Demo Shop
And  Je clique sur le bouton Log in
And Je saisis une adresse mail
And Je saisis un mot de passe
And Je clique sur le bouton Login

@books_addToCartViaBarMenuAndVerifyTheConfirmationMessage
Scenario: Ajouter un livre à partir du menu principal
When  Je clique sur la section Books
And Je suis redirigé vers la page des livres
And Je choisis un livre en cliquant sur Add to cart
Then Un message s'affiche en haut de la page "The product has been added to your shopping cart"

@books_addToCartViaSearchFieldAndVerifyTheCart
Scenario: Ajouter un livre à partir de la barre de recherche
When  Je ecrire le nom de livre dans la barre de recherche
And Je clique sur le button rechercher
And Je clique sur add to cart
And Un message s'affiche en haut de la page "The product has been added to your shopping cart"
Then  Je clique sur le panier
And Le livre apparaît dans le panier
And La quantité du livre est "1"
