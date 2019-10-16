package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.ReadOnlyDiary;
import seedu.address.model.ReadOnlyHealthRecords;
import seedu.address.model.ReadOnlyRecipeBook;
import seedu.address.model.ReadOnlyUserPrefs;
import seedu.address.model.ReadOnlyUserProfile;
import seedu.address.model.ReadOnlyWorkoutPlanner;
import seedu.address.model.UserPrefs;

/**
 * API of the Storage component
 */
public interface Storage extends RecipeBookStorage, UserPrefsStorage,
        UserProfileStorage, WorkoutPlannerStorage, HealthRecordsStorage, DiaryStorage {

    // ================ UserPrefs methods ==============================

    @Override
    Optional<UserPrefs> readUserPrefs() throws DataConversionException, IOException;

    @Override
    void saveUserPrefs(ReadOnlyUserPrefs userPrefs) throws IOException;

    // ================ UserProfile methods ==============================

    @Override
    Path getUserProfileFilePath();

    Optional<ReadOnlyUserProfile> readUserProfile() throws DataConversionException, IOException;

    @Override
    void saveUserProfile(ReadOnlyUserProfile dukeCooks) throws IOException;

    // ================ Health Records methods ==============================

    @Override
    Path getHealthRecordsFilePath();

    @Override
    Optional<ReadOnlyHealthRecords> readHealthRecords() throws DataConversionException, IOException;

    @Override
    void saveHealthRecords(ReadOnlyHealthRecords healthRecords) throws IOException;

    // ================ Diary Records methods ==============================

    @Override
    Path getDiaryFilePath();

    @Override
    Optional<ReadOnlyDiary> readDiary() throws DataConversionException, IOException;

    @Override
    void saveDiary(ReadOnlyDiary diary) throws IOException;

    // ================ Recipe Book methods ==============================

    @Override
    Path getRecipesFilePath();

    Optional<ReadOnlyRecipeBook> readRecipeBook() throws DataConversionException, IOException;

    void saveRecipeBook(ReadOnlyRecipeBook recipeBook) throws IOException;

    // ================ Exercise methods ==============================

    @Override
    Path getWorkoutPlannerFilePath();

    @Override
    Optional<ReadOnlyWorkoutPlanner> readWorkoutPlanner() throws DataConversionException, IOException;

    @Override
    void saveWorkoutPlanner(ReadOnlyWorkoutPlanner dukeCooks) throws IOException;
}
