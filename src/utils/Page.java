package utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;

public abstract class Page 
 {
	 abstract protected void MoveBack();
	 abstract protected void MoveForward();
     abstract protected void Refresh();
	 abstract protected void Click();
	 abstract protected String GetText();
	 abstract protected String GetPageTitle();
	 abstract protected String GetAlertContent();
     abstract protected void SetAlertContent(String text);
     abstract protected String MouseOverAndGetValue(String TypeOfValue);
     abstract protected void Minimize();
     abstract protected void Maximize();
     abstract protected ArrayList<String> GetSelectedValues();
     abstract protected ArrayList<String> GetDropdownValues();
     abstract protected HashSet<String> GetDistinctDropdownValues();
     abstract protected SortedSet<String> GetDropdownValues(String SortType);
     abstract protected SortedSet<String> GetDistinctDropdownValues(String SortType);
     abstract protected boolean UploadFile(String FilePath);
     abstract protected boolean DownloadFile(String FilePath);
     abstract protected void CloseAlert();
     abstract protected boolean DoubleClick();
     abstract protected boolean LeftClick();
     abstract protected boolean RightClick();
     abstract protected boolean MouseOverAndClick(String ClickType,String ClickValue);
     abstract protected boolean ClosePage(String WindowId);
     abstract protected void LoadPage(String URL);
     abstract protected boolean PageScroll();
     abstract protected boolean PageZoom(String Type);
     abstract protected boolean SelectRadioButton(String Value);
     abstract protected boolean SelectCheckBox(String Value);
     abstract protected boolean SetText(String text);
     abstract protected boolean SelectDropdownValue(String Value,String Type); 
	 
  
 }
