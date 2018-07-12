# EasyShapeView

```xml
<LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center_horizontal"
            android:orientation="vertical"
            android:padding="10dp">


            <View
                android:id="@+id/tvv"
                android:layout_width="80dp"
                android:layout_height="80dp"
                android:gravity="center"
                bind:disable="@{ShapeMaker.create().shape(ShapeMaker.OVAL).color(Color.BLACK).build()}"
                bind:normal="@{ShapeMaker.create().shape(ShapeMaker.OVAL).fillType(ShapeMaker.FILL).color(@color/colorPrimary).build()}"
                bind:pressed="@{ShapeMaker.create().shape(ShapeMaker.OVAL).fillType(ShapeMaker.FILL).color(Color.GREEN).build()}" />

            <TextView
                android:id="@+id/tvMain"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:gravity="center"
                android:padding="10dp"
                android:text="@string/click_me"
                bind:disable="@{ShapeMaker.create().shape(ShapeMaker.RECT).color(Color.BLACK).build()}"
                bind:disableTextColor="@{Color.BLACK}"
                bind:normal="@{ShapeMaker.create().shape(ShapeMaker.RECT).fillType(ShapeMaker.BORDER).strokeWidth(5).radius(@dimen/space_med).color(Color.RED).build()}"
                bind:normalTextColor="@{Color.RED}"
                bind:pressed="@{ShapeMaker.create().shape(ShapeMaker.RECT).fillType(ShapeMaker.FILL).radius(@dimen/space_med).color(Color.GREEN).build()}"
                bind:pressedTextColor="@{Color.WHITE}" />


            <TextView
                android:id="@+id/tvMain2"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                bind:disable="@{@drawable/settings_switch_back_on}"
                bind:normal="@{@drawable/settings_switch_back_off}"
                bind:pressed="@{@drawable/settings_switch_back_on}" />


            <ImageView
                android:id="@+id/ivMain"
                android:layout_width="100dp"
                android:layout_height="100dp"
                bind:disableSrc="@{@drawable/icon_standings_grey}"
                bind:normalSrc="@{@drawable/icon_standings_grey}"
                bind:pressedSrc="@{@drawable/icon_standings}"
                bind:selectedSrc="@{@drawable/icon_standings}" />

            <CheckBox
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                bind:check="@{@drawable/img_radiobtn_h}"
                bind:uncheck="@{@drawable/img_radiobtn}" />

        </LinearLayout>
```