![PageSwitcher screenshot](http://ysamlan.github.com/horizontalpager/horizontal-pager-screenshot.png)

PageSwitcher for Android
==============
PageSwitcher is a modified version of Marc Reichelt's [RealViewSwitcher](http://marcreichelt.blogspot.com/2010/09/android-use-realviewswitcher-to-switch.html). It's essentially a horizontal ScrollView that snaps to a full-width child (like the Android homescreen's switching behavior). This modified version supports vertically scrolling children inside the view (Lists, vertical ScrollView children), animates a little more quickly and consistently to views regardless of how "far away" a child is when the animation is requested,  and includes a demo of how you can add a tablike RadioGroup as a controller to switch pages (somewhat like the Android 2.0+ News widget). See the demos inside the package for usage examples (there's a [simple one](https://github.com/ysamlan/horizontalpager/blob/master/src/com/github/ysamlan/horizontalpager/HorizontalPagerDemo.java) and a [more complex one](https://github.com/ysamlan/horizontalpager/blob/master/src/com/github/ysamlan/horizontalpager/TabbedHorizontalPagerDemo.java) with an [XML layout](https://github.com/ysamlan/horizontalpager/blob/master/res/layout/activity_tabbed_horizontal_pager_demo.xml)), or grab the [PageSwitcher class](https://github.com/ysamlan/horizontalpager/blob/master/src/com/github/ysamlan/horizontalpager/HorizontalPager.java).

License
-----
Like Marc's original, this modified version is released under an Apache 2.0 license. 
