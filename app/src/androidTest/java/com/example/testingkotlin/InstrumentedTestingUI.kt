package com.example.testingkotlin

import android.app.Activity
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@LargeTest
@RunWith(JUnit4::class)
class InstrumentedTestingUI {
    @get: Rule

    val testRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkArithmeticUI() {
        onView(withId(R.id.etFirst))
            .perform(typeText("1"))

        onView(withId(R.id.etSecond))
            .perform(typeText("2"))

        closeSoftKeyboard()

        onView(withId(R.id.btnCalculate))
            .perform(click())

        Thread.sleep(1000)

        onView(withId(R.id.tvResult))
            .check(matches(withText("3")))

////        for intent or activity
//        onView(withId(R.id.tvOutput))
//            .check(matches(isDisplayed()))
    }
}