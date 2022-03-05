+ محدودیت زمان: ۱ ثانیه
+ محدودیت حافظه: ۲۵۶ مگابایت

----------
سامانه گلستان، یک سامانه بسیار قوی و کارآمد است که برای وضعیت تحصیلی دانشجوها و برگزاری و ثبت نام کلاس‌های دانشجوها طراحی شده است. 

هر دانشجو و هر استاد به محض ورود به دانشگاه در سامانه گلستان ثبت نام می‌کنند. در این سامانه مشخصات هر کدام وارد می‌شود. همچنین تعدادی کلاس در سامانه گلستان تعریف می‌شود. هر دانشجو می‌تواند در تعدادی از این کلاس‌ها ثبت نام کند.

اساتید نمرات را در سامانه گلستان وارد می‌کنند و دانشجویان هم در این سامانه می‌توانند نمرات خود را در این سامانه ببینند.

<details class="green">
<summary>
**دانشجو**
</summary>
+ **اسم `name`**
 + یک رشته به طول حداقل $1$ و حداکثر $20$ از حروف کوچک انگلیسی است.
+ **کد ملی `identical_num`**
 + یک رشته $10$ رقمی از ارقام $0$ تا $9$ است.
+ **سال ورودی `entering_year`**
 + یک عدد صحیح بین $1300$ تا $1500$ است. (شامل دو سر بازه)
+ **رشته تحصیلی `field`**
 + یک رشته به طول حداقل $1$ و حداکثر $20$ از حروف کوچک انگلیسی است.

</details>

<details class="green">
<summary>
**استاد**
</summary>
+ **اسم `name`**
 + یک رشته طول حداقل $1$ و حداکثر $20$ از حروف کوچک انگلیسی است.
+ **کد ملی `identical_num`**
 + یک رشته $10$ رقمی از ارقام $0$ تا $9$ است.
+ **رشته تحصیلی `field`**
 + یک رشته به طول حداقل $1$ و حداکثر $20$ از حروف کوچک انگلیسی است.

</details>

<details class="green">
<summary>
**کلاس**
</summary>
+ **اسم `name`**
 + یک رشته به طول حداقل $1$ و حداکثر $20$ از حروف کوچک انگلیسی است.
+ **کد کلاس `class_id`** 
 + یک رشته $10$ رقمی از ارقام $0$ تا $9$ است.
+ **رشته `field`**
 + یک رشته به طول حداقل $1$ و حداکثر $20$ از حروف کوچک انگلیسی است.
+ **استاد `professor`**
 + یک استاد برای تدریس این درس است. 
+ **دانشجویان `students`**
 + یک لیست از دانشجویانی که این درس را می‌آموزند است.

</details>

از شما می‌خواهیم تا به صورت مرحله به مرحله این سامانه را طراحی کنید. در واقع در پیاده سازی هر فاز از دستورات **فاز قبلی** هم استفاده خواهد شد.

<details class="blue">
<summary>
**فاز اوّل**
</summary>

<details class="blue">
<summary>
**درخواست `register_student`** 
</summary>

```
register_student <name> <identical_num> <entering_year> <field>
```

در این درخواست یک دانشجو نام `<name>`، کد ملی `<identical_num>`، سال ورودی `<entering_year>`، رشته تحصیلی `<field>` خود را وارد می کند و اقدام به ثبت نام در سامانه گلستان می‌کند.

در صورتی که یک دانشجو **یا استاد** دیگر قبلاً با کد ملی (`identical_num`) مشابه در سیستم ثبت نام کرده است پیام `this identical number previously registered` را چاپ کنید.

بعد از ثبت نام با موفقیت پیام  `welcome to golestan` را چاپ کنید.

</details>

<details class="blue">
<summary>
**درخواست `register_professor`**
</summary>

```
register_professor <name> <identical_num> <field>
```

در این درخواست یک استاد نام `<name>`، کد ملی `<identical_num>`، رشته تدریس `<field>` خود را وارد می‌کند و اقدام به ثبت نام می‌کند.

