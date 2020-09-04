# andfun-kotlin-gdg-finder

# Desinging for Everyone - GDG Finder app - Проектирование для всех - приложение GDG Finder

This is the toy app for Lesson 10 of the [Android App Development in Kotlin course on Udacity](https://classroom.udacity.com/courses/ud9012/).
Это игрушечное приложение для урока 10 [разработка приложений для Android в курсе Kotlin по Udacity](https://classroom.udacity.com/courses/ud9012/).

## GDG Finder - Gdg-Искатель

GDGs, or Google Developer Groups, are communities of developers that focus on Google technologies - including Android - around the world. They host lots of different events like meetups, conferences, study jams, and more!
GDGs, или группы разработчиков Google, - это сообщества разработчиков, которые фокусируются на технологиях Google, включая Android, по всему миру. Они проводят множество различных мероприятий, таких как встречи, конференции, учебные джемы и многое другое!

GDG Finder helps you locate GDGs around the world or start one of your own. You'll learn the principles of Material Design so you can implement professional looking designs and build Android apps that users love to use!
GDG Finder поможет вам найти GDGs по всему миру или запустить один из ваших собственных. Вы узнаете принципы материального дизайна, так что вы можете реализовать профессионально выглядящие проекты и создавать приложения для Android, которые пользователи любят использовать!

## Screenshots - Скриншоты

![Screenshot1](screenshots/gdg-finder-home.png)
![Screenshot2](screenshots/gdg-finder-search.png)
![Screenshot3](screenshots/gdg-finder-apply.png)

## How to use this repo while taking the course - Как использовать это РЕПО во время прохождения курса


Each code repository in this class has a chain of commits that looks like this:
Каждый репозиторий кода в этом классе имеет цепочку коммитов, которая выглядит следующим образом:

![listofcommits](https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58befe2e_listofcommits/listofcommits.png)

These commits show every step you'll take to create the app. Each commit contains instructions for completing the that step.
Эти коммиты показывают каждый шаг, который вы предпримете для создания приложения. Каждая фиксация содержит инструкции для выполнения этого шага.

Each commit also has a **branch** associated with it of the same name as the commit message, as seen below:
Каждая фиксация также имеет связанную с ней ветвь * * * с тем же именем, что и сообщение фиксации, как показано ниже:

![branches](https://d17h27t6h515a5.cloudfront.net/topher/2017/April/590390fe_branches-ud855/branches-ud855.png)
Access all branches from this tab. - Открыть все ветки в этом разделе.

![listofbranches](https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58befe76_listofbranches/listofbranches.png)

![branchesdropdown](https://d17h27t6h515a5.cloudfront.net/topher/2017/April/590391a3_branches-dropdown-ud855/branches-dropdown-ud855.png)

The branches are also accessible from the drop-down in the "Code" tab.
Ветви также доступны из выпадающего списка на вкладке "код".б.

## Working with the Course Code - Работа с исходным кодом

Here are the basic steps for working with and completing exercises in the repo.
Вот основные шаги для работы с упражнениями и выполнения их в отчете.

The basic steps are:

1. Clone the repo.
2. Check out the branch corresponding to the step you want to attempt.
3. Find and complete the TODOs.
4. Optionally commit your code changes.
5. Compare your code with the solution.
6. Repeat steps 2-5 until you've gone trough all the steps to complete the toy app.

Основные шаги заключаются в следующем:

1. Клонировать РЕПО.
2. Проверьте ветвь, соответствующую шагу, который вы хотите попробовать.
3. Найти и завершить задачи.
4. При необходимости зафиксируйте изменения в коде.
5. Сравните свой код с решением.
6. Повторяйте шаги 2-5, пока вы не пройдете все шаги, чтобы завершить приложение для игрушек.


**Step 1: Clone the repo**

As you go through the course, you'll be instructed to clone the different exercise repositories, so you don't need to set these up now. You can clone a repository from github in a folder of your choice with the command:
Когда вы пройдете курс, вам будет предложено клонировать различные репозитории упражнений, поэтому вам не нужно настраивать их сейчас. Вы можете клонировать репозиторий из github в папку по вашему выбору с помощью команды:

```bash
git clone https://github.com/udacity/REPOSITORY_NAME.git
```

**Step 2: Check out the step branch**

As you go through different steps in the code, you'll be told which step you're on, as well as a link to the corresponding branch.
Когда вы пройдете через различные шаги в коде, вам будет сообщено, на каком шаге вы находитесь, а также ссылка на соответствующую ветвь.

You'll want to check out the branch associated with that step. The command to check out a branch would be:
Вы захотите проверить ветвь, связанную с этим шагом. Команда для проверки ветви будет такой:

```bash
git checkout BRANCH_NAME
```

**Step 3: Find and complete the TODOs**

Once you've checked out the branch, you'll have the code in the exact state you need. You'll even have TODOs, which are special comments that tell you all the steps you need to complete the exercise. You can easily navigate to all the TODOs using Android Studio's TODO tool. To open the TODO tool, click the button at the bottom of the screen that says TODO. This will display a list of all comments with TODO in the project.
Как только вы проверите ветку, у вас будет код в точном состоянии, которое вам нужно. Вы даже будете иметь TODOs, которые являются специальными комментариями, которые говорят вам все шаги, необходимые для завершения упражнения. Вы можете легко перемещаться, чтобы все задачи, используя инструмент Android студии Тодо. Чтобы открыть инструмент TODO, нажмите кнопку в нижней части экрана, которая говорит, что нужно сделать. Это позволит отобразить список всех комментариев с TODO в проекте.

We've numbered the TODO steps so you can do them in order:
Мы пронумеровали шаги для выполнения, чтобы вы могли сделать их по порядку:
![todos](https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58bf00e7_todos/todos.png)

**Step 4: Commit your code changes**

After You've completed the TODOs, you can optionally commit your changes. This will allow you to see the code you wrote whenever you return to the branch. The following git code will add and save **all** your changes.
После завершения TODOs вы можете дополнительно зафиксировать свои изменения. Это позволит вам видеть написанный вами код всякий раз, когда вы вернетесь в ветку. Следующий код git добавит и сохранит * * все * * ваши изменения.

```bash
git add .
git commit -m "Your commit message"
```

**Step 5: Compare with the solution**

Most exercises will have a list of steps for you to check off in the classroom. Once you've checked these off, you'll see a pop up window with a link to the solution code. Note the **Diff** link:
Большинство упражнений будет иметь список шагов для вас, чтобы проверить в классе. После того как вы их отключите, вы увидите всплывающее окно со ссылкой на код решения. Примечание **различия** ссылка:

![solutionwindow](https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58bf00f9_solutionwindow/solutionwindow.png)

The **Diff** link will take you to a Github diff as seen below:
Ссылка * * Diff* * приведет вас к GitHub diff, как показано ниже:
![diff](https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58bf0108_diffsceenshot/diffsceenshot.png)

All of the code that was added in the solution is in green, and the removed code (which will usually be the TODO comments) is in red.
Весь код, который был добавлен в решение, окрашен в зеленый цвет, а удаленный код (который обычно является комментарием TODO) - в красный.

You can also compare your code locally with the branch of the following step.
Вы также можете сравнить свой код локально с ветвью следующего шага.

## Report Issues - Проблемы С Отчетами
Notice any issues with a repository? Please file a github issue in the repository.
Вы заметили какие-либо проблемы с репозиторием? Пожалуйста, запишите проблему github в репозиторий.

10.1 Стили и темы
10.2 Материал Дизайн, размеры и цвета
10.3 Дизайн для всех

Основы Android Kotlin 10.1: стили и темы

Введение в дизайн
В этой серии программных кодов основное внимание уделяется одному из самых важных аспектов разработки Android - дизайну приложений.
Очевидными аспектами дизайна приложения являются представления, текст и кнопки, их расположение на экране,
а также цвета и шрифты, которые они используют.
Подсказки для пользователя о том, что делать дальше, также являются важным аспектом дизайна.
Пользователи должны иметь возможность с первого взгляда сказать, на что они смотрят, что важно и что они могут сделать.

Сравните два экрана ниже.
Обратите внимание, что, перемещая элементы и фокусируя внимание на том, что важно,
вы можете помочь пользователю понять, что происходит.
Для простых экранов хороший дизайн часто означает меньше показывать.
Для экранов с большим количеством важной информации хороший дизайн делает понятную информацию с первого взгляда.
Работая над приложениями для Android, вы можете услышать эту концепцию, называемую информационной архитектурой (IA).

Другой уровень проектирования - это создание согласованных пользовательских потоков или вариантов использования,
которые позволяют пользователям выполнять задачи.
Этот вид дизайна называется дизайном пользовательского опыта (UXD),
а некоторые дизайнеры специализируются на этом.

Если у вас нет доступа к дизайнеру, вот несколько советов по началу работы:

-Определите варианты использования. Напишите, что пользователи должны делать с вашим приложением и как.
-Реализовать дизайн. Не привязывайтесь к своему первому проекту, а только сделайте его «достаточно хорошим»,
 потому что вы измените его после того, как увидите, как с ним взаимодействуют реальные пользователи.
-Получать отзывы. Найдите любого, с кем вы можете поговорить о тестировании вашего приложения
 - вашей семьи, друзей или даже людей, с которыми вы только что познакомились в Группе разработчиков Google.
  Попросите их использовать ваше приложение для выполнения сценария использования, пока вы смотрите и делаете подробные записи.
-Уточнить! Со всей этой информацией сделайте приложение лучше, а затем протестируйте его снова.

Вот еще несколько вопросов, которые нужно задать себе при разработке отличного приложения.
Вы изучили методы решения этих проблем в предыдущих коде:

-Приложение теряет свое состояние, когда пользователь поворачивает свое устройство?
-Что происходит, когда пользователь открывает приложение?
 Пользователь видит загрузочный счетчик или данные готовы в автономном кэше?
-Является ли приложение закодированным таким образом, чтобы оно было эффективным и
 гарантировало, что приложение всегда реагирует на прикосновения пользователя?
-Взаимодействует ли приложение с бэкэнд-системами таким образом, чтобы оно никогда не приводило к тому,
 что пользователю предоставлялись странные, неправильные или устаревшие данные?

Поскольку вы работаете над приложениями для более широкой аудитории,
важно сделать ваши приложения доступными для максимально возможного числа пользователей.
Например:

-Многие пользователи взаимодействуют с компьютерными системами по-разному.
 Многие пользователи дальтоники, и цвета, которые контрастируют для одного пользователя, могут не работать для другого.
 У многих пользователей есть нарушения зрения, от необходимости в очках для чтения до слепоты.
-Некоторые пользователи не могут использовать сенсорные экраны, и они взаимодействуют через другие устройства ввода, такие как кнопки.
Хороший дизайн - самый важный способ заставить пользователей использовать ваше приложение.

Эти кодовые метки слишком короткие, чтобы научить вас всему о дизайне для Android,
но они помогут вам начать работу в правильном направлении,
и вы сможете продолжать учиться и развиваться самостоятельно.

View
Style
Default Style
Theme
TextAppearance

атрибуты (Атрибуты вида не могут использоваться повторно, как стили.)
Это стиль по умолчанию, предоставляемый системой Android.

Посмотреть атрибуты
Используйте атрибуты вида для явной установки атрибутов для каждого вида.
(Атрибуты вида не могут использоваться повторно, как стили.)
Вы можете использовать любое свойство, которое можно установить с помощью стилей или тем.
Используйте для нестандартных или одноразовых дизайнов, таких как поля, отступы или ограничения.

Стили
Используйте стиль для создания коллекции повторно используемой информации о стилях, такой как размер шрифта или цвета.
Хорошо подходит для объявления небольших наборов общих дизайнов, используемых в вашем приложении.
Примените стиль к нескольким представлениям, переопределяя стиль по умолчанию.
Например, используйте стиль для создания заголовков с последовательным стилем или набора кнопок.

Стиль по умолчанию
Это стиль по умолчанию, предоставляемый системой Android.

Темы
Используйте тему, чтобы определить цвета для всего вашего приложения.
Используйте тему, чтобы установить шрифт по умолчанию для всего приложения.
Применить ко всем представлениям, таким как текстовые представления или переключатели.
Используйте для настройки свойств, которые вы можете применять последовательно для всего приложения.

TextAppearance
Только для стилей с текстовыми атрибутами, такими как fontFamily.
Когда Android стилизует вид, он применяет комбинацию тем, стилей и атрибутов, которые вы можете настроить.
Атрибуты всегда перезаписывают все, что указано в стиле или теме.
И стили всегда перезаписывают все, что указано в теме.

На приведенных ниже снимках экрана показано приложение GDG-finder со светлой темой (слева) и темной темой (справа),
а также с пользовательским шрифтом и размерами заголовка.
Это может быть реализовано несколькими способами, и некоторые из них вы узнаете из этого кода.

5. Задача: использовать темы и загружаемые шрифты
При использовании шрифтов с вашим приложением вы можете отправлять необходимые файлы шрифтов как часть вашего APK.
Это простое решение, как правило, не рекомендуется, поскольку оно требует больше времени для загрузки и установки приложения.

Android позволяет приложениям загружать шрифты во время выполнения с помощью API загружаемых шрифтов.
Если ваше приложение использует тот же шрифт, что и другое приложение на устройстве,
Android загружает шрифт только один раз, экономя место на устройстве.

В этой задаче вы используете загружаемые шрифты,
чтобы установить шрифт для каждого представления в приложении, которое использует тему.

6. Задача: использовать стили
Темы отлично подходят для применения общих тем в вашем приложении, таких как шрифт по умолчанию и основные цвета.
Атрибуты отлично подходят для стилизации конкретного представления и добавления информации о макете, такой как поля,
отступы и ограничения, которые, как правило, специфичны для каждого экрана.

В середине пирамиды стилей и иерархии находятся стили.
Стили - это многократно используемые группы атрибутов, которые можно применять к представлениям по вашему выбору.
В этом задании вы используете стиль для заголовка и подзаголовка.

8. Резюме
-Используйте темы, стили и атрибуты в представлениях, чтобы изменить их внешний вид.
-Темы влияют на стилизацию всего приложения и содержат множество предустановленных значений для цветов, шрифтов и размеров шрифтов.
-Атрибут применяется к представлению, в котором установлен атрибут. Используйте атрибуты, если у вас есть стиль, который применяется только к одному представлению, например, отступы, поля и ограничения.
-Стили - это группы атрибутов, которые могут использоваться несколькими представлениями. Например, вы можете иметь стиль для всех ваших заголовков контента, кнопок или текстовых представлений.
-Темы и стили наследуются от родительской темы или стиля. Вы можете создать иерархию стилей.
-Значения атрибутов (которые устанавливаются в представлениях) переопределяют стили. Стили переопределяют стиль по умолчанию. Стили переопределяют темы. Темы переопределяют любой стиль, установленный textAppearanceсвойством.

Введение в дизайн материалов
Material Design - это кроссплатформенная система дизайна от Google и система дизайна для Android.
Material Design предоставляет подробные спецификации для всего в пользовательском интерфейсе приложения
(от того, как должен отображаться текст, до того, как планировать экран).
Веб-сайт Material Design по адресу material.io имеет полные спецификации.

На material.io вы также можете найти список дополнительных видов, которые поставляются с компонентами Material Design.
Представления включают нижнюю навигацию , кнопку с плавающим действием (FAB), которую вы используете в этой кодовой метке,
чипы, которые вы исследуете в следующей кодовой метке, и сворачивающиеся панели инструментов .

В дополнение к этим представлениям, которые вы можете использовать для реализации Material Design,
библиотека компонентов Material Design экспортирует MaterialComponents тему, которую ваше приложение уже использует.
MaterialComponentsТема реализует Material Design для управления, использует тематические атрибуты, и настраивается.

Чтобы увидеть примеры приложений, использующих Material Design, откройте Gmail или посетите веб-сайт Google Design,
в частности ежегодные награды Material Design.


4. Задача: использовать стили в мире материального дизайна
Чтобы получить максимальную отдачу от компонентов Material Design, используйте атрибуты темы.
Атрибуты темы - это переменные, которые указывают на различные типы информации о стилях, такие как основной цвет приложения.
Указав атрибуты темы для MaterialComponents темы, вы можете упростить стилизацию вашего приложения.
Значения, установленные для цветов или шрифтов, применяются ко всем виджетам,
поэтому вы можете иметь согласованный дизайн и фирменный стиль.

5. Задача: изменить тему панели инструментов
Иногда вы можете захотеть изменить часть экрана на другую тему, но не всю.
Например, вы можете заставить панель инструментов использовать темную тему компонентов Материала.
Вы делаете это, используя наложения тем.

A Theme используется для установки глобальной темы для всего приложения.
A ThemeOverlay используется для переопределения (или «наложения») этой темы для определенных видов, особенно для панели инструментов.

Наложения тем - это «тонкие темы», которые предназначены для наложения существующей темы, например, на глазури на торте.
Они полезны, когда вы хотите изменить подраздел своего приложения,
например, изменить панель инструментов на темную, но продолжайте использовать светлую тему для остальной части экрана.
Вы применяете наложение темы к представлению, и наложение применяется к этому представлению и ко всем его дочерним элементам.

Вы делаете это, применяя желаемую тему к корневому представлению иерархии представлений, для которой вы хотите ее использовать.
Это еще ничего не меняет! Если вы хотите, чтобы представление в иерархии использовало определенный атрибут,
определенный в теме наложения, вы специально устанавливаете атрибут в представлении и устанавливаете значение в ?attr/valuename.

6. Задача: использовать размеры
Профессионально выглядящее приложение имеет последовательный внешний вид.
Он имеет одинаковые цвета и похожие макеты на каждом экране.
Это делает приложение не только лучше, но и облегчает пользователям понимание и взаимодействие с экранами.

Размеры, или размеры, позволяют задавать многократные измерения для вашего приложения.
Укажите такие вещи, как поля, высота или отступы, используя dp. Укажите размеры шрифта, используя sp.

В этом задании вы определяете, dimen который будет использоваться для применения согласованного поля в правой и левой частях экрана.

7. Задача: использовать цвета
Используя цветовые ресурсы и материал темы, вы можете применять согласованные цвета во всем приложении.
Эффективное использование цвета может значительно улучшить удобство использования вашего приложения.
Выбор лучших цветов и цветовых комбинаций может быть сложной задачей, но есть инструменты, которые могут помочь.

Одним из доступных инструментов является Color Tool.
Чтобы получить полную цветовую схему Material для вашего приложения из инструмента,
вы выбираете два основных базовых цвета, а затем инструмент соответствующим образом создает оставшиеся цвета.

В этой задаче вы создаете цветовую схему Material и применяете ее в своем приложении.

colorOnPrimary: Цвет, который соответствует правилам доступности для текста и пиктограммы, если он нарисован поверх основного цвета.
colorOnSecondary: Цвет, который соответствует правилам доступности для текста и пиктограммы, если он нарисован поверх вторичного цвета.
Для получения дополнительной информации см. Цветовая тема .

9. Резюме
Плавающие кнопки действий
Плавающая кнопка действия (FAB) плавает над всеми другими представлениями. Обычно это связано с основным действием, которое пользователь может выполнить на экране. Вы добавляете прослушиватель кликов в FAB таким же образом, как и любой другой элемент пользовательского интерфейса.
Чтобы добавить FAB в свой макет, используйте в CoordinatorLayoutкачестве группы представления верхнего уровня, а затем добавьте FAB к нему.
Чтобы прокрутить содержимое внутри CoordinatorLayout, используйтеandroidx.core.widget.NestedScrollView.
Материал Дизайн
Material Design предоставляет темы и стили, которые делают ваше приложение красивым и простым в использовании. Material Design предоставляет подробные спецификации для всего, от того, как должен отображаться текст, до того, как выложить экран. См. Material.io для полной спецификации.
Чтобы использовать компоненты Material, вам необходимо включить библиотеку Material в свой файл Gradle.
implementation 'com.google.android.material:material:1.1.0-alpha04'
Используйте ?attrдля применения атрибутов темы материала к представлению:style="?attr/textAppearanceHeadline5"
Темы и стили
Используйте стили для переопределения атрибутов темы.
Используйте наложения тем, чтобы применить тему только к представлению и его дочерним элементам. Примените тему к родительскому представлению. Например:
android:theme="@style/ThemeOverlay.MaterialComponents.Dark.ActionBar"
Затем используйте ?attrобозначение, чтобы применить атрибуты к представлению. Например:
android:background="?attr/colorPrimaryDark"
Цвета
Инструмент « Цвет» помогает создать палитру материалов для вашего приложения и загрузить палитру в виде color.xmlфайла.
Задание оттенка ImageViewвызывает ImageView«тонирование» до указанного цвета. Например, вы можете использовать android:tint="?attr/colorOnPrimary". colorOnPrimaryЦвет предназначен , чтобы хорошо выглядеть на colorPrimary.
Габаритные размеры
Используйте измерение для измерений, которые применяются ко всему вашему приложению, таких как поля, ориентиры или интервалы между элементами.

10.3: дизайн для всех
Сделать приложение пригодным для использования большинством пользователей имеет смысл, независимо от того, разрабатываете ли вы его для удовольствия или для деловых целей. Для этого есть несколько измерений.
Поддержка языков RTL. Европейский и многие другие языки читаются слева направо, а приложения, происходящие из этих языков, обычно разрабатываются для соответствия этим языкам. Многие другие языки с большим количеством носителей, читаемых справа налево, например, арабский. Заставьте ваше приложение работать с языками справа налево (RTL), чтобы увеличить вашу потенциальную аудиторию.
Сканирование для доступности. Угадайте, как кто-то еще может испытать ваше приложение - вариант с подводными камнями. Приложение Accessibility Scanner извлекает из цикла догадки и анализирует ваше приложение, определяя, где вы можете улучшить его доступность.
Дизайн для TalkBack с описаниями контента. Нарушения зрения встречаются чаще, чем можно подумать, и многие пользователи, а не только слепые, используют программы чтения с экрана. Описания контента - это фразы, которые читатель экрана может сказать, когда пользователь взаимодействует с элементом экрана.
Поддержка ночного режима . Для многих слабовидящих пользователей изменение цвета экрана улучшает контраст и помогает им визуально работать с вашим приложением. Android позволяет легко поддерживать ночной режим, и вы всегда должны поддерживать ночной режим, чтобы предоставить пользователям простую альтернативу цветам экрана по умолчанию.
В этой кодовой метке вы изучите каждый из этих параметров и добавите поддержку для него в приложение GDG Finder.
Вы также узнаете, как использовать чипы с вашим Android-приложением. Вы можете использовать чипы, чтобы сделать ваше приложение более интересным, сохраняя его доступность.

Основы Android Kotlin 10.3: дизайн для всех
Сделать приложение пригодным для использования большинством пользователей имеет смысл, независимо от того, разрабатываете ли вы его для удовольствия или для деловых целей. Для этого есть несколько измерений.

Поддержка языков RTL.
 Европейский и многие другие языки читаются слева направо,
  а приложения, происходящие из этих языков, обычно разрабатываются для соответствия этим языкам.
   Многие другие языки с большим количеством носителей, читаемых справа налево, например, арабский.
    Заставьте ваше приложение работать с языками справа налево (RTL), чтобы увеличить вашу потенциальную аудиторию.
Сканирование для доступности.
 Угадайте, как кто-то еще может испытать ваше приложение - вариант с подводными камнями.
  Приложение Accessibility Scanner извлекает из цикла догадки
   и анализирует ваше приложение, определяя, где вы можете улучшить его доступность.
Дизайн для TalkBack с описаниями контента.
 Нарушения зрения встречаются чаще, чем можно подумать, и многие пользователи,
  а не только слепые, используют программы чтения с экрана.
   Описания контента - это фразы, которые читатель экрана может сказать, когда пользователь взаимодействует с элементом экрана.
Поддержка ночного режима.
 Для многих слабовидящих пользователей изменение цвета экрана улучшает контраст и помогает им визуально работать с вашим приложением.
  Android позволяет легко поддерживать ночной режим, и вы всегда должны поддерживать ночной режим,
   чтобы предоставить пользователям простую альтернативу цветам экрана по умолчанию.

  Вы также узнаете, как использовать чипы с вашим Android-приложением.
   Вы можете использовать чипы, чтобы сделать ваше приложение более интересным, сохраняя его доступность.

    3. Задача: добавить поддержку языков справа налево (RTL)

 Шаг 5: Добавьте живой регион
 В настоящее время надпись на кнопке отправки в порядке.
  Было бы лучше, если бы кнопка имела одну метку и описание до отправки формы и динамически изменялась на другую метку
  и описание контента после того, как пользователь щелкнет и форма будет отправлена.
  Вы можете сделать это, используя живой регион.

 Активный регион указывает службам специальных возможностей, должен ли пользователь быть уведомлен об изменении представления.
 Например, информирование пользователя о неверном пароле или сетевой ошибке - отличный способ сделать ваше приложение более доступным.
 В этом примере, для простоты, вы информируете пользователя, когда кнопка отправки изменяет свое состояние.

6. Задача: использовать чипы для фильтрации регионов
Чипы - это компактные элементы, которые представляют атрибут, текст, сущность или действие.
Они позволяют пользователям вводить информацию, выбирать варианты, фильтровать содержимое или инициировать действие.

7. Задача: поддержка ночного режима
Ночной режим позволяет вашему приложению менять цвета на темную тему,
например, когда в настройках устройства включен ночной режим.
В ночном режиме приложения изменяют свой светлый фон по умолчанию на темный
и соответственно изменяют все остальные элементы экрана.


9. Резюме

Поддержка RTL Языки

В Манифесте Android установите android:supportsRtl="true".
Вы можете просмотреть RTL в эмуляторе и использовать свой собственный язык для проверки макетов экрана. На устройстве или в эмуляторе откройте « Настройки» , а в « Параметры разработчика» выберите « Принудительное расположение RTL».
Заменить ссылки на Leftи Rightссылками на Startи End.
Отключите зеркальное отображение для рисования, удалив android:autoMirrored="true".
Выберите Refactor> Добавить поддержку RTL, где это возможно, чтобы Android Studio сделала всю работу за вас.
Используйте значения - папки «языкового кода» для хранения языковых ресурсов.
Сканирование для доступности

В магазине Play найдите сканер специальных возможностей от Google LLC и запустите его для сканирования элементов экрана для улучшения.
Дизайн для TalkBack с описаниями контента

Установите Google Accessibility Suite от Google, который включает TalkBack.
Добавить описания содержимого для всех элементов пользовательского интерфейса. Например:
android:contentDescription="@string/stage_image_description"
Для редактируемого элемента, такого как EditText, используйте android:hintатрибут в XML, чтобы предоставить пользователю подсказку о том, что печатать.
Создайте группы содержимого, обернув связанные элементы в группу представлений.
Создайте живой регион, чтобы предоставить пользователям дополнительную обратную связь android:accessibilityLiveRegion.
Используйте чипы для реализации фильтра

Чипы - это компактные элементы, которые представляют атрибут, текст, сущность или действие.
Чтобы создать группу фишек, используйте com.google.android.material.chip.ChipGroup.
Определите макет для одного com.google.android.material.chip.Chip.
Если вы хотите, чтобы ваши чипы меняли цвета, предоставьте список <selector>состояний цветов в виде цветов с состоянием:
<item android:color="?attr/colorPrimaryVariant"
android:state_selected="true" />
Свяжите чипы с живыми данными, добавив наблюдателя к данным в модели представления.
Чтобы отобразить чипы, создайте инфлятор для группы чипов:
LayoutInflater.from(chipGroup.context)
Создайте микросхемы, добавьте прослушиватель щелчков, который запускает требуемое действие, и добавьте микросхемы в группу микросхем.
Поддержка темного режима

Используйте DayNight AppThemeдля поддержки темного режима.
Вы можете установить темный режим программно:
AppCompatDelegate.setDefaultNightMode()
Создайте папку ресурсов res / values-night для предоставления пользовательских цветов и значений для темного режима.

10. Узнайте больше
Документация для разработчиков Android:

LayoutDirection (РТЛ)
двунаправленность
Начните с Accessibility Scanner
Отвечать
Жесты TalkBack
Обзорные документы Drawables
Дескрипторы содержимого
Группировка контента
Живые регионы
NinePatch Drawables
Инструмент Draw 9-patch
чипсы
ChipGroup
Темная тема
Цветная тематика
Цветной инструмент
Анимированная графика
Другие источники:

Разработка приложений для Android с Kotlin (курс Udacity)
Kotlin Bootcamp для программистов (курс Udacity)
Kotlin Bootcamp для программистов
