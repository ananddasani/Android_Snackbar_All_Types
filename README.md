# Android_Snackbar_All_Types
All Types of Snackbar in Android is used in single app

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

#### 1st Activity 
```
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.defaultSB:
                Snackbar.make(v, "This is Default SnackBar", Snackbar.LENGTH_SHORT).show();
                break;

            case R.id.buttonSB:
                Snackbar snackbar = Snackbar.make(v, "No Internet :(", Snackbar.LENGTH_SHORT);
                snackbar.setAction("retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Retrying...", Toast.LENGTH_SHORT).show();
                    }
                }).show();

                break;

            case R.id.customSB:
                Snackbar snackbar1 = Snackbar.make(v, "This is Custom SnackBar", Snackbar.LENGTH_SHORT);
                snackbar1.setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Retrying...", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar1.setBackgroundTint(getResources().getColor(R.color.teal_700));
                snackbar1.setActionTextColor(getResources().getColor(R.color.black));
                snackbar1.show();
                break;
        }
    }
```

# App Highlight

![Snackbar App1](https://user-images.githubusercontent.com/74413402/192092704-43d0080e-7429-48d6-a26c-72777fb8f64d.png)
![Snackbar App2](https://user-images.githubusercontent.com/74413402/192092705-4b88c8c1-c7fc-4432-9fb7-d20b07ce7f60.png)
![Snackbar App3](https://user-images.githubusercontent.com/74413402/192092706-beca7ec9-d608-4c22-83d8-0311c3eb4037.png)
![Snackbar Code](https://user-images.githubusercontent.com/74413402/192092707-d97264da-ee06-4098-b420-c8214ef83ea7.png)

