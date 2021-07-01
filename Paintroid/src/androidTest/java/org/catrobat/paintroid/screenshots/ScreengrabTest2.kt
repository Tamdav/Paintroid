package org.catrobat.paintroid.screenshots


import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.net.Uri
import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.action.ViewActions.click
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.catrobat.paintroid.MainActivity
import org.catrobat.paintroid.test.espresso.util.wrappers.ToolBarViewInteraction
import org.catrobat.paintroid.tools.ToolType
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.junit.*
import org.junit.runner.RunWith
import tools.fastlane.screengrab.Screengrab
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy
import tools.fastlane.screengrab.locale.LocaleUtil
import java.io.File


@LargeTest
@RunWith(AndroidJUnit4::class)
class ScreengrabTest2 {

    @Rule
    @JvmField
    var launchActivityRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setUp(){
        LocaleUtil.changeDeviceLocaleTo(LocaleUtil.getTestLocale());
        Screengrab.setDefaultScreenshotStrategy(UiAutomatorScreenshotStrategy())

    }

    @After
    fun tearDown(){
        LocaleUtil.changeDeviceLocaleTo(LocaleUtil.getEndingLocale())
    }

    @Test
    fun screengrabTest2() {


        ToolBarViewInteraction.onToolBarView().perform(click())
        Screengrab.screenshot("Toolbar")

        ToolBarViewInteraction.onToolBarView().performSelectTool(ToolType.SHAPE)

       /*                val linearLayout = onView(
                   allOf(
                       withId(R.id.pocketpaint_tools_rectangle),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_tools_layout),
                               1
                           ),
                           0
                       ),
                       isDisplayed()
                   )
               )
               linearLayout.perform(click())

               val appCompatImageButton = onView(
                   allOf(
                       withId(R.id.pocketpaint_shapes_circle_btn), withContentDescription("Ellipse"),
                       childAtPosition(
                           allOf(
                               withId(R.id.pocketpaint_shapes_container),
                               childAtPosition(
                                   withClassName(`is`("android.widget.LinearLayout")),
                                   8
                               )
                           ),
                           1
                       )
                   )
               )
               appCompatImageButton.perform(scrollTo(), click())

               val bottomNavigationItemView2 = onView(
                   allOf(
                       withId(R.id.action_color_picker), withContentDescription("Colour"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           2
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView2.perform(click())

               val colorPickerPresetColorButton = onView(
                   allOf(
                       childAtPosition(
                           childAtPosition(
                               withClassName(`is`("android.widget.TableLayout")),
                               3
                           ),
                           3
                       ),
                       isDisplayed()
                   )
               )
               colorPickerPresetColorButton.perform(click())

               val appCompatButton = onView(
                   allOf(
                       withId(android.R.id.button1), withText("Apply"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.buttonPanel),
                               0
                           ),
                           3
                       )
                   )
               )
               appCompatButton.perform(scrollTo(), click())

               val appCompatImageButton2 = onView(
                   allOf(
                       withId(R.id.pocketpaint_btn_top_checkmark), withContentDescription("Checkmark"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_toolbar),
                               1
                           ),
                           2
                       ),
                       isDisplayed()
                   )
               )
               appCompatImageButton2.perform(click())

               val bottomNavigationItemView3 = onView(
                   allOf(
                       withId(R.id.action_current_tool), withContentDescription("Shapes"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           1
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView3.perform(click())

               val bottomNavigationItemView4 = onView(
                   allOf(
                       withId(R.id.action_layers), withContentDescription("Layers"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           3
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView4.perform(click())

               val appCompatImageButton3 = onView(
                   allOf(
                       withId(R.id.pocketpaint_layer_side_nav_button_add),
                       withContentDescription("New layer"),
                       childAtPosition(
                           allOf(
                               withId(R.id.pocketpaint_layer_side_nav_menu),
                               childAtPosition(
                                   withId(R.id.pocketpaint_nav_view_layer),
                                   1
                               )
                           ),
                           1
                       ),
                       isDisplayed()
                   )
               )
               appCompatImageButton3.perform(click())

               val bottomNavigationItemView5 = onView(
                   allOf(
                       withId(R.id.action_layers), withContentDescription("Layers"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           3
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView5.perform(click())

               val bottomNavigationItemView6 = onView(
                   allOf(
                       withId(R.id.action_tools), withContentDescription("Tools"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           0
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView6.perform(click())

               val bottomNavigationItemView7 = onView(
                   allOf(
                       withId(R.id.action_color_picker), withContentDescription("Colour"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           2
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView7.perform(click())

               val colorPickerPresetColorButton2 = onView(
                   allOf(
                       childAtPosition(
                           childAtPosition(
                               withClassName(`is`("android.widget.TableLayout")),
                               4
                           ),
                           0
                       ),
                       isDisplayed()
                   )
               )
               colorPickerPresetColorButton2.perform(click())

               val appCompatButton2 = onView(
                   allOf(
                       withId(android.R.id.button1), withText("Apply"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.buttonPanel),
                               0
                           ),
                           3
                       )
                   )
               )
               appCompatButton2.perform(scrollTo(), click())

               val bottomNavigationItemView8 = onView(
                   allOf(
                       withId(R.id.action_tools), withContentDescription("Tools"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           0
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView8.perform(click())

               val appCompatImageButton4 = onView(
                   allOf(
                       withId(R.id.pocketpaint_btn_top_checkmark), withContentDescription("Checkmark"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_toolbar),
                               1
                           ),
                           2
                       ),
                       isDisplayed()
                   )
               )
               appCompatImageButton4.perform(click())

               val appCompatImageButton5 = onView(
                   allOf(
                       withId(R.id.pocketpaint_btn_top_checkmark), withContentDescription("Checkmark"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_toolbar),
                               1
                           ),
                           2
                       ),
                       isDisplayed()
                   )
               )
               appCompatImageButton5.perform(click())

               val bottomNavigationItemView9 = onView(
                   allOf(
                       withId(R.id.action_tools), withContentDescription("Tools"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           0
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView9.perform(click())

               val linearLayout2 = onView(
                   allOf(
                       withId(R.id.pocketpaint_tools_rectangle),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_tools_layout),
                               1
                           ),
                           0
                       ),
                       isDisplayed()
                   )
               )
               linearLayout2.perform(click())

               val bottomNavigationItemView10 = onView(
                   allOf(
                       withId(R.id.action_current_tool), withContentDescription("Shapes"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           1
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView10.perform(click())

               val bottomNavigationItemView11 = onView(
                   allOf(
                       withId(R.id.action_tools), withContentDescription("Tools"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           0
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView11.perform(click())

               val linearLayout3 = onView(
                   allOf(
                       withId(R.id.pocketpaint_tools_line),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_tools_layout),
                               0
                           ),
                           3
                       ),
                       isDisplayed()
                   )
               )
               linearLayout3.perform(click())

               val bottomNavigationItemView12 = onView(
                   allOf(
                       withId(R.id.action_color_picker), withContentDescription("Colour"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           2
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView12.perform(click())

               val colorPickerPresetColorButton3 = onView(
                   allOf(
                       childAtPosition(
                           childAtPosition(
                               withClassName(`is`("android.widget.TableLayout")),
                               3
                           ),
                           2
                       ),
                       isDisplayed()
                   )
               )
               colorPickerPresetColorButton3.perform(click())

               val appCompatButton3 = onView(
                   allOf(
                       withId(android.R.id.button1), withText("Apply"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.buttonPanel),
                               0
                           ),
                           3
                       )
                   )
               )
               appCompatButton3.perform(scrollTo(), click())

               val bottomNavigationItemView13 = onView(
                   allOf(
                       withId(R.id.action_tools), withContentDescription("Tools"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           0
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView13.perform(click())

               val linearLayout4 = onView(
                   allOf(
                       withId(R.id.pocketpaint_tools_fill),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_tools_layout),
                               1
                           ),
                           1
                       ),
                       isDisplayed()
                   )
               )
               linearLayout4.perform(click())

               val bottomNavigationItemView14 = onView(
                   allOf(
                       withId(R.id.action_layers), withContentDescription("Layers"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           3
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView14.perform(click())

               val bottomNavigationItemView15 = onView(
                   allOf(
                       withId(R.id.action_current_tool), withContentDescription("Fill"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           1
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView15.perform(click())

               val bottomNavigationItemView16 = onView(
                   allOf(
                       withId(R.id.action_layers), withContentDescription("Layers"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           3
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView16.perform(click())

               val linearLayout5 = onView(
                   allOf(
                       withId(R.id.pocketpaint_item_layer_background),
                       withParent(
                           allOf(
                               withId(R.id.pocketpaint_layer_side_nav_list),
                               withParent(withId(R.id.pocketpaint_layer_side_nav_menu))
                           )
                       ),
                       isDisplayed()
                   )
               )
               linearLayout5.check(matches(isDisplayed()))

               val bottomNavigationItemView17 = onView(
                   allOf(
                       withId(R.id.action_tools), withContentDescription("Tools"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           0
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView17.perform(click())

               val linearLayout6 = onView(
                   allOf(
                       withId(R.id.pocketpaint_tools_import),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_tools_layout),
                               2
                           ),
                           3
                       ),
                       isDisplayed()
                   )
               )
               linearLayout6.perform(click())

               val linearLayout7 = onView(
                   allOf(
                       withId(R.id.pocketpaint_dialog_import_stickers),
                       childAtPosition(
                           childAtPosition(
                               withClassName(`is`("android.widget.ScrollView")),
                               0
                           ),
                           1
                       )
                   )
               )
               linearLayout7.perform(scrollTo(), click())

               val imageButton = onView(
                   allOf(
                       withId(R.id.pocketpaint_btn_top_checkmark), withContentDescription("Checkmark"),
                       withParent(withParent(withId(R.id.pocketpaint_toolbar))),
                       isDisplayed()
                   )
               )
               imageButton.check(matches(isDisplayed()))

               val appCompatImageButton6 = onView(
                   allOf(
                       withId(R.id.pocketpaint_btn_top_checkmark), withContentDescription("Checkmark"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_toolbar),
                               1
                           ),
                           2
                       ),
                       isDisplayed()
                   )
               )
               appCompatImageButton6.perform(click())

               val bottomNavigationItemView18 = onView(
                   allOf(
                       withId(R.id.action_current_tool), withContentDescription("Import Image"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           1
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView18.perform(click())

               val appCompatButton4 = onView(
                   allOf(
                       withId(android.R.id.button2), withText("Cancel"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.buttonPanel),
                               0
                           ),
                           2
                       )
                   )
               )
               appCompatButton4.perform(scrollTo(), click())

               val bottomNavigationItemView19 = onView(
                   allOf(
                       withId(R.id.action_tools), withContentDescription("Tools"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           0
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView19.perform(click())

               val linearLayout8 = onView(
                   allOf(
                       withId(R.id.pocketpaint_tools_transform),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_tools_layout),
                               2
                           ),
                           2
                       ),
                       isDisplayed()
                   )
               )
               linearLayout8.perform(click())

               val appCompatImageButton7 = onView(
                   allOf(
                       withId(R.id.pocketpaint_transform_rotate_right_btn),
                       withContentDescription("rotate right"),
                       childAtPosition(
                           childAtPosition(
                               withClassName(`is`("android.widget.LinearLayout")),
                               8
                           ),
                           1
                       )
                   )
               )
               appCompatImageButton7.perform(scrollTo(), click())

               val appCompatImageButton8 = onView(
                   allOf(
                       withId(R.id.pocketpaint_transform_rotate_left_btn),
                       withContentDescription("rotate left"),
                       childAtPosition(
                           childAtPosition(
                               withClassName(`is`("android.widget.LinearLayout")),
                               8
                           ),
                           0
                       )
                   )
               )
               appCompatImageButton8.perform(scrollTo(), click())

               val appCompatButton5 = onView(
                   allOf(
                       withId(R.id.pocketpaint_transform_apply_resize_btn), withText("Apply"),
                       childAtPosition(
                           childAtPosition(
                               withClassName(`is`("android.widget.LinearLayout")),
                               5
                           ),
                           4
                       )
                   )
               )
               appCompatButton5.perform(scrollTo(), click())

               val bottomNavigationItemView20 = onView(
                   allOf(
                       withId(R.id.action_current_tool), withContentDescription("Transform"),
                       childAtPosition(
                           childAtPosition(
                               withId(R.id.pocketpaint_bottom_navigation),
                               0
                           ),
                           1
                       ),
                       isDisplayed()
                   )
               )
               bottomNavigationItemView20.perform(click())

               val linearLayout9 = onView(
                   allOf(
                       withParent(withParent(withId(R.id.pocketpaint_layout_tool_specific_options))),
                       isDisplayed()
                   )
               )
               linearLayout9.check(matches(isDisplayed()))*/
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }

    private fun createTestImageFile(): Uri {
        val bitmap = Bitmap.createBitmap(7000, 7000, Bitmap.Config.ARGB_8888)
        with(Canvas(bitmap)) {
            drawColor(Color.BLACK)
            drawBitmap(bitmap, 0f, 0f, null)
        }
        val imageFile = File(launchActivityRule.activity.getExternalFilesDir(null)!!.absolutePath, "loadImage.jpg")
        val imageUri = Uri.fromFile(imageFile)
        launchActivityRule.activity.myContentResolver.openOutputStream((imageUri)).use { fos ->
            Assert.assertTrue(bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos))
        }

        return imageUri
    }
}
