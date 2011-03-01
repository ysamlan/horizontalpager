HorizontalPager for Android
==============
HorizontalPager is a modified version of Marc Reichelt's [RealViewSwitcher](http://marcreichelt.blogspot.com/2010/09/android-use-realviewswitcher-to-switch.html). It's essentially a horizontal ScrollView that snaps to a full-width child (like the Android homescreen's switching behavior). This modified version supports vertically scrolling children inside the view (Lists, vertical ScrollView children), animates a little more quickly and consistently to views regardless of how "far away" a child is when the animation is requested,  scrolls a bit more easily, and is screen-density-neutral regarding swipe sensitivity. It also includes a demo of how you can nest vertically scrolling elements inside the pager and use a RadioGroup as a tablike controller to switch pages (somewhat like the Android 2.0+ News widget). There's a [simple demo](https://github.com/ysamlan/horizontalpager/blob/master/src/com/github/ysamlan/horizontalpager/HorizontalPagerDemo.java) to get you started in addition to the [more complex one](https://github.com/ysamlan/horizontalpager/blob/master/src/com/github/ysamlan/horizontalpager/TabbedHorizontalPagerDemo.java) with an [XML layout](https://github.com/ysamlan/horizontalpager/blob/master/res/layout/activity_tabbed_horizontal_pager_demo.xml)), or just grab the [PageSwitcher class](https://github.com/ysamlan/horizontalpager/blob/master/src/com/github/ysamlan/horizontalpager/HorizontalPager.java), drop it into your app, and get rolling.

![PageSwitcher screenshot](http://ysamlan.github.com/horizontalpager/horizontal-pager-screenshot.png)

License
-----
Like Marc's original, this modified version is released under an Apache 2.0 license. 
