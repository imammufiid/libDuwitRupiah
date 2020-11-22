<h1 align="center">
    libDuwitRupiah
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.1-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/Koltin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/imufiid"><img src="https://img.shields.io/github/followers/imufiid?label=follow&style=social"></a>
    <br>
    <p>Simple way to customize <b>DialogFragment</b>.</p>
</p>

---
## Download
Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.imufiid:libDuwitRupiah:version'
}
```
---
## USE
> **MainActivity.kt**
```kotlin
class MainActivity : AppCompatActivity() {
    private var duwitRupiah: DuwitRupiah? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        ...

        duwitRupiah = DuwitRupiah()
        val result = duwitRupiah?.generate("2500000")

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show()
    }
}

---


### Version
- **0.0.1**
  - First Release
- **0.0.2**
  - change modifier

---

### Contribution
You can sent your constibution to `branche` `open-pull`.

---

```
Copyright 2020 Imam Mufiid
```