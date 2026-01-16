#language: en
@logout
Feature: Logout utilisateur

Background:
Given Je me connecte sur le site Web Demo Shop
When Je clique sur le bouton Log in
And Je saisis une adresse mail
And Je saisis un mot de passe
And Je clique sur le bouton Login

Scenario: Déconnexion réussie de l’utilisateur

And Je clique sur le bouton Log out
Then Je suis deconnectée "Log in"