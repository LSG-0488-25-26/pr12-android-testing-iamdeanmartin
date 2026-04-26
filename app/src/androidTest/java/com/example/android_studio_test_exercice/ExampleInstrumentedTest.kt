package com.example.android_studio_test_exercice

import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.assertIsOff
import androidx.compose.ui.test.assertIsOn
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@LargeTest
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test

    fun checkInitialComposableValues() {
        composeTestRule.onNodeWithTag("estatSwitch_id").assertIsOn()
        composeTestRule.onNodeWithTag("carnivorCheckbox_id").assertIsOn()
        composeTestRule.onNodeWithTag("carnivorCheckbox_id").assertIsNotEnabled()
        composeTestRule.onNodeWithTag("vegetariaCheckbox_id").assertIsOff()
        composeTestRule.onNodeWithTag("vegetariaCheckbox_id").assertIsEnabled()
        composeTestRule.onNodeWithTag("vegaCheckbox_id").assertIsOff()
        composeTestRule.onNodeWithTag("vegaCheckbox_id").assertIsEnabled()
        composeTestRule.onNodeWithTag("dropdownText_id").assertTextEquals("Opció A")
        composeTestRule.onNodeWithTag("toggleButton_id").assert(hasClickAction())
    }

    @Test
    fun checkSwitchInteraction() {
        composeTestRule.onNodeWithTag("estatSwitch_id").assertIsOn()
        composeTestRule.onNodeWithTag("estatSwitch_id").performClick()
        composeTestRule.onNodeWithTag("estatSwitch_id").assertIsOff()
    }

    @Test
    fun checkVegetariaCheckboxInteraction() {
        composeTestRule.onNodeWithTag("vegetariaCheckbox_id").assertIsOff()
        composeTestRule.onNodeWithTag("vegetariaCheckbox_id").performClick()
        composeTestRule.onNodeWithTag("vegetariaCheckbox_id").assertIsOn()
    }

    @Test
    fun checkVegaCheckboxInteraction() {
        composeTestRule.onNodeWithTag("vegaCheckbox_id").assertIsOff()
        composeTestRule.onNodeWithTag("vegaCheckbox_id").performClick()
        composeTestRule.onNodeWithTag("vegaCheckbox_id").assertIsOn()
    }

    @Test
    fun checkCarnivorCheckboxIsDisabled() {
        composeTestRule.onNodeWithTag("carnivorCheckbox_id").assertIsNotEnabled()
    }

    @Test
    fun checkTriStateCheckboxInteraction() {
        composeTestRule.onNodeWithTag("triStateCheckbox_id").performClick()
        composeTestRule.onNodeWithTag("triStateCheckbox_id").performClick()
        composeTestRule.onNodeWithTag("triStateCheckbox_id").performClick()
        composeTestRule.onNodeWithTag("triStateCheckbox_id").assertIsOff()
    }

    @Test
    fun checkRadioButtonInteraction() {
        composeTestRule.onNodeWithTag("radioButton_Lamine Yamal_id").assertExists()
        composeTestRule.onNodeWithTag("radioButton_Lamine Yamal_id").performClick()
        composeTestRule.onNodeWithTag("radioButton_Lamine Yamal_id").assertIsSelected()
    }

    @Test
    fun checkDropdownInteraction() {
        composeTestRule.onNodeWithTag("dropdownText_id").assertTextEquals("Opció A")
        composeTestRule.onNodeWithTag("dropdownText_id").performClick()
        composeTestRule.onNodeWithText("Opció B").performClick()
        composeTestRule.onNodeWithTag("dropdownText_id").assertTextEquals("Opció B")
    }

    @Test
    fun checkSearchTextFieldInteraction() {
        composeTestRule.onNodeWithTag("searchTextField_id").performTextInput("pizza")
        composeTestRule.onNodeWithTag("searchTextField_id").assertTextContains("pizza")
    }

    @Test
    fun checkSearchButtonShowsSnackbar() {
        composeTestRule.onNodeWithTag("searchButton_id").performClick()
        composeTestRule.onNodeWithTag("snackbarText_id").assertIsDisplayed()
        composeTestRule.onNodeWithTag("snackbarText_id").assertTextEquals("Acció completada!")
    }

    @Test
    fun checkToggleButtonInteraction() {
        composeTestRule.onNodeWithText("Desactivat").assertIsDisplayed()
        composeTestRule.onNodeWithTag("toggleButton_id").performClick()
        composeTestRule.onNodeWithText("Activat").assertIsDisplayed()
    }
}