# CHI_Internship_Android_Junior_Myslyva_Level_Senior

Level 1 

Create Activity with a button in the center and TextView above it
Create Fragment with a button in the center and TextView above it
After clicking the button in Activity, open Fragment
After clicking the button in Fragment, increase the counter and show how many times you clicked in TextView in Fragment
After rotating the screen, the counter value should be saved
 In Fragment, you should add a toolbar with a back arrow
 After clicking on the back arrow, you should go back to Activity and show in Activity TextView how many clicks were made in Fragment.
____________________________________________________________________

Level 2

Create Activity with RecyclerView with 7 hardcoded elements
Every item is User, User has fields like this – Name, Age, isStudent (boolean field)
Init isStudent = false for all users 

You should show the name, the age and the switcher/check box like the indicator if User is a student or not
You can change the indicator from true to false
When you scroll up/down, all indicators should save their status true/false
You should store User after changing the screen orientation
For saving User you can use DB or SharedPreferences
After clicking on the user item from RecyclerView you should open Fragment with detailed info about the clicked User – Name, Age and isStudent. This Fragment is static, you can’t change isStudent status like in Activity

RecyclerView is empty
You should add a toolbar with a menu, in menu you have 1 option – Add User
After clicking add a user from the menu, you should open new Activity/Fragment with 2 Edit Text for Name, Age , DataPickeer for set date of birth in format dd/mm/yyyy and Button below 
After Clicking button, you should store this User in DB or SharedPreferences, close Activity/Fragment for adding and opening  previous Activity with Toast/SnackBar with text “User added successfully”
Get Users from the store where you saved (DB or SharedPreferences) and Show the list of them in RecyclerView.
Long click on the user in RecyclerView should open Dialog with 2 buttons Yes and No and Tittle “You want to delete this User”
If you click “Yes”, you should delete User from your store and update UI
If you click “No”, you should close Dialog
Add a new item to the toolbar – Sorting 
After clicking Sorting you should open Dialog with 4 TextView 
1 – Sort by name (Alphabetical) 
2 – Sort by age (youngest first) 
3 – Sort by student status (student first) 
4 – Sort by description (Short description first) 
After selecting the type of sort, you need to update UI and show Users in a chosen order
____________________________________________________________________

Level 3

Use this API  - https://zoo-animal-api.herokuapp.com/animals/rand/10 It returns JSON with 10 random animals

Senior

Create Activity which shows Fragment and makes an internet request for fetch data.
Show fetched data in RecyclerView in any way you want – show us your UI/UX skill.
Instead of one Fragment create ViewPager with 2 tabs:
1.	First page is the same as Junior but with pagination (download more animals after reaching the end of the list) and the ability to mark animals as favorite – show STAR or any other icon which shows if Animal is favorite or not. After clicking on the icon, save it to favorites.
2.	Second Page shows all your favorites animals
Save all favorites in DB.
Save all data in DB for offline mode.
