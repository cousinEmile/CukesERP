package com.cukeserp.utilities;


import com.cukeserp.pages.*;

public class Pages {

    private CalendarListViewPage calendarListViewPage;
    private CalendarPage         calendarPage;
    private HeaderPage           headerPage;
    private HelpPage             helpPage;
    private ImportPage           importPage;
    private InboxPage            inboxPage;
    private LandingPage          landingPage;
    private LoginPage            loginPage;
    private SearchPage           searchPage;

// ------------------------------------------------------------------------Methods--------------------------------------------------------------------------------------------------

    public CalendarListViewPage getCalendarListViewPage ( ) { return (calendarListViewPage == null) ? calendarListViewPage = new CalendarListViewPage ( ) : calendarListViewPage; }

    public CalendarPage getCalendar ( ) { return (calendarPage == null) ? calendarPage = new CalendarPage ( ) : calendarPage; }

    public HeaderPage getHeaderPage ( ) {
        return (headerPage == null) ? headerPage = new HeaderPage ( ) : headerPage;
    }

    public HelpPage getHelpPage ( ) {
        return (helpPage == null) ? helpPage = new HelpPage ( ) : helpPage;
    }

    public ImportPage getImportPage ( ) {
        return (importPage == null) ? importPage = new ImportPage ( ) : importPage;
    }

    public InboxPage getInboxPage ( ) {
        return (inboxPage == null) ? inboxPage = new InboxPage ( ) : inboxPage;
    }

    public LandingPage getLandingPage ( ) { return (landingPage == null) ? landingPage = new LandingPage ( ) : landingPage; }

    public LoginPage getLoginPage ( ) {
        return (loginPage == null) ? loginPage = new LoginPage ( ) : loginPage;
    }

    public SearchPage getSearchPage ( ) {
        return (searchPage == null) ? searchPage = new SearchPage ( ) : searchPage;
    }

}

