# BetterAdapter
Easy way to dealing with Recyclerview adapter

### Download
Use Gradle :
```sh
repositories {
	maven { url 'https://jitpack.io' }
}

dependencies {
	implementation 'com.github.ANNASBlackHat:BetterAdapter:1.0.4'
}
```

### Enable Databinding
```sh
android{

dataBinding {
        enabled = true
    }
}

```

**if you're using kotlin, add kapt plugin**
```sh
apply plugin: 'kotlin-kapt'
```


## Example
*list_item_product.xml*
```xml
<layout>
    <data>
        <variable
            name="model"
            type="com.example.yourpackage.Product"/>
    </data>
    <android.support.constraint.ConstraintLayout
   ............
						 
   </android.support.constraint.ConstraintLayout>
</layout>						 						 
```

**Implementation on your activity/fragment :**

Kotlin
```kotlin
recview.adapter = object : BetterAdapter(R.layout.list_item_product, your_arraylist_data, BR.model){}
```

Java
```Java
recview.setAdapter(new BetterAdapter(R.layout.list_item_product, your_arraylist_data, BR.model, null){});
```
