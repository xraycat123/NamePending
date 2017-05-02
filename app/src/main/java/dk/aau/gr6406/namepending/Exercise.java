package dk.aau.gr6406.namepending;

public class Exercise {

    public String exerciseName;
    public String videopath;
    public String category;
    public int repetitions;

    public Exercise(String exerciseName, String videopath, String category, int repetitions){
        this.exerciseName = exerciseName;
        this.videopath = videopath;
        this.category = category;
        this.repetitions = repetitions;}

        public String getExerciseName() {
            return exerciseName;
        }

        public void setExerciseName(String exerciseName) {
            this.exerciseName = exerciseName;
        }

        public String getVideopath() {
            return videopath;
        }

        public void setVideopath(String videopath) {
            this.videopath = videopath;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getRepetitions() {
            return repetitions;
        }

        public void setRepetitions(int repetitions) {
            this.repetitions = repetitions;
        }
    }