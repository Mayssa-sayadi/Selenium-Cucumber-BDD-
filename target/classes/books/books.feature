#langage:en
@books @tr
Feature: Ajouter un livre dans le panier et faire le checkout

Background:

Given Je me connecte sur le site Web Demo Shop
And  Je clique sur le bouton Log in
And Je saisis une adresse mail
And Je saisis un mot de passe
And Je clique sur le bouton Login

@books_SearchBookViaBarMenu
Scenario: Ajouter un livre à partir du menu principal
  When Je clique sur la section Books
  And Je sélectionne le livre "Computing and Internet"
  And Je clique sur Add to cart
  Then Le message "The product has been added to your shopping cart" doit être affiché

@books_SearchBookViaSearchField
Scenario: Ajouter un livre à partir de la barre de recherche
  When Je saisis "Computing and Internet" dans la barre de recherche
  And Je clique sur le bouton Rechercher
  And Je sélectionne le livre "Computing and Internet"
  And Je clique sur Add to cart
 Then Le message "The product has been added to your shopping cart" doit être affiché

@books_ValidCheckout
Scenario: faire le checkout en succées
  When Je clique sur la section Books
  And Je sélectionne le livre "Computing and Internet"
  And Je clique sur Add to cart
  Then Le message "The product has been added to your shopping cart" doit être affiché
  
  When je click sur le boutton shopping cart
  And je me dirige vers la page du shopping cart
  
  When Je coche sur la case accept terms of use
  And Je clique sur le boutton checkout
 
  And Je saisis une Nouvelle addresse de facturation
  And Je click sur le boutton continue pour addresse de facturation

  And Je choisis une addresse de residence existante
  And Je click sur le boutton continue pour addresse de residence

  And Je choisis la methode de livraison Ground
  And Je click sur le boutton continue pour la methode de livraison

  And Je choisis une methode de paiement Cash on delivery
  And Je click sur le boutton continue pour methode de paiement

  Then Je vois un message du mon choix de methode de paiement
  And  Je click sur le boutton continue le message du mon choix

  And Le récapitulatif de la commande doit être affiché
  And  Je click sur le boutton confirm
  Then Le message de confirmation de commande doit être affiché "Your order has been successfully processed!"
