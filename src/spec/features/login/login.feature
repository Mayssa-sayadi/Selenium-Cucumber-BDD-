#language: en
@login @tr 
Feature: Je Souhaite Tester La Page Login de l'application Web Demo Shop

Background:
Given Je me connecte sur le site Web Demo Shop
When Je clique sur le bouton Log in

@login_validCredentials
Scenario: Je Souhaite Tester la Page Login avec Des Données Valides
And Je saisis une adresse mail
And Je saisis un mot de passe
And Je clique sur le bouton Login
Then Je me redirige vers la page home "ziedhannachi0@gmail.com"

@login_invalidCredentials
Scenario Outline: Je souhaite tester la page login avec des données invalides
And Je saisis une adresse mail "<email>"
And Je saisis un mot de passe "<password>"
And Je clique sur le bouton Login
Then Je visualise un message d'erreur "<message_error>"

Examples:
|email            |password |message_error|
|yassera@gmail.com|yasser123|Login was unsuccessful. Please correct the errors and try again.|
|kawtar2@gmail.com|kawtar123|Login was unsuccessful. Please correct the errors and try again.|
|mayssa0@gmail.com|mayssa000|Login was unsuccessful. Please correct the errors and try again.|

