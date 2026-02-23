#langage:en
@Register
Feature: Créer un compte utilisateur

Background:
Given Je me connecte sur le site Web Demo Shop
@RegisterWithValidCredentials
Scenario: créer un compte utilisateur avec des valides données

When Je saisis les valides données
Then Un message de succès d’inscription s’affiche "Your registration completed"

@RegisterWithInvalidCredentials
Scenario: créer un compte utilisateur avec un mail existant

When Je saisis les données avec un mail existant
Then Un message d'alerte s’affiche "The specified email already exists"