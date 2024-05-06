package com.example.caitlynjeniker_a2_st10456573


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SecondPageTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(secondPage::class.java)

    @Test
    fun testFeedButtonClick() {
        onView(withId(R.id.FeedBtn)).perform(click())
        onView(withId(R.id.FeedBtn)).check(matches(withDrawable(R.drawable.dog_eating)))
        onView(withId(R.id.feedCount)).check(matches(withText("1")))
    }

    @Test
    fun testPlayButtonClick() {
        onView(withId(R.id.PlayBtn)).perform(click())
        onView(withId(R.id.PlayBtn)).check(matches(withDrawable(R.drawable.dog_playing)))
        onView(withId(R.id.playCount)).check(matches(withText("1")))
    }

    @Test
    fun testCleanButtonClick() {
        onView(withId(R.id.CleanBtn)).perform(click())
        onView(withId(R.id.CleanBtn)).check(matches(withDrawable(R.drawable.dog_washing)))
        onView(withId(R.id.cleanCount)).check(matches(withText("1")))
    }

    // Custom matcher to check if ImageView has the correct drawable resource
    private fun withDrawable(resourceId: Int) = object : TypeSafeMatcher<View>() {
        override fun describeTo(description: org.hamcrest.Description?) {
            description?.appendText("with drawable from resource id: ")
            description?.appendValue(resourceId)
        }

        override fun matchesSafely(item: View?): Boolean {
            if (item !is ImageView) return false
            return item.context.getDrawable(resourceId)?.constantState == item.drawable.constantState
        }
    }
}
