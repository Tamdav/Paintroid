package org.catrobat.paintroid.screenshots


import android.Manifest
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.rule.GrantPermissionRule
import androidx.test.runner.AndroidJUnit4
import org.catrobat.paintroid.MainActivity
import org.hamcrest.Matchers.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import tools.fastlane.screengrab.locale.LocaleTestRule


@LargeTest
@RunWith(AndroidJUnit4::class)
class ScreengrabTest {

    @Rule
    var mRuntimePermissionRule = GrantPermissionRule.grant(Manifest.permission.CHANGE_CONFIGURATION)

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Rule @JvmField
    val localeTestRule = LocaleTestRule()

    @Before
    fun setUp() {
        Thread.sleep(3_000)
    }

    /*  @Test
    fun screengrabTest() {
         val bottomNavigationItemView = onView(
             allOf(
                 withId(R.id.pocketpaint_bottom_navigation), withContentDescription("Tools"),
                 isDisplayed()
             )
         )
         bottomNavigationItemView.perform(closeSoftKeyboard())
         bottomNavigationItemView.perform(click())

         val tableLayout = onView(
             allOf(
                 withId(R.id.pocketpaint_tools_layout),
                 withParent(
                     allOf(
                         withId(R.id.pocketpaint_main_bottom_bar),
                         withParent(withId(R.id.pocketpaint_main_layout))
                     )
                 ),
                 isDisplayed()
             )
         )
         tableLayout.check(matches(isDisplayed()))
         Screengrab.screenshot("Screenshot 1")

         val linearLayout = onView(
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
         linearLayout.perform(click())

         val linearLayout2 = onView(
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
         linearLayout2.perform(scrollTo(), click())

         val appCompatImageButton = onView(
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
         appCompatImageButton.perform(click())

         val bottomNavigationItemView2 = onView(
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
         bottomNavigationItemView2.perform(click())

         val appCompatImageButton2 = onView(
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
         appCompatImageButton2.perform(click())

         val bottomNavigationItemView3 = onView(
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
         bottomNavigationItemView3.perform(click())

         val appCompatCheckBox = onView(
             allOf(
                 withId(R.id.pocketpaint_checkbox_layer),
                 childAtPosition(
                     allOf(
                         withId(R.id.pocketpaint_item_layer_background),
                         withParent(withId(R.id.pocketpaint_layer_side_nav_list))
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatCheckBox.perform(click())

         val bottomNavigationItemView4 = onView(
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
         bottomNavigationItemView4.perform(click())

         val bottomNavigationItemView5 = onView(
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
         bottomNavigationItemView5.perform(click())

         val bottomNavigationItemView6 = onView(
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
         bottomNavigationItemView6.perform(click())

         val bottomNavigationItemView7 = onView(
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
         bottomNavigationItemView7.perform(click())

         val linearLayout3 = onView(
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
         linearLayout3.perform(click())

         val appCompatImageButton3 = onView(
             allOf(
                 withId(R.id.pocketpaint_shapes_star_btn), withContentDescription("Star"),
                 childAtPosition(
                     allOf(
                         withId(R.id.pocketpaint_shapes_container),
                         childAtPosition(
                             withClassName(`is`("android.widget.LinearLayout")),
                             8
                         )
                     ),
                     3
                 )
             )
         )
         appCompatImageButton3.perform(scrollTo(), click())

         val appCompatImageButton4 = onView(
             allOf(
                 withId(R.id.pocketpaint_btn_top_undo), withContentDescription("Undo"),
                 childAtPosition(
                     childAtPosition(
                         withId(R.id.pocketpaint_toolbar),
                         1
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatImageButton4.perform(click())

         val bottomNavigationItemView8 = onView(
             allOf(
                 withId(R.id.action_color_picker), withContentDescription("Color"),
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
         bottomNavigationItemView8.perform(click())

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

         val appCompatImageButton7 = onView(
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
         appCompatImageButton7.perform(click())

         val appCompatImageButton8 = onView(
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
         appCompatImageButton8.perform(click())

         val linearLayout4 = onView(
             allOf(
                 withParent(withParent(withId(R.id.pocketpaint_layout_tool_specific_options))),
                 isDisplayed()
             )
         )
         linearLayout4.check(matches(isDisplayed()))

         val bottomNavigationItemView9 = onView(
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
         bottomNavigationItemView9.perform(click())

         val appCompatImageButton9 = onView(
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
         appCompatImageButton9.perform(click())

         val bottomNavigationItemView10 = onView(
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

         val linearLayout5 = onView(
             allOf(
                 withId(R.id.pocketpaint_tools_brush),
                 childAtPosition(
                     childAtPosition(
                         withId(R.id.pocketpaint_tools_layout),
                         0
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         linearLayout5.perform(click())

         val appCompatImageButton10 = onView(
             allOf(
                 withId(R.id.pocketpaint_btn_top_undo), withContentDescription("Undo"),
                 childAtPosition(
                     childAtPosition(
                         withId(R.id.pocketpaint_toolbar),
                         1
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatImageButton10.perform(click())

         val bottomNavigationItemView12 = onView(
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
         bottomNavigationItemView12.perform(click())

         val appCompatCheckBox2 = onView(
             allOf(
                 withId(R.id.pocketpaint_checkbox_layer),
                 childAtPosition(
                     allOf(
                         withId(R.id.pocketpaint_item_layer_background),
                         withParent(withId(R.id.pocketpaint_layer_side_nav_list))
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatCheckBox2.perform(click())

         val appCompatCheckBox3 = onView(
             allOf(
                 withId(R.id.pocketpaint_checkbox_layer),
                 childAtPosition(
                     allOf(
                         withId(R.id.pocketpaint_item_layer_background),
                         withParent(withId(R.id.pocketpaint_layer_side_nav_list))
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatCheckBox3.perform(click())

         val appCompatCheckBox4 = onView(
             allOf(
                 withId(R.id.pocketpaint_checkbox_layer),
                 childAtPosition(
                     allOf(
                         withId(R.id.pocketpaint_item_layer_background),
                         withParent(withId(R.id.pocketpaint_layer_side_nav_list))
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatCheckBox4.perform(click())

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

         val bottomNavigationItemView14 = onView(
             allOf(
                 withId(R.id.action_color_picker), withContentDescription("Color"),
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
         bottomNavigationItemView14.perform(click())

         val colorPickerPresetColorButton2 = onView(
             allOf(
                 childAtPosition(
                     childAtPosition(
                         withClassName(`is`("android.widget.TableLayout")),
                         0
                     ),
                     3
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

         val bottomNavigationItemView15 = onView(
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
         bottomNavigationItemView15.perform(click())

         val bottomNavigationItemView16 = onView(
             allOf(
                 withId(R.id.action_current_tool), withContentDescription("Brush"),
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
         bottomNavigationItemView16.perform(click())

         val viewGroup = onView(
             allOf(
                 withId(R.id.pocketpaint_stroke_types),
                 withParent(withParent(withId(R.id.pocketpaint_layout_tool_specific_options))),
                 isDisplayed()
             )
         )
         viewGroup.check(matches(isDisplayed()))

         val bottomNavigationItemView17 = onView(
             allOf(
                 withId(R.id.action_color_picker), withContentDescription("Color"),
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
         bottomNavigationItemView17.perform(longClick())

         val bottomNavigationItemView18 = onView(
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
         bottomNavigationItemView18.perform(click())

         val appCompatCheckBox5 = onView(
             allOf(
                 withId(R.id.pocketpaint_checkbox_layer),
                 childAtPosition(
                     allOf(
                         withId(R.id.pocketpaint_item_layer_background),
                         withParent(withId(R.id.pocketpaint_layer_side_nav_list))
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatCheckBox5.perform(click())

         val bottomNavigationItemView19 = onView(
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
         bottomNavigationItemView19.perform(click())

         val linearLayout6 = onData(anything())
             .inAdapterView(
                 allOf(
                     withId(R.id.pocketpaint_layer_side_nav_list),
                     childAtPosition(
                         withId(R.id.pocketpaint_layer_side_nav_menu),
                         3
                     )
                 )
             )
             .atPosition(1)
         linearLayout6.perform(click())

         val appCompatCheckBox6 = onView(
             allOf(
                 withId(R.id.pocketpaint_checkbox_layer),
                 childAtPosition(
                     allOf(
                         withId(R.id.pocketpaint_item_layer_background),
                         withParent(withId(R.id.pocketpaint_layer_side_nav_list))
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatCheckBox6.perform(click())

         val bottomNavigationItemView20 = onView(
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
         bottomNavigationItemView20.perform(click())

         val linearLayout7 = onView(
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
         linearLayout7.perform(click())

         val bottomNavigationItemView21 = onView(
             allOf(
                 withId(R.id.action_color_picker), withContentDescription("Color"),
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
         bottomNavigationItemView21.perform(click())

         val colorPickerPresetColorButton3 = onView(
             allOf(
                 childAtPosition(
                     childAtPosition(
                         withClassName(`is`("android.widget.TableLayout")),
                         0
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         colorPickerPresetColorButton3.perform(click())

         val linearLayout8 = onView(
             allOf(
                 childAtPosition(
                     allOf(
                         withId(android.R.id.tabs),
                         childAtPosition(
                             withClassName(`is`("android.widget.LinearLayout")),
                             0
                         )
                     ),
                     1
                 ),
                 isDisplayed()
             )
         )
         linearLayout8.perform(click())

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

         val bottomNavigationItemView22 = onView(
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
         bottomNavigationItemView22.perform(click())

         val appCompatCheckBox7 = onView(
             allOf(
                 withId(R.id.pocketpaint_checkbox_layer),
                 childAtPosition(
                     allOf(
                         withId(R.id.pocketpaint_item_layer_background),
                         withParent(withId(R.id.pocketpaint_layer_side_nav_list))
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatCheckBox7.perform(click())

         val appCompatCheckBox8 = onView(
             allOf(
                 withId(R.id.pocketpaint_checkbox_layer),
                 childAtPosition(
                     allOf(
                         withId(R.id.pocketpaint_item_layer_background),
                         withParent(withId(R.id.pocketpaint_layer_side_nav_list))
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatCheckBox8.perform(click())

         val bottomNavigationItemView23 = onView(
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
         bottomNavigationItemView23.perform(click())

         val linearLayout9 = onView(
             allOf(
                 withId(R.id.pocketpaint_tools_stamp),
                 childAtPosition(
                     childAtPosition(
                         withId(R.id.pocketpaint_tools_layout),
                         2
                     ),
                     1
                 ),
                 isDisplayed()
             )
         )
         linearLayout9.perform(click())

         val chip = onView(
             allOf(
                 withId(R.id.action_copy), withText("Copy"),
                 childAtPosition(
                     childAtPosition(
                         withId(R.id.pocketpaint_layout_tool_specific_options),
                         0
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         chip.perform(click())

         val chip2 = onView(
             allOf(
                 withId(R.id.action_cut), withText("Cut"),
                 childAtPosition(
                     childAtPosition(
                         withId(R.id.pocketpaint_layout_tool_specific_options),
                         0
                     ),
                     2
                 ),
                 isDisplayed()
             )
         )
         chip2.perform(click())

         val chip3 = onView(
             allOf(
                 withId(R.id.action_paste), withText("Paste"),
                 childAtPosition(
                     childAtPosition(
                         withId(R.id.pocketpaint_layout_tool_specific_options),
                         0
                     ),
                     4
                 ),
                 isDisplayed()
             )
         )
         chip3.perform(click())

         val bottomNavigationItemView24 = onView(
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
         bottomNavigationItemView24.perform(click())

         val linearLayout10 = onView(
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
         linearLayout10.perform(click())

         val overflowMenuButton = onView(
             allOf(
                 withContentDescription("More options"),
                 childAtPosition(
                     childAtPosition(
                         withId(R.id.pocketpaint_toolbar),
                         2
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         overflowMenuButton.perform(click())

         val bottomNavigationItemView25 = onView(
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
         bottomNavigationItemView25.perform(click())

         val appCompatCheckBox9 = onView(
             allOf(
                 withId(R.id.pocketpaint_checkbox_layer),
                 childAtPosition(
                     allOf(
                         withId(R.id.pocketpaint_item_layer_background),
                         withParent(withId(R.id.pocketpaint_layer_side_nav_list))
                     ),
                     0
                 ),
                 isDisplayed()
             )
         )
         appCompatCheckBox9.perform(click())

         val bottomNavigationItemView26 = onView(
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
         bottomNavigationItemView26.perform(click())

         val bottomNavigationItemView27 = onView(
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
         bottomNavigationItemView27.perform(click())

         val view = onView(
             allOf(
                 withId(R.id.pocketpaint_drawing_surface_view),
                 withParent(
                     allOf(
                         withId(R.id.pocketpaint_main_layout),
                         withParent(withId(R.id.pocketpaint_drawer_layout))
                     )
                 ),
                 isDisplayed()
             )
         )
         view.check(matches(isDisplayed()))
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
     }*/
}
