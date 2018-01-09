package zh.binlog.event;

public class EventType {

	public static final int UNKNOWN_EVENT = 0;
	public static final int START_EVENT_V3 = 1;
	public static final int QUERY_EVENT = 2;
	public static final int STOP_EVENT = 3;
	public static final int ROTATE_EVENT = 4;
	public static final int INTVAR_EVENT = 5;
	public static final int LOAD_EVENT = 6;
	public static final int SLAVE_EVENT = 7;
	public static final int CREATE_FILE_EVENT = 8;
	public static final int APPEND_BLOCK_EVENT = 9;
	public static final int EXEC_LOAD_EVENT = 10;
	public static final int DELETE_FILE_EVENT = 11;
	public static final int NEW_LOAD_EVENT = 12;
	public static final int RAND_EVENT = 13;
	public static final int USER_VAR_EVENT = 14;
	public static final int FORMAT_DESCRIPTION_EVENT = 15;
	public static final int XID_EVENT = 16;
	public static final int BEGIN_LOAD_QUERY_EVENT = 17;
	public static final int EXECUTE_LOAD_QUERY_EVENT = 18;
	public static final int TABLE_MAP_EVENT = 19;
	public static final int PRE_GA_WRITE_ROWS_EVENT = 20;
	public static final int PRE_GA_UPDATE_ROWS_EVENT = 21;
	public static final int PRE_GA_DELETE_ROWS_EVENT = 22;
	public static final int WRITE_ROWS_EVENT = 23;
	public static final int UPDATE_ROWS_EVENT = 24;
	public static final int DELETE_ROWS_EVENT = 25;
	public static final int INCIDENT_EVENT = 26;
	public static final int HEARTBEAT_LOG_EVENT = 27;
	public static final int IGNORABLE_LOG_EVENT = 28;
	public static final int ROWS_QUERY_LOG_EVENT = 29;
	public static final int EXT_WRITE_ROWS_EVENT = 30;
	public static final int EXT_UPDATE_ROWS_EVENT = 31;
	public static final int EXT_DELETE_ROWS_EVENT = 32;
	public static final int GTID_LOG_EVENT = 33;
	public static final int ANONYMOUS_GTID_LOG_EVENT = 34;
	public static final int PREVIOUS_GTIDS_LOG_EVENT = 35;

}