در صورتی که یک **دانشجو یا** استاد دیگر قبلاً با کد ملی (`identical_num`) مشابه در سیستم ثبت نام کرده است پیام `this identical number previously registered` را چاپ کنید.

بعد از ثبت نام با موفقیت پیام  `welcome to golestan` را چاپ کنید.

</details>

<details class="blue">
<summary>
**درخواست `make_class`**
</summary>
```
make_class <name> <class_id> <field>
```

در این درخواست یک کلاس با نام `<name>` و کد درس `<class_id>` برای رشته تحصیلی `<field>` ایجاد می‌شود. 

اگر این کد کلاس دیگری قبلاً استفاده شده است، پیام `this class id previously used` را چاپ کنید. 

در غیر این صورت پیام `class added successfully` را چاپ کنید.

</details>

</details>

<details class="blue">
<summary>
**فاز دوم**
</summary>

<details class="blue">
<summary>
**درخواست `add_student`**
</summary>
```
add_student <identical_num> <class_id>
```

در این درخواست یک دانشجو با کد ملی `<identical_num>` درخواست اضافه شدن به کلاس با کد `<class_id>` را دارد. 
 + در صورتی که چنین دانشجویی وجود ندارد پیام `invalid student` را چاپ کنید.
 + در صورتی که چنین کلاسی وجود ندارد پیام `invalid class` را چاپ کنید.
 + در صورتی که رشته تحصیلی این دانشجو با `<field>` این کلاس یکسان نیست پیام `student field is not match` را چاپ کنید.
 + در صورتی که این دانشجو قبلاً در این کلاس ثبت نام کرده است پیام `student is already registered` را چاپ کنید.
 + در صورتی که هیچ کدام از حالت‌های فوق پیش نیامد پیام `student added successfully to the class` را چاپ کنید.

توجه کنید اگر چند خطا همزمان اتفاق افتاد، پیام‌ها از بالا به پایین الویت دارند.
</details>

<details class="blue">
<summary>
**درخواست `add_professor`**
</summary>
```
add_professor <identical_num> <class_id>
```

در این درخواست یک استاد با کد ملی `<identical_num>` می‌خواهد تدریس کلاس با کد `<class_id>` را به عهده بگیرد.
 + در صورتی که چنین استادی وجود ندارد پیام `invalid professor` را چاپ کنید.
 + در صورتی که چنین کلاسی وجود ندارد پیام `invalid class` را چاپ کنید.
 + در صورتی که رشته تدریس این استاد با `<field>` این کلاس یکسان نیست پیام `professor field is not match` را چاپ کنید.
 + در صورتی که برای این کلاس استادی از قبل تعریف شده است پیام `this class has a professor` را چاپ کنید.
 + در صورتی که هیچ کدام از حالت‌های فوق پیش نیامد پیام `professor added successfully to the class` را چاپ کنید.
 
توجه کنید اگر چند خطا همزمان اتفاق افتاد، پیام‌ها از بالا به پایین الویت دارند.

</details>

<details class="blue">
<summary>
**درخواست `student_status`**
</summary>
```
student_status <identical_num>
```

در صورتی که دانشجویی با کد ملی `<identical_num>` وجود ندارد پیام `invalid student` را چاپ کنید.

در غیر این صورت در یک سطر و با یک فاصله بین آن‌ها به ترتیب نام دانشجو (`student_name`)، سال ورودی (`entering_year`)، رشته تحصیلی (`field`) و 

نام (`name`) کلاس‌هایی که این دانشجو در آن‌ها شرکت می‌کند را **به ترتیب ثبت** نام چاپ کنید. در صورتی که این دانشجو در هیچ کلاسی ثبت نام نکرده است هیچ چیزی چاپ نکنید.

</details>

<details class="blue">
<summary>
**درخواست `professor_status`**
</summary>
```
professor_status <identical_num>
```

در صورتی که استادی با کد ملی `<identical_num>` وجود ندارد پیام `invalid professor` را چاپ کنید.

در غیر این صورت در یک سطر و با یک فاصله بین آن‌ها به ترتیب نام استاد (`professor_name`)، رشته تحصیلی (`field`) و

