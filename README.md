# RoundedHorizontalProgressBar

[ ![Download](https://api.bintray.com/packages/sasankdeveloper/RoundedHorizontalProgressBar/roundedhorizontalprogress/images/download.svg) ](https://bintray.com/sasankdeveloper/RoundedHorizontalProgressBar/roundedhorizontalprogress/_latestVersion)

RoundedHorizontalProgressBar - An Android custom rounded Progress Bar that supports different Colors as progress both primary &amp; background colors. Allows you to animate the progress for a specific duration

<a href="url"><img src="https://github.com/saisasanksunkavalli/RoundedHorizontalProgressBar/blob/master/ScreenShots/1.jpeg" align="left" height="640" width="360" ></a>
<a href="url"><img src="https://github.com/saisasanksunkavalli/RoundedHorizontalProgressBar/blob/master/ScreenShots/2.jpeg" align="right" height="640" width="360" ></a>
<a class="hello" href="url"><img src="https://github.com/saisasanksunkavalli/RoundedHorizontalProgressBar/blob/master/ScreenShots/3.png" align="center" height="640" width="360" ></a>


# Gradle
```java
dependencies {

  	...
    compile 'com.sasank.roundedhorizontalprogress:roundedhorizontalprogress:1.0.1'
    
  }
```

## Usage

* In XML layout: 

```xml
        <com.sasank.roundedhorizontalprogress.RoundedHorizontalProgressBar
            android:id="@+id/progress_bar_1"
            style="?android:attr/progressBarStyleHorizontal"
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:indeterminate="false"
            android:maxHeight="12dp"
            android:minHeight="12dp"
            android:progress="40"
            app:backgroundColor="@color/green_light"
            app:progressColor="@color/green"/>
```

* If the progress Bar needs to be horizontal

```xml
        <com.sasank.roundedhorizontalprogress.RoundedHorizontalProgressBar
            android:id="@+id/progress_bar_1"
            --------------------------------
            app:backgroundColor="@color/green_light"
            app:progressColor="@color/green"
            app:isRounded="false"/>
```

* All customizable attributes of the View:

```xml
       <declare-styleable name="RoundedHorizontalProgress">
          <attr name="backgroundColor" format="color"/>
          <attr name="progressColor" format="color"/>
          <attr name="isRounded" format="boolean"/>
       </declare-styleable>
```

* Animating the view progress

```java
    mRoundedHorizontalProgressBar.animateProgress(2000, 0, 80); // (animationDuration, oldProgress, newProgress)
```

## Sample
* Clone the repository and check out the `app` module.




  
  
