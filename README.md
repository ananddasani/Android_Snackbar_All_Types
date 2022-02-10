# Android_Snackbar_All_Types
All Types of Snackbar in Android is used in single app

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

<img src="app_images/Snackbar Code.png" width="1000" /><br>

<img src="app_images/Snackbar App1.png" width="300" /> <img src="app_images/Snackbar App2.png" width="300" /> <img src="app_images/Snackbar App3.png" width="300" />