نام (`name`) کلاس‌هایی که این استاد در آن‌ها تدریس می‌کند را **به ترتیب ثبت** نام چاپ کنید. در صورتی که این استاد تدریس هیچ کلاسی را به عهده نگرفته است هیچ چیزی چاپ نکنید.

</details>

<details class="blue">
<summary>
**درخواست `class_status`**
</summary>
```
class_status <class_id>
```

در صورتی که چنین کلاسی برای این رشته وجود ندارد پیام `invalid class` را چاپ کنید. 

در غیر این صورت در یک سطر و با یک فاصله بین آن‌ها به ترتیب نام (`name`) استادی که در این کلاس تدریس می‌کند را چاپ کنید. در صورتی که هیچ استادی برای تدریس این کلاس وجود ندارد کلمه `None` را به جای نام استاد، چاپ کنید.

سپس نام(`name`) تمامی دانشجویان این کلاس را به ترتیبی که در این کلاس ثبت نام کرده‌اند را در یک سطر و با فاصله چاپ کنید. اگر هیچ دانشجویی وجود ندارد **هیچ چیزی** چاپ نکنید.

</details>

</details>

<details class="blue">
<summary>
**فاز سوم**
</summary>

<details class="blue">
<summary>
**درخواست `set_final_mark`**
</summary>
```
set_final_mark <professor_identical_num> <student_identical_num> <class_id> <mark>
```

در این درخواست استادی با کد ملی `<professor_identical_num>` برای دانشجویی با کد ملی `<student_identical_num>` در درسی با کد `<class_id>` نمره پایان ترم `<mark>` را ثبت می‌کند.
+ در صورتی که استادی با این کد ملی وجود ندارد پیام `invalid professor` را چاپ کنید. 
+ در صورتی که دانشجویی با این کد ملی وجود ندارد پیام `invalid student` را چاپ کنید. 
+ در صورتی که کلاسی با این کد کلاس وجود ندارد پیام `invalid class` را چاپ کنید.
+ در صورتی که این استاد این درس را تدریس نمی‌کند پیام `professor class is not match` را چاپ کنید.
+ در صورتی که این دانشجو در این کلاس ثبت نام نکرده است پیام `student did not registered` را چاپ کنید.

در صورتی که هیچ کدام از حالت‌های بالا اتفاق نیفتد، نمره پایان ترم این دانشجو را برای این درس برابر `<grade>` قرار دهید. اگر نمره‌ای قبلاً ثبت شده آن را به این نمره **تغییر** دهید. در نهایت پیام `student final mark added or changed` را چاپ کنید.

تضمین می‌شود که `<grade>` یک عدد صحیح بین $0$ تا $20$ (شامل هر دو) است.

توجه کنید اگر چند خطا همزمان اتفاق افتاد، پیام‌ها از بالا به پایین الویت دارند.

</details>

<details class="blue">
<summary>
**درخواست `mark_student`**
</summary>
```
mark_student <identincal_num> <class_id> 
```

در این درخواست نمره دانشجو با کد ملی `<identical_num>` برای درس با کد `<class_id>` 
نمایش داده می‌شود.

+ در صورتی که دانشجویی با این کد ملی وجود ندارد پیام `invalid student` را چاپ کنید. 
+ در صورتی که کلاسی با این کد وجود ندارد پیام `invalid class` را چاپ کنید.
+ در صورتی که این دانشجو در این کلاس ثبت نام نکرده است پیام `student did not registered` را چاپ کنید.
+ در صورتی که هیچ نمره‌ای برای این درس هنوز ثبت نشده است کلمه `None` را چاپ کنید.

در صورتی که هیچ کدام از حالت‌های بالا اتفاق نیفتد، **آخرین نمره** ثبت شده این دانشجو را برای این درس چاپ کنید. 

توجه کنید اگر چند خطا همزمان اتفاق افتاد، پیام‌ها از بالا به پایین الویت دارند.

</details>

<details class="blue">
<summary>
**درخواست `mark_list`**
</summary>
```
mark_list <class_id>
```

در این درخواست لیست نمرات کلاس با کد `<class_id>` نمایش داده می‌شود.

+ در صورتی که کلاسی با این کد کلاس وجود ندارد پیام `invalid class` را چاپ کنید.
+ در صورتی که استادی برای این کلاس وجود ندارد پیام `no professor` را چاپ کنید. 
+ در صورتی که این کلاس هیچ دانشجویی ندارد پیام `no student` را چاپ کنید.

در صورتی که هیچ کدام از حالت‌های بالا اتفاق نیفتد به ترتیب دانشجوهایی که در کلاس ثبت نام کرده‌اند. نمره هر دانشجو را در یک سطر و با یک فاصله بین آن‌ها چاپ کنید. اگر نمره‌ای برای یک دانشجو ثبت نشده به جای نمره آن کلمه `None` را چاپ کنید.

توجه کنید اگر چند خطا همزمان اتفاق افتاد، پیام‌ها از بالا به پایین الویت دارند.

</details>

<details class="blue">
<summary>
**درخواست `average_mark_professor`**
</summary>
```
average_mark_professor <identical_num>
```

در این درخواست میانگین نمرات ثبت شده توسط استادی با کدملی `<identical_num>` نمایش داده می‌شود.

در صورتی که استادی با این کد ملی وجود ندارد پیام `invalid professor` را چاپ کنید. 

در غیر این صورت میانگین تمام نمراتی که این استاد برای تمام دانشجوها (در همه کلاس‌هایش) ثبت کرده است را به صورت یک عدد اعشاری با دقت دقیقاً دو رقم بعد از اعشار چاپ کنید. 

اگر یک استاد برای یک دانشجو در یک کلاس نمره‌ای را تغییر دهد فقط **نمره جدید** در میانگین در نظر گرفته می‌شود.

در صورتی که این استاد هیچ نمره‌ای ثبت نکرده است کلمه `None` را چاپ کنید.

منظور از میانگین نمرات ثبت شده برای یک استاد یعنی مجموع نمرات ثبت شده توسط این استاد تقسیم بر تعداد نمرات ثبت شده توسط این استاد. 

</details>

<details class="blue">
<summary>
**درخواست `average_mark_student`**
</summary>
```
average_mark_student <identincal_num>
```

در این درخواست میانگین نمرات ثبت شده برای دانشجویی با کدملی `<identical_num>` نمایش داده می‌شود.

در صورتی که دانشجویی با این کد ملی وجود ندارد پیام `invalid student` را چاپ کنید.

در غیر این صورت میانگین تمام نمراتی که این دانشجو از تمام استادها (در همه کلاس‌هایش) دریافت کرده است را به صورت یک عدد اعشاری با دقت دقیقاً دو رقم بعد از اعشار چاپ کنید. 

اگر یک استاد برای یک دانشجو در یک کلاس نمره‌ای را تغییر دهد فقط **نمره جدید** در میانگین در نظر گرفته می‌شود.

در صورتی که این دانشجو هیچ نمره‌ای دریافت نکرده است عبارت `None` را چاپ کنید.

منظور از میانگین نمرات دریافت شده برای یک دانشجو یعنی مجموع نمرات دریافت شده این دانشجو تقسیم بر تعداد نمرات دریافت شده توسط این دانشجو. 

</details>

<details class="blue">
<summary>
**درخواست `top_student`**
</summary>
```
top_student <field> <entering_year>
```

در این درخواست نام دانشجویی که در رشته `<field>` و ورودی سال `<entering_year>` میانگین نمرات بیشتری دارد را چاپ کنید. 

در صورتی که هیچ دانشجویی با این مشخصات وجود ندارد به جای نام آن کلمه `None` را چاپ کنید.

در صورتی که چند دانشجو با این مشخصات وجود دارد و همگی میانگین نمره یکسانی دارند، نام دانشجویی را چاپ کنید که زودتر ثبت نام کرده است.

</details>

<details class="blue">
<summary>
**درخواست `top_mark`**
</summary>
```
top_mark <class_id>
```

