package com.example.diceroller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import com.example.diceroller.databinding.ActivityBindBinding
import timber.log.Timber
import kotlin.properties.Delegates


class MainActivityBind : AppCompatActivity() {
    private lateinit var binding: ActivityBindBinding
        var start = "Orient"
        var orientation by Delegates.notNull<Int>()

    //lateinit var orient : LiveData<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView<ActivityBindBinding>(this,R.layout.activity_bind)
        //binding = DataBindingUtil.setContentView (this, R.layout.activity_bind)
        binding = setContentView(this,R.layout.activity_bind)
        //orient.value = "Orient"
        Timber.i( "onCreate Timber")
        Log.i("MainActivity", "onCreate Log")

            binding.mainBind = this
            start = "Orientaion_Create"
            orientation = if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT)
                LinearLayoutCompat.VERTICAL // binding
            else
                LinearLayoutCompat.HORIZONTAL // binding
           // binding.rootLayout.orientation = orientation  //   сам XML берет
/*
        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT)
            binding.rootLayout.orientation = LinearLayoutCompat.VERTICAL // binding
         else
            binding.rootLayout.orientation = LinearLayoutCompat.HORIZONTAL // binding
*/
        //binding.nameText.text = "Стартовали"
        Toast.makeText(this, orientation.toString(),
                Toast.LENGTH_SHORT).show()

       // binding.rollButton.setOnClickListener { rollDice() }
       // binding.clearButton.setOnClickListener { clearDice() }

    }
   //fun clearDice(view: View) {
    fun clearDice() {
      binding.diceImage.setImageResource( R.drawable.empty_dice)
      binding.diceImage2.setImageResource( R.drawable.empty_dice)
       //binding.nameText.text = "Почистили"
       start = "Clear"  // перехватывает только если обновить экран
       binding.invalidateAll()   // обновить экран
       //Toast.makeText(this, " clear button clicked",
       Toast.makeText(this, binding.nameText.text,
            Toast.LENGTH_SHORT).show()


    }
    //fun rollDice(view: View) {
    fun rollDice() {
      binding.diceImage.setImageResource(getRandomDiceImage())
      binding.diceImage2.setImageResource(getRandomDiceImage())
        binding.nameText.text = "Ва Банк"
        Toast.makeText(this, binding.nameText.text,
            Toast.LENGTH_SHORT).show()
        start = "Roll"
        binding.invalidateAll()   // обновить экран
    }
    private fun getRandomDiceImage(): Int = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart Timber")
        Log.i("MainActivity", "onStart Log")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
    }
}

/*
Какой метод Activity надувает макет приложения и делает его представления доступными в виде объектов?

onCreate()
setClickListener()
**setContentView()**
show()
вопрос 2
Какой атрибут вида вы используете, чтобы установить ширину вида, чтобы он соответствовал содержанию?

android:view_width="wrap"
**android:layout_width="wrap_content"**
android:layout_height="wrap_content"
android:layout_width="match_parent"
Подать заявку на оценку
Убедитесь, что приложение имеет следующее:

Макет приложения должен включать один текстовый вид и две кнопки.
Код приложения должен установить два обработчика щелчка, по одному для каждой кнопки.
Обработчик щелчка, который сбрасывает текстовое представление, должен установить свойство текста в 0.
 */

/*
11. Домашнее задание
В этом разделе перечислены возможные домашние задания для студентов, которые работают через эту кодовую метку в рамках курса, проводимого инструктором. Инструктор должен сделать следующее:

Назначьте домашнее задание, если требуется.
Общайтесь со студентами, как сдавать домашние задания.
Оцените домашние задания.
Преподаватели могут использовать эти предложения как можно меньше или столько, сколько хотят, и могут свободно назначать любую другую домашнюю работу, которая им кажется подходящей.

Если вы работаете над этим кодовым ярлыком самостоятельно, не стесняйтесь использовать эти домашние задания для проверки своих знаний.

Изменить приложение
Добавьте Clear кнопку в приложении DiceRoller , который устанавливает штамп образ на пустой образ.

Ответьте на эти вопросы
Вопрос 1
Какой <ImageView>атрибут указывает исходное изображение, которое следует использовать только в Android Studio?

android:srcCompat
app:src
tools:src
tools:sourceImage
вопрос 2
Какой метод изменяет ресурс изображения для ImageView кода в Kotlin? XMX

setImageResource()
setImageURI()
setImage()
setImageRes()
Вопрос 3
Что lateinitу казывает ключевое слово в объявлении переменной в коде Kotlin?

Переменная никогда не инициализируется.
Переменная инициализируется только во время выполнения приложения.
Переменная автоматически инициализируется в null.
Переменная будет инициализирована позже. Я обещаю!
Вопрос 4
Какая конфигурация Gradle указывает на самый последний уровень API, с которым было протестировано ваше приложение?

minSdkVersion
compileSdkVersion
targetSdkVersion
testSdkVersion
Вопрос 5
Вы видите строку импорта в вашем коде, которая начинается с androidx. Что это значит?

Класс является частью библиотек Android Jetpack.
Класс находится во внешней библиотеке, которая будет динамически загружаться при запуске приложения.
Класс является «дополнительным» и необязательным для вашего класса.
Класс является частью поддержки XML в Android.
Подать заявку на оценку
Убедитесь, что приложение имеет следующее:

Макет приложения должен включать один вид изображения и две кнопки.
Код приложения должен установить два обработчика щелчка, по одному для каждой кнопки.
Обработчик щелчка для кнопки « Очистить» должен установить изображение матрицы R.drawable.empty_dice.
 */