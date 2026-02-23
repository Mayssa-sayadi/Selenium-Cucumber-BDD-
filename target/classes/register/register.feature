#langage:en
@Register
Feature: Créer un compte utilisateur

Background:
Given Je me connecte sur le site Web Demo Shop

Scenario: créer un compte utilisateur avec des valides données

When Je saisis les valides données
Then Un message de succès d’inscription s’affiche "Your registration completed"