در این درخواست بیشترین نمره ثبت شده برای دانشجوهای کلاس `<class_id>` نمایش داده می‌شود.

در صورتی که چنین کلاسی وجود ندارد پیام `invalid class` را چاپ کنید.

در صورتی که هیچ دانشجویی در این کلاس هیچ نمره‌ای دریافت نکرده است، کلمه`None` را چاپ کنید.

در غیر این صورت بیشترین نمره ثبت شده برای دانشجویان این کلاس را چاپ کنید.
</details>

</details>

# ورودی

در هر سطر از ورودی تعدادی از دستورات گفته شده می‌آید. تضمین می‌شود که تعداد این دستورات از $200$ بیشتر نخواهد بود. 

برای نشان دادن پایان دستورات، بعد از آخرین سطر کلمه `end` در یک خط ورودی داده می‌شود.

**نمره دهی این سوال به این صورت است:**
+ فاز اول $25$ امتیاز
+ فاز دوم $100$ امتیاز
+ فاز سوم $125$ امتیاز

# خروجی

در هر سطر از خروجی پاسخ مناسب هر دستور را چاپ کنید.

# مثال
## ورودی نمونه ۱
```
register_student ali 0012233445 1398 software
register_student alireza 0012233445 1397 cs
register_student erfan 0043332227 1400 software
register_professor ahmadi 0014433225 software
make_class riaziyek 9876543210 math
make_class riaziyek 5552255522 software
add_student 0012233444 5552255522
add_student 0012233445 5552255522
add_professor 0014433225 5552255522
student_status 0012233445
add_student 0043332227 9876543210
add_student 0043332227 5552255522
student_status 0043332227
professor_status 0014433225
class_status 5552255522
set_final_mark 0014433225 0012233445 5552255522 18
mark_student 0012233445 5552255522
mark_student 0043332227 5552255522
set_final_mark 0014433225 0043332227 5552255522 19
mark_student 0012233445 5552255522
mark_student 0043332227 5552255522
mark_list 5552255522
top_mark 5552255522
top_student software 1398
top_student software 1401
end
```

## خروجی نمونه ۱
```
welcome to golestan
this identical number previously registered
welcome to golestan
welcome to golestan
class added successfully
class added successfully
invalid student
student added successfully to the class
professor added successfully to the class
ali 1398 software riaziyek 
student field is not match
student added successfully to the class
erfan 1400 software riaziyek 
ahmadi software riaziyek 
ahmadi ali erfan 
student final mark added or changed
18
None
student final mark added or changed
18
19
18 19 
19
ali
None
```

## ورودی نمونه ۲
```
register_student karimi 0023333334 1405 math
register_professor hajjarian 9987777776 math
register_professor azari 8876666665 math
make_class adadi 6222816098 math
make_class jabr 6222816099 math
add_professor 9987777776 6222816098
add_professor 8876666665 6222816099
add_professor 9987777776 6222816099
add_student 0023333334 6222816098
add_student 0023333334 6222816099
set_final_mark 9987777776 0023333334 6222816098 19
set_final_mark 9987777776 0023333334 6222816099 18
set_final_mark 8876666665 0023333334 6222816099 17
set_final_mark 8876666665 0023333334 6222816099 13
set_final_mark 9987777776 0023333334 6222816098 11
average_mark_professor 9987777776
average_mark_professor 8876666665
average_mark_student 0023333334
mark_list 6222816098
mark_list 6222816099
student_status 0023333334
professor_status 9987777776
professor_status 8876666665
class_status 6222816098
class_status 6222816099
end
```

## خروجی نمونه ۲
```
welcome to golestan
welcome to golestan
welcome to golestan
class added successfully
class added successfully
professor added successfully to the class
professor added successfully to the class
this class has a professor
student added successfully to the class
student added successfully to the class
student final mark added or changed
professor class is not match
student final mark added or changed
student final mark added or changed
student final mark added or changed
11.00
13.00
12.00
11 
13 
karimi 1405 math adadi jabr 
hajjarian math adadi 
azari math jabr 
hajjarian karimi 
azari karimi 
```
