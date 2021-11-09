Feature: Read the text antibacterial

  Scenario: search and validate antibacterial
    Given Initialize browser with chrome
    And Navigate to "https://tide.com/en-us" site
    And click on search tab
    When User enters searchtext
    And close the driver

  Scenario Outline: search and validate antibacterial
    Given Initialize browser with chrome
    And Navigate to "https://tide.com/en-us" site
    And click on search tab
    When User enters <searchtext>
    And close the driver

    Examples: 
      | Antibacterial |