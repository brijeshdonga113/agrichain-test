Feature: Longest Substring Without Repeating Characters

  As a user
  I want to submit a string input
  So that I can see the length of the longest substring without repeating characters

  Background:
    Given I am on the input page

  Scenario: Submit a valid string "abcabcbb"
    When I enter "abcabcbb" in the input field
    And I click the submit button
    Then I should be redirected to the result page
    And I should see "3" as the result