# SwitchLibrary
[![](https://jitpack.io/v/mariumjawed/SwitchLibrary.svg)](https://jitpack.io/#mariumjawed/SwitchLibrary)


## Installation

in your build.gradle (Project)
```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

in your build.gradle (Module)
```groovy
implementation 'com.github.mariumjawed:SwitchLibrary:1.0.0'
```

## In your .xml
```groovy
<com.mariumjawedsheikh.switchmodule.MainActivityLibrarySwitch
	android:id="@+id/switchLibrary"
	android:layout_margin="10dp"
	android:layout_width="wrap_content"
	android:layout_height="wrap_content">

</com.mariumjawedsheikh.switchmodule.MainActivityLibrarySwitch>

```

## In your java file
```groovy
MainActivityLibrarySwitch aSwitch;

aSwitch = findViewById(R.id.switchLibrary);
aSwitch.setHeight(40);
aSwitch.setWidth(180);
aSwitch.setText1("Male");
aSwitch.setText2("Female");
aSwitch.setBackgroundColor(getResources().getColor(R.color.panic_blue));
aSwitch.setTabColor(getResources().getColor(R.color.query_grey));
// set selectedTab after: backgroundColor and TabColor
// for tab 1 selected
aSwitch.selectedTab(1);
}

```
