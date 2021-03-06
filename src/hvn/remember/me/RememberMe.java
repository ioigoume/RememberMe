package hvn.remember.me;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Convenience definitions for RememberMeProvider Contains all structure of all
 * database tables
 */

public final class RememberMe {
	public static final String AUTHORITY = "hvn.remember.me.provider.RememberMe";

	// This class cannot be instantiated
	private RememberMe() {
	}

	/**
	 * Things table
	 */
	public static final class NoteColumns implements BaseColumns {
		// This class cannot be instantiated
		private NoteColumns() {
		}

		/**
		 * The content:// style URL for this table
		 */
		public static final Uri CONTENT_URI = Uri.parse("content://"
				+ AUTHORITY + "/notes");

		/**
		 * The default sort order for this table
		 */
		public static final String DEFAULT_SORT_ORDER = "priority ASC";

		/**
		 * The content of notes
		 * <P>
		 * Type: TEXT
		 * </P>
		 */
		public static final String CONTENT = "content";

		/**
		 * The priority of note
		 * <P>
		 * Type: INTEGER equal to _ID on create
		 * </P>
		 */
		public static final String PRIORITY = "priority";
		
		/**
		 * The author of quote (this use later when expand to MyQuotes, it help this reusable
		 */
		public static final String AUTHOR = "author";

		// TODO
		// Decide to add created and modified date. They help sort notes for
		// priority by date. But for simplicity , i dont add them here, maybe
		// will consider on later version.
	} // NoteColumns

}// RememberMe class