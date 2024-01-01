package com.example.anotoapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.junit.Rule
import org.junit.Test


class MainActivityBottomNavigationTest {

    @get:Rule
    var activityRule = ActivityScenarioRule(
        MainActivity::class.java
    )

    @Test
    fun testBottomNavigation() {
        runBlocking {

            delay(2000)
            onView(withId(R.id.frameLayout)).check(matches(isDisplayed()))

            // home
            onView(withId(R.id.home))
                .perform(click())
            delay(1000)

            //task
            onView(withId(R.id.frameLayout)).check(matches(isDisplayed()))
            onView(withId(R.id.task))
                .perform(click())
            delay(1000)

            //profile
            onView(withId(R.id.frameLayout)).check(matches(isDisplayed()))
            onView(withId(R.id.profile))
                .perform(click())
            delay(1000)

            onView(withId(R.id.frameLayout)).check(matches(isDisplayed()))
        }
    }
}