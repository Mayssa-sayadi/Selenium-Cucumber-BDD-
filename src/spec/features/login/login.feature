#language: en
@login @tr
Feature: Je Souhaite Tester La Page Login de l'application Web Demo Shop

@login_validCredentials
Scenario: Je Souhaite Tester la Page Login avec Des Données Valides

Given Je me connecte sur le site Web Demo Shop
When Je clique sur le bouton Log in
And Je saisis une adresse mail
And Je saisis un mot de passe
And Je clique sur le bouton Login
Then Je me redirige vers la page home "ziedhannachi0@gmail.com"