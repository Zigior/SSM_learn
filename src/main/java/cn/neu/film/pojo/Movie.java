package cn.neu.film.pojo;


public class Movie {
    private int mId;
    private String mName;
    private String mIcon;
    private String mFile;
    private String mDirector;
    private String mStar;
    private int mColumn;
    private int mType;
    private int mLocation;
    private String mDate;
    private int mViews;
    private int mIfDelete;
    private MovieColumn movieColumn;
    private MovieType movieType;
    private MovieLocation movieLocation;

    public Movie() {
        super();
    }

    public Movie(int mId, String mName, String mIcon, String mFile, String mDirector, String mStar, int mColumn, int mType, int mLocation, String mDate, int mViews, int mIfDelete) {
        super();
        this.mId = mId;
        this.mName = mName;
        this.mIcon = mIcon;
        this.mFile = mFile;
        this.mDirector = mDirector;
        this.mStar = mStar;
        this.mColumn = mColumn;
        this.mType = mType;
        this.mLocation = mLocation;
        this.mDate = mDate;
        this.mViews = mViews;
        this.mIfDelete = mIfDelete;
    }

    public Movie(int mId, String mName, String mIcon, String mFile, String mDirector, String mStar, int mColumn, int mType, int mLocation, String mDate, int mViews, int mIfDelete, MovieColumn movieColumn, MovieType movieType, MovieLocation movieLocation) {
        super();
        this.mId = mId;
        this.mName = mName;
        this.mIcon = mIcon;
        this.mFile = mFile;
        this.mDirector = mDirector;
        this.mStar = mStar;
        this.mColumn = mColumn;
        this.mType = mType;
        this.mLocation = mLocation;
        this.mDate = mDate;
        this.mViews = mViews;
        this.mIfDelete = mIfDelete;
        this.movieColumn = movieColumn;
        this.movieType = movieType;
        this.movieLocation = movieLocation;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmIcon(String mIcon) {
        this.mIcon = mIcon;
    }

    public void setmFile(String mFile) {
        this.mFile = mFile;
    }

    public void setmDirector(String mDirector) {
        this.mDirector = mDirector;
    }

    public void setmStar(String mStar) {
        this.mStar = mStar;
    }

    public void setmColumn(int mColumn) {
        this.mColumn = mColumn;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    public void setmLocation(int mLocation) {
        this.mLocation = mLocation;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public void setmViews(int mViews) {
        this.mViews = mViews;
    }

    public void setmIfDelete(int mIfDelete) {
        this.mIfDelete = mIfDelete;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public String getmIcon() {
        return mIcon;
    }

    public String getmFile() {
        return mFile;
    }

    public String getmDirector() {
        return mDirector;
    }

    public String getmStar() {
        return mStar;
    }

    public int getmColumn() {
        return mColumn;
    }

    public int getmType() {
        return mType;
    }

    public int getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public int getmViews() {
        return mViews;
    }

    public int getmIfDelete() {
        return mIfDelete;
    }

    public MovieColumn getMovieColumn() {
        return movieColumn;
    }

    public void setMovieColumn(MovieColumn movieColumn) {
        this.movieColumn = movieColumn;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public MovieLocation getMovieLocation() {
        return movieLocation;
    }

    public void setMovieLocation(MovieLocation movieLocation) {
        this.movieLocation = movieLocation;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mIcon='" + mIcon + '\'' +
                ", mFile='" + mFile + '\'' +
                ", mDirector='" + mDirector + '\'' +
                ", mStar='" + mStar + '\'' +
                ", mColumn=" + mColumn +
                ", mType=" + mType +
                ", mLocation=" + mLocation +
                ", mDate='" + mDate + '\'' +
                ", mViews=" + mViews +
                ", mIfDelete=" + mIfDelete +
                ", movieColumn=" + movieColumn +
                ", movieType=" + movieType +
                ", movieLocation=" + movieLocation +
                '}';
    }
}
