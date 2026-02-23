#langage:en
@newsletter
Feature: je veux tester le Sign up pour le newsletter

Background:
Given Je me connecte sur le site Web Demo Shop

Scenario: je veux tester le Sign up pour le newslette
When Je saisais une adresse mail
And Je clique sur le button Subsribe
Then Un message de confirmation s'affiche "Thank you for signing up! A verification email has been sent. We appreciate your interest."