typedef unsigned char   undefined;

typedef unsigned char    bool;
typedef unsigned char    byte;
typedef unsigned int    dword;
typedef long long    longlong;
typedef unsigned char    uchar;
typedef unsigned int    uint;
typedef unsigned long    ulong;
typedef unsigned long long    ulonglong;
typedef unsigned char    undefined1;
typedef unsigned short    undefined2;
typedef unsigned int    undefined4;
typedef unsigned long long    undefined7;
typedef unsigned long long    undefined8;
typedef unsigned short    ushort;
typedef unsigned short    word;
typedef union _union_257 _union_257, *P_union_257;

typedef int ASN1_BOOLEAN;

typedef struct asn1_string_st asn1_string_st, *Pasn1_string_st;

typedef struct asn1_string_st ASN1_STRING;

typedef struct asn1_object_st asn1_object_st, *Pasn1_object_st;

typedef struct asn1_object_st ASN1_OBJECT;

typedef struct asn1_string_st ASN1_INTEGER;

typedef struct asn1_string_st ASN1_ENUMERATED;

typedef struct asn1_string_st ASN1_BIT_STRING;

typedef struct asn1_string_st ASN1_OCTET_STRING;

typedef struct asn1_string_st ASN1_PRINTABLESTRING;

typedef struct asn1_string_st ASN1_T61STRING;

typedef struct asn1_string_st ASN1_IA5STRING;

typedef struct asn1_string_st ASN1_GENERALSTRING;

typedef struct asn1_string_st ASN1_BMPSTRING;

typedef struct asn1_string_st ASN1_UNIVERSALSTRING;

typedef struct asn1_string_st ASN1_UTCTIME;

typedef struct asn1_string_st ASN1_GENERALIZEDTIME;

typedef struct asn1_string_st ASN1_VISIBLESTRING;

typedef struct asn1_string_st ASN1_UTF8STRING;

typedef struct ASN1_VALUE_st ASN1_VALUE_st, *PASN1_VALUE_st;

typedef struct ASN1_VALUE_st ASN1_VALUE;

struct ASN1_VALUE_st {
};

struct asn1_string_st {
    int length;
    int type;
    uchar * data;
    long flags;
};

union _union_257 {
    char * ptr;
    ASN1_BOOLEAN boolean;
    ASN1_STRING * asn1_string;
    ASN1_OBJECT * object;
    ASN1_INTEGER * integer;
    ASN1_ENUMERATED * enumerated;
    ASN1_BIT_STRING * bit_string;
    ASN1_OCTET_STRING * octet_string;
    ASN1_PRINTABLESTRING * printablestring;
    ASN1_T61STRING * t61string;
    ASN1_IA5STRING * ia5string;
    ASN1_GENERALSTRING * generalstring;
    ASN1_BMPSTRING * bmpstring;
    ASN1_UNIVERSALSTRING * universalstring;
    ASN1_UTCTIME * utctime;
    ASN1_GENERALIZEDTIME * generalizedtime;
    ASN1_VISIBLESTRING * visiblestring;
    ASN1_UTF8STRING * utf8string;
    ASN1_STRING * set;
    ASN1_STRING * sequence;
    ASN1_VALUE * asn1_value;
};

struct asn1_object_st {
    char * sn;
    char * * ln;
    int nid;
    int length;
    uchar * data;
    int flags;
};

typedef struct ASN1_ENCODING_st ASN1_ENCODING_st, *PASN1_ENCODING_st;

typedef struct ASN1_ENCODING_st ASN1_ENCODING;

struct ASN1_ENCODING_st {
    uchar * enc;
    long len;
    int modified;
};

typedef struct asn1_type_st asn1_type_st, *Pasn1_type_st;

typedef struct asn1_type_st ASN1_TYPE;

struct asn1_type_st {
    int type;
    union _union_257 value;
};

typedef struct stack_st_ASN1_OBJECT stack_st_ASN1_OBJECT, *Pstack_st_ASN1_OBJECT;

typedef struct stack_st stack_st, *Pstack_st;

typedef struct stack_st _STACK;

struct stack_st {
    int num;
    char * * data;
    int sorted;
    int num_alloc;
    int (* comp)(void *, void *);
};

struct stack_st_ASN1_OBJECT {
    _STACK stack;
};

typedef struct stack_st_X509_ALGOR stack_st_X509_ALGOR, *Pstack_st_X509_ALGOR;

struct stack_st_X509_ALGOR {
    _STACK stack;
};

typedef struct SubscriptionData SubscriptionData, *PSubscriptionData;

struct SubscriptionData { /* PlaceHolder Class Structure */
};

typedef struct AbstractBeOnDAO AbstractBeOnDAO, *PAbstractBeOnDAO;

struct AbstractBeOnDAO { /* PlaceHolder Class Structure */
};

typedef struct AbstractBeOnDatabase AbstractBeOnDatabase, *PAbstractBeOnDatabase;

struct AbstractBeOnDatabase { /* PlaceHolder Class Structure */
};

typedef struct AbstractBeOnQueryRule AbstractBeOnQueryRule, *PAbstractBeOnQueryRule;

struct AbstractBeOnQueryRule { /* PlaceHolder Class Structure */
};

typedef struct AbstractPersonalityOptionMsg AbstractPersonalityOptionMsg, *PAbstractPersonalityOptionMsg;

struct AbstractPersonalityOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct AbstractQueueProcessor AbstractQueueProcessor, *PAbstractQueueProcessor;

struct AbstractQueueProcessor { /* PlaceHolder Class Structure */
};

typedef struct AbstractRegOptionMsg AbstractRegOptionMsg, *PAbstractRegOptionMsg;

struct AbstractRegOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct AbstractThreadedQueueProcessor AbstractThreadedQueueProcessor, *PAbstractThreadedQueueProcessor;

struct AbstractThreadedQueueProcessor { /* PlaceHolder Class Structure */
};

typedef struct AbstractUserProvisionBindingMsg AbstractUserProvisionBindingMsg, *PAbstractUserProvisionBindingMsg;

struct AbstractUserProvisionBindingMsg { /* PlaceHolder Class Structure */
};

typedef struct AbstractUserProvisionIdMsg AbstractUserProvisionIdMsg, *PAbstractUserProvisionIdMsg;

struct AbstractUserProvisionIdMsg { /* PlaceHolder Class Structure */
};

typedef struct AbstractUserProvisionMsg AbstractUserProvisionMsg, *PAbstractUserProvisionMsg;

struct AbstractUserProvisionMsg { /* PlaceHolder Class Structure */
};

typedef struct AbstractUserServiceMsg AbstractUserServiceMsg, *PAbstractUserServiceMsg;

struct AbstractUserServiceMsg { /* PlaceHolder Class Structure */
};

typedef struct AckResponderListEntryMsg AckResponderListEntryMsg, *PAckResponderListEntryMsg;

struct AckResponderListEntryMsg { /* PlaceHolder Class Structure */
};

typedef struct AckResponseMsg AckResponseMsg, *PAckResponseMsg;

struct AckResponseMsg { /* PlaceHolder Class Structure */
};

typedef struct AesP25EncryptionLibrary AesP25EncryptionLibrary, *PAesP25EncryptionLibrary;

struct AesP25EncryptionLibrary { /* PlaceHolder Class Structure */
};

typedef struct AirlinkOptionMsg AirlinkOptionMsg, *PAirlinkOptionMsg;

struct AirlinkOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct AlertInfoOptionMsg AlertInfoOptionMsg, *PAlertInfoOptionMsg;

struct AlertInfoOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct AmbeVocoder AmbeVocoder, *PAmbeVocoder;

struct AmbeVocoder { /* PlaceHolder Class Structure */
};

typedef struct BaseQueueObject BaseQueueObject, *PBaseQueueObject;

struct BaseQueueObject { /* PlaceHolder Class Structure */
};

typedef struct BasicInfoDAO BasicInfoDAO, *PBasicInfoDAO;

struct BasicInfoDAO { /* PlaceHolder Class Structure */
};

typedef struct BasicInfoOption BasicInfoOption, *PBasicInfoOption;

struct BasicInfoOption { /* PlaceHolder Class Structure */
};

typedef struct BeOnAckTimer BeOnAckTimer, *PBeOnAckTimer;

struct BeOnAckTimer { /* PlaceHolder Class Structure */
};

typedef struct BeOnContact BeOnContact, *PBeOnContact;

struct BeOnContact { /* PlaceHolder Class Structure */
};

typedef struct BeOnContactDAO BeOnContactDAO, *PBeOnContactDAO;

struct BeOnContactDAO { /* PlaceHolder Class Structure */
};

typedef struct BeOnContactDatabase BeOnContactDatabase, *PBeOnContactDatabase;

struct BeOnContactDatabase { /* PlaceHolder Class Structure */
};

typedef struct BeOnContactManager BeOnContactManager, *PBeOnContactManager;

struct BeOnContactManager { /* PlaceHolder Class Structure */
};

typedef struct BeOnCore BeOnCore, *PBeOnCore;

struct BeOnCore { /* PlaceHolder Class Structure */
};

typedef struct BeOnDtlsSocket BeOnDtlsSocket, *PBeOnDtlsSocket;

struct BeOnDtlsSocket { /* PlaceHolder Class Structure */
};

typedef struct BeOnKmfBinding BeOnKmfBinding, *PBeOnKmfBinding;

struct BeOnKmfBinding { /* PlaceHolder Class Structure */
};

typedef struct BeOnLocationDAO BeOnLocationDAO, *PBeOnLocationDAO;

struct BeOnLocationDAO { /* PlaceHolder Class Structure */
};

typedef struct BeOnLock BeOnLock, *PBeOnLock;

struct BeOnLock { /* PlaceHolder Class Structure */
};

typedef struct BeOnQueryResult<BeOn--CorePresenceState*> BeOnQueryResult<BeOn--CorePresenceState*>, *PBeOnQueryResult<BeOn--CorePresenceState*>;

struct BeOnQueryResult<BeOn--CorePresenceState*> { /* PlaceHolder Class Structure */
};

typedef struct BeOnQueryResult<BeOn--CoreProfile*> BeOnQueryResult<BeOn--CoreProfile*>, *PBeOnQueryResult<BeOn--CoreProfile*>;

struct BeOnQueryResult<BeOn--CoreProfile*> { /* PlaceHolder Class Structure */
};

typedef struct BeOnQueryResult<BeOn--GeneralData_const*> BeOnQueryResult<BeOn--GeneralData_const*>, *PBeOnQueryResult<BeOn--GeneralData_const*>;

struct BeOnQueryResult<BeOn--GeneralData_const*> { /* PlaceHolder Class Structure */
};

typedef struct BeOnQueryResult<BeOn--ProfileGroupMap*> BeOnQueryResult<BeOn--ProfileGroupMap*>, *PBeOnQueryResult<BeOn--ProfileGroupMap*>;

struct BeOnQueryResult<BeOn--ProfileGroupMap*> { /* PlaceHolder Class Structure */
};

typedef struct BeOnQueryResult<BeOn--SlnGroupMap*> BeOnQueryResult<BeOn--SlnGroupMap*>, *PBeOnQueryResult<BeOn--SlnGroupMap*>;

struct BeOnQueryResult<BeOn--SlnGroupMap*> { /* PlaceHolder Class Structure */
};

typedef struct BeOnQueryResult<BeOnEvent_const*> BeOnQueryResult<BeOnEvent_const*>, *PBeOnQueryResult<BeOnEvent_const*>;

struct BeOnQueryResult<BeOnEvent_const*> { /* PlaceHolder Class Structure */
};

typedef struct BeOnQueryResult<BeOnObject_const*> BeOnQueryResult<BeOnObject_const*>, *PBeOnQueryResult<BeOnObject_const*>;

struct BeOnQueryResult<BeOnObject_const*> { /* PlaceHolder Class Structure */
};

typedef struct BeOnQueryResult<BeOnSlnInfo*> BeOnQueryResult<BeOnSlnInfo*>, *PBeOnQueryResult<BeOnSlnInfo*>;

struct BeOnQueryResult<BeOnSlnInfo*> { /* PlaceHolder Class Structure */
};

typedef struct BeOnQueue BeOnQueue, *PBeOnQueue;

struct BeOnQueue { /* PlaceHolder Class Structure */
};

typedef struct BeOnSocket BeOnSocket, *PBeOnSocket;

struct BeOnSocket { /* PlaceHolder Class Structure */
};

typedef struct BeOnSqliteDbConn BeOnSqliteDbConn, *PBeOnSqliteDbConn;

struct BeOnSqliteDbConn { /* PlaceHolder Class Structure */
};

typedef struct BeOnSqliteDbStatement BeOnSqliteDbStatement, *PBeOnSqliteDbStatement;

struct BeOnSqliteDbStatement { /* PlaceHolder Class Structure */
};

typedef struct BeOnSubscriptionManager BeOnSubscriptionManager, *PBeOnSubscriptionManager;

struct BeOnSubscriptionManager { /* PlaceHolder Class Structure */
};

typedef struct BeOnSubscriptionManagerQueue BeOnSubscriptionManagerQueue, *PBeOnSubscriptionManagerQueue;

struct BeOnSubscriptionManagerQueue { /* PlaceHolder Class Structure */
};

typedef struct BeOnThread BeOnThread, *PBeOnThread;

struct BeOnThread { /* PlaceHolder Class Structure */
};

typedef struct BeOnUserLocation BeOnUserLocation, *PBeOnUserLocation;

struct BeOnUserLocation { /* PlaceHolder Class Structure */
};

typedef struct BeOnUserPassword BeOnUserPassword, *PBeOnUserPassword;

struct BeOnUserPassword { /* PlaceHolder Class Structure */
};

typedef struct CallManager CallManager, *PCallManager;

struct CallManager { /* PlaceHolder Class Structure */
};

typedef struct CallStateBase CallStateBase, *PCallStateBase;

struct CallStateBase { /* PlaceHolder Class Structure */
};

typedef struct CallStateIdle CallStateIdle, *PCallStateIdle;

struct CallStateIdle { /* PlaceHolder Class Structure */
};

typedef struct CallStateMachine CallStateMachine, *PCallStateMachine;

struct CallStateMachine { /* PlaceHolder Class Structure */
};

typedef struct CallStatePlayback CallStatePlayback, *PCallStatePlayback;

struct CallStatePlayback { /* PlaceHolder Class Structure */
};

typedef struct CallStateRx CallStateRx, *PCallStateRx;

struct CallStateRx { /* PlaceHolder Class Structure */
};

typedef struct CallStateTx CallStateTx, *PCallStateTx;

struct CallStateTx { /* PlaceHolder Class Structure */
};

typedef struct CallStateTxConfirming CallStateTxConfirming, *PCallStateTxConfirming;

struct CallStateTxConfirming { /* PlaceHolder Class Structure */
};

typedef struct CallStateTxProceeding CallStateTxProceeding, *PCallStateTxProceeding;

struct CallStateTxProceeding { /* PlaceHolder Class Structure */
};

typedef struct CallStateTxQueued CallStateTxQueued, *PCallStateTxQueued;

struct CallStateTxQueued { /* PlaceHolder Class Structure */
};

typedef struct Compressor Compressor, *PCompressor;

struct Compressor { /* PlaceHolder Class Structure */
};

typedef struct ConnectionManager ConnectionManager, *PConnectionManager;

struct ConnectionManager { /* PlaceHolder Class Structure */
};

typedef struct ConnectionManagerStateConnected ConnectionManagerStateConnected, *PConnectionManagerStateConnected;

struct ConnectionManagerStateConnected { /* PlaceHolder Class Structure */
};

typedef struct ConnectionManagerStateMachine ConnectionManagerStateMachine, *PConnectionManagerStateMachine;

struct ConnectionManagerStateMachine { /* PlaceHolder Class Structure */
};

typedef struct ConnectionManagerStateNotConnected ConnectionManagerStateNotConnected, *PConnectionManagerStateNotConnected;

struct ConnectionManagerStateNotConnected { /* PlaceHolder Class Structure */
};

typedef struct ContactListDownloadThread ContactListDownloadThread, *PContactListDownloadThread;

struct ContactListDownloadThread { /* PlaceHolder Class Structure */
};

typedef struct ContactListOptionMsg ContactListOptionMsg, *PContactListOptionMsg;

struct ContactListOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct CorePresenceState CorePresenceState, *PCorePresenceState;

struct CorePresenceState { /* PlaceHolder Class Structure */
};

typedef struct CoreProfile CoreProfile, *PCoreProfile;

struct CoreProfile { /* PlaceHolder Class Structure */
};

typedef struct CustMobilityEventAck10Msg CustMobilityEventAck10Msg, *PCustMobilityEventAck10Msg;

struct CustMobilityEventAck10Msg { /* PlaceHolder Class Structure */
};

typedef struct CustPresentityIdOptionMsg CustPresentityIdOptionMsg, *PCustPresentityIdOptionMsg;

struct CustPresentityIdOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct CustPrNotifyMsg CustPrNotifyMsg, *PCustPrNotifyMsg;

struct CustPrNotifyMsg { /* PlaceHolder Class Structure */
};

typedef struct CustPrPublishLocationMsg CustPrPublishLocationMsg, *PCustPrPublishLocationMsg;

struct CustPrPublishLocationMsg { /* PlaceHolder Class Structure */
};

typedef struct CustPrSyncMsg CustPrSyncMsg, *PCustPrSyncMsg;

struct CustPrSyncMsg { /* PlaceHolder Class Structure */
};

typedef struct CustPSSActivateMsg CustPSSActivateMsg, *PCustPSSActivateMsg;

struct CustPSSActivateMsg { /* PlaceHolder Class Structure */
};

typedef struct CustPSSDeactivateMsg CustPSSDeactivateMsg, *PCustPSSDeactivateMsg;

struct CustPSSDeactivateMsg { /* PlaceHolder Class Structure */
};

typedef struct CustRegisterAck7Msg CustRegisterAck7Msg, *PCustRegisterAck7Msg;

struct CustRegisterAck7Msg { /* PlaceHolder Class Structure */
};

typedef struct CustRegisterInterResponse8Msg CustRegisterInterResponse8Msg, *PCustRegisterInterResponse8Msg;

struct CustRegisterInterResponse8Msg { /* PlaceHolder Class Structure */
};

typedef struct CustScanParmsAckMsg CustScanParmsAckMsg, *PCustScanParmsAckMsg;

struct CustScanParmsAckMsg { /* PlaceHolder Class Structure */
};

typedef struct CustScanParmsExplicit5Msg CustScanParmsExplicit5Msg, *PCustScanParmsExplicit5Msg;

struct CustScanParmsExplicit5Msg { /* PlaceHolder Class Structure */
};

typedef struct CustSetupRequest8Msg CustSetupRequest8Msg, *PCustSetupRequest8Msg;

struct CustSetupRequest8Msg { /* PlaceHolder Class Structure */
};

typedef struct CustTestAckMsg CustTestAckMsg, *PCustTestAckMsg;

struct CustTestAckMsg { /* PlaceHolder Class Structure */
};

typedef struct CustUEProvisionMsg CustUEProvisionMsg, *PCustUEProvisionMsg;

struct CustUEProvisionMsg { /* PlaceHolder Class Structure */
};

typedef struct CustUserProvisionEncryptedGroupListOptionMsg CustUserProvisionEncryptedGroupListOptionMsg, *PCustUserProvisionEncryptedGroupListOptionMsg;

struct CustUserProvisionEncryptedGroupListOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct CustUserProvisionKmfBindingMsg CustUserProvisionKmfBindingMsg, *PCustUserProvisionKmfBindingMsg;

struct CustUserProvisionKmfBindingMsg { /* PlaceHolder Class Structure */
};

typedef struct DbColumnInfo DbColumnInfo, *PDbColumnInfo;

struct DbColumnInfo { /* PlaceHolder Class Structure */
};

typedef struct DbIndexInfo DbIndexInfo, *PDbIndexInfo;

struct DbIndexInfo { /* PlaceHolder Class Structure */
};

typedef struct DbVersion DbVersion, *PDbVersion;

struct DbVersion { /* PlaceHolder Class Structure */
};

typedef struct DbVersionDAO DbVersionDAO, *PDbVersionDAO;

struct DbVersionDAO { /* PlaceHolder Class Structure */
};

typedef struct DecrypterAes DecrypterAes, *PDecrypterAes;

struct DecrypterAes { /* PlaceHolder Class Structure */
};

typedef struct DecrypterNone DecrypterNone, *PDecrypterNone;

struct DecrypterNone { /* PlaceHolder Class Structure */
};

typedef struct DefaultPowerManagementProvider DefaultPowerManagementProvider, *PDefaultPowerManagementProvider;

struct DefaultPowerManagementProvider { /* PlaceHolder Class Structure */
};

typedef struct DefaultTimerProvider DefaultTimerProvider, *PDefaultTimerProvider;

struct DefaultTimerProvider { /* PlaceHolder Class Structure */
};

typedef struct DefaultWorkQueueProvider DefaultWorkQueueProvider, *PDefaultWorkQueueProvider;

struct DefaultWorkQueueProvider { /* PlaceHolder Class Structure */
};

typedef struct DeregisterAckMsg DeregisterAckMsg, *PDeregisterAckMsg;

struct DeregisterAckMsg { /* PlaceHolder Class Structure */
};

typedef struct DeregisterRequestMsg DeregisterRequestMsg, *PDeregisterRequestMsg;

struct DeregisterRequestMsg { /* PlaceHolder Class Structure */
};

typedef struct EmergencyBehaviorBase EmergencyBehaviorBase, *PEmergencyBehaviorBase;

struct EmergencyBehaviorBase { /* PlaceHolder Class Structure */
};

typedef struct EmergencyBehaviorFixedGroup EmergencyBehaviorFixedGroup, *PEmergencyBehaviorFixedGroup;

struct EmergencyBehaviorFixedGroup { /* PlaceHolder Class Structure */
};

typedef struct EmergencyBehaviorFixedGroupSelf EmergencyBehaviorFixedGroupSelf, *PEmergencyBehaviorFixedGroupSelf;

struct EmergencyBehaviorFixedGroupSelf { /* PlaceHolder Class Structure */
};

typedef struct EmergencyBehaviorNone EmergencyBehaviorNone, *PEmergencyBehaviorNone;

struct EmergencyBehaviorNone { /* PlaceHolder Class Structure */
};

typedef struct EmergencyBehaviorSelectedGroup EmergencyBehaviorSelectedGroup, *PEmergencyBehaviorSelectedGroup;

struct EmergencyBehaviorSelectedGroup { /* PlaceHolder Class Structure */
};

typedef struct EmergencyBehaviorSelectedGroupSelf EmergencyBehaviorSelectedGroupSelf, *PEmergencyBehaviorSelectedGroupSelf;

struct EmergencyBehaviorSelectedGroupSelf { /* PlaceHolder Class Structure */
};

typedef struct EmergencyBehaviorSelfOnly EmergencyBehaviorSelfOnly, *PEmergencyBehaviorSelfOnly;

struct EmergencyBehaviorSelfOnly { /* PlaceHolder Class Structure */
};

typedef struct EmergencyManager EmergencyManager, *PEmergencyManager;

struct EmergencyManager { /* PlaceHolder Class Structure */
};

typedef struct EncrypterAes EncrypterAes, *PEncrypterAes;

struct EncrypterAes { /* PlaceHolder Class Structure */
};

typedef struct EncrypterNone EncrypterNone, *PEncrypterNone;

struct EncrypterNone { /* PlaceHolder Class Structure */
};

typedef struct EventBroadcaster EventBroadcaster, *PEventBroadcaster;

struct EventBroadcaster { /* PlaceHolder Class Structure */
};

typedef struct FeatureControlOptionMsg FeatureControlOptionMsg, *PFeatureControlOptionMsg;

struct FeatureControlOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct FreeStringOptionMsg FreeStringOptionMsg, *PFreeStringOptionMsg;

struct FreeStringOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct GeneralData GeneralData, *PGeneralData;

struct GeneralData { /* PlaceHolder Class Structure */
};

typedef struct GeneralDataDAO GeneralDataDAO, *PGeneralDataDAO;

struct GeneralDataDAO { /* PlaceHolder Class Structure */
};

typedef struct GenFailMsg GenFailMsg, *PGenFailMsg;

struct GenFailMsg { /* PlaceHolder Class Structure */
};

typedef struct GroupAffiliationsOptionMsg GroupAffiliationsOptionMsg, *PGroupAffiliationsOptionMsg;

struct GroupAffiliationsOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct GroupAlertData GroupAlertData, *PGroupAlertData;

struct GroupAlertData { /* PlaceHolder Class Structure */
};

typedef struct GroupDAO GroupDAO, *PGroupDAO;

struct GroupDAO { /* PlaceHolder Class Structure */
};

typedef struct GroupEmergencyStateActive GroupEmergencyStateActive, *PGroupEmergencyStateActive;

struct GroupEmergencyStateActive { /* PlaceHolder Class Structure */
};

typedef struct GroupEmergencyStateBase GroupEmergencyStateBase, *PGroupEmergencyStateBase;

struct GroupEmergencyStateBase { /* PlaceHolder Class Structure */
};

typedef struct GroupEmergencyStateInactive GroupEmergencyStateInactive, *PGroupEmergencyStateInactive;

struct GroupEmergencyStateInactive { /* PlaceHolder Class Structure */
};

typedef struct GroupEmergencyStatePendingWaitStartAck GroupEmergencyStatePendingWaitStartAck, *PGroupEmergencyStatePendingWaitStartAck;

struct GroupEmergencyStatePendingWaitStartAck { /* PlaceHolder Class Structure */
};

typedef struct GroupEmergencyStateWaitingForAutoKeyEnd GroupEmergencyStateWaitingForAutoKeyEnd, *PGroupEmergencyStateWaitingForAutoKeyEnd;

struct GroupEmergencyStateWaitingForAutoKeyEnd { /* PlaceHolder Class Structure */
};

typedef struct GroupEmergencyStateWaitingForCancelAck GroupEmergencyStateWaitingForCancelAck, *PGroupEmergencyStateWaitingForCancelAck;

struct GroupEmergencyStateWaitingForCancelAck { /* PlaceHolder Class Structure */
};

typedef struct GroupEmergencyStateWaitingForStartAck GroupEmergencyStateWaitingForStartAck, *PGroupEmergencyStateWaitingForStartAck;

struct GroupEmergencyStateWaitingForStartAck { /* PlaceHolder Class Structure */
};

typedef struct GroupPresentityData GroupPresentityData, *PGroupPresentityData;

struct GroupPresentityData { /* PlaceHolder Class Structure */
};

typedef struct ICallSetupRequest5Msg ICallSetupRequest5Msg, *PICallSetupRequest5Msg;

struct ICallSetupRequest5Msg { /* PlaceHolder Class Structure */
};

typedef struct ICallSetupRequest8Msg ICallSetupRequest8Msg, *PICallSetupRequest8Msg;

struct ICallSetupRequest8Msg { /* PlaceHolder Class Structure */
};

typedef struct ICallSetupRequestMsg ICallSetupRequestMsg, *PICallSetupRequestMsg;

struct ICallSetupRequestMsg { /* PlaceHolder Class Structure */
};

typedef struct ICallVoice3Msg ICallVoice3Msg, *PICallVoice3Msg;

struct ICallVoice3Msg { /* PlaceHolder Class Structure */
};

typedef struct ICallVoiceMsg ICallVoiceMsg, *PICallVoiceMsg;

struct ICallVoiceMsg { /* PlaceHolder Class Structure */
};

typedef struct IEncrypter IEncrypter, *PIEncrypter;

struct IEncrypter { /* PlaceHolder Class Structure */
};

typedef struct IncallControlAckMsg IncallControlAckMsg, *PIncallControlAckMsg;

struct IncallControlAckMsg { /* PlaceHolder Class Structure */
};

typedef struct InterestedUEData InterestedUEData, *PInterestedUEData;

struct InterestedUEData { /* PlaceHolder Class Structure */
};

typedef struct InventoryOptionMsg InventoryOptionMsg, *PInventoryOptionMsg;

struct InventoryOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct IVoiceDecoder IVoiceDecoder, *PIVoiceDecoder;

struct IVoiceDecoder { /* PlaceHolder Class Structure */
};

typedef struct IVoiceDecrypter IVoiceDecrypter, *PIVoiceDecrypter;

struct IVoiceDecrypter { /* PlaceHolder Class Structure */
};

typedef struct IVoiceEncoder IVoiceEncoder, *PIVoiceEncoder;

struct IVoiceEncoder { /* PlaceHolder Class Structure */
};

typedef struct KeepAliveMsg KeepAliveMsg, *PKeepAliveMsg;

struct KeepAliveMsg { /* PlaceHolder Class Structure */
};

typedef struct KeyFileHandler KeyFileHandler, *PKeyFileHandler;

struct KeyFileHandler { /* PlaceHolder Class Structure */
};

typedef struct KeyFileInfo KeyFileInfo, *PKeyFileInfo;

struct KeyFileInfo { /* PlaceHolder Class Structure */
};

typedef struct KeyManager KeyManager, *PKeyManager;

struct KeyManager { /* PlaceHolder Class Structure */
};

typedef struct KeyManagerES KeyManagerES, *PKeyManagerES;

struct KeyManagerES { /* PlaceHolder Class Structure */
};

typedef struct KmfDAO KmfDAO, *PKmfDAO;

struct KmfDAO { /* PlaceHolder Class Structure */
};

typedef struct KmtImpl KmtImpl, *PKmtImpl;

struct KmtImpl { /* PlaceHolder Class Structure */
};

typedef struct LapAddressOptionMsg LapAddressOptionMsg, *PLapAddressOptionMsg;

struct LapAddressOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct LicenseFeatureOptionMsg LicenseFeatureOptionMsg, *PLicenseFeatureOptionMsg;

struct LicenseFeatureOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct LocalEmergencyStateActive LocalEmergencyStateActive, *PLocalEmergencyStateActive;

struct LocalEmergencyStateActive { /* PlaceHolder Class Structure */
};

typedef struct LocalEmergencyStateBase LocalEmergencyStateBase, *PLocalEmergencyStateBase;

struct LocalEmergencyStateBase { /* PlaceHolder Class Structure */
};

typedef struct LocalEmergencyStateInactive LocalEmergencyStateInactive, *PLocalEmergencyStateInactive;

struct LocalEmergencyStateInactive { /* PlaceHolder Class Structure */
};

typedef struct LocalEmergencyStateMachine LocalEmergencyStateMachine, *PLocalEmergencyStateMachine;

struct LocalEmergencyStateMachine { /* PlaceHolder Class Structure */
};

typedef struct LocalEmergencyStateWaitingForCancelAck LocalEmergencyStateWaitingForCancelAck, *PLocalEmergencyStateWaitingForCancelAck;

struct LocalEmergencyStateWaitingForCancelAck { /* PlaceHolder Class Structure */
};

typedef struct LocalEmergencyStateWaitingForStartAck LocalEmergencyStateWaitingForStartAck, *PLocalEmergencyStateWaitingForStartAck;

struct LocalEmergencyStateWaitingForStartAck { /* PlaceHolder Class Structure */
};

typedef struct LocationOptionMsgIterator LocationOptionMsgIterator, *PLocationOptionMsgIterator;

struct LocationOptionMsgIterator { /* PlaceHolder Class Structure */
};

typedef struct LocationResponderListEntryMsg LocationResponderListEntryMsg, *PLocationResponderListEntryMsg;

struct LocationResponderListEntryMsg { /* PlaceHolder Class Structure */
};

typedef struct LocationUpdater LocationUpdater, *PLocationUpdater;

struct LocationUpdater { /* PlaceHolder Class Structure */
};

typedef struct MessageDispatcher MessageDispatcher, *PMessageDispatcher;

struct MessageDispatcher { /* PlaceHolder Class Structure */
};

typedef struct MobileMsgInfo MobileMsgInfo, *PMobileMsgInfo;

struct MobileMsgInfo { /* PlaceHolder Class Structure */
};

typedef struct MobilityEvent5Msg MobilityEvent5Msg, *PMobilityEvent5Msg;

struct MobilityEvent5Msg { /* PlaceHolder Class Structure */
};

typedef struct MobilityEventAck10Msg MobilityEventAck10Msg, *PMobilityEventAck10Msg;

struct MobilityEventAck10Msg { /* PlaceHolder Class Structure */
};

typedef struct MobilityEventMsg MobilityEventMsg, *PMobilityEventMsg;

struct MobilityEventMsg { /* PlaceHolder Class Structure */
};

typedef struct MobilityManager MobilityManager, *PMobilityManager;

struct MobilityManager { /* PlaceHolder Class Structure */
};

typedef struct MsgBuffer MsgBuffer, *PMsgBuffer;

struct MsgBuffer { /* PlaceHolder Class Structure */
};

typedef struct MsgBufferFactory MsgBufferFactory, *PMsgBufferFactory;

struct MsgBufferFactory { /* PlaceHolder Class Structure */
};

typedef struct MsgFactory MsgFactory, *PMsgFactory;

struct MsgFactory { /* PlaceHolder Class Structure */
};

typedef struct MsgIterator MsgIterator, *PMsgIterator;

struct MsgIterator { /* PlaceHolder Class Structure */
};

typedef struct OffsetMsg OffsetMsg, *POffsetMsg;

struct OffsetMsg { /* PlaceHolder Class Structure */
};

typedef struct PasswordParamOptionMsg PasswordParamOptionMsg, *PPasswordParamOptionMsg;

struct PasswordParamOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct PatchSimuselectEntityIterator PatchSimuselectEntityIterator, *PPatchSimuselectEntityIterator;

struct PatchSimuselectEntityIterator { /* PlaceHolder Class Structure */
};

typedef struct PatchSimuselectEntityMsg PatchSimuselectEntityMsg, *PPatchSimuselectEntityMsg;

struct PatchSimuselectEntityMsg { /* PlaceHolder Class Structure */
};

typedef struct PatchSimuselectGroupMsg PatchSimuselectGroupMsg, *PPatchSimuselectGroupMsg;

struct PatchSimuselectGroupMsg { /* PlaceHolder Class Structure */
};

typedef struct PatchSimuselectUserMsg PatchSimuselectUserMsg, *PPatchSimuselectUserMsg;

struct PatchSimuselectUserMsg { /* PlaceHolder Class Structure */
};

typedef struct PersonalityDAO PersonalityDAO, *PPersonalityDAO;

struct PersonalityDAO { /* PlaceHolder Class Structure */
};

typedef struct PersonalityOptionCustomProfileTemplateMsg PersonalityOptionCustomProfileTemplateMsg, *PPersonalityOptionCustomProfileTemplateMsg;

struct PersonalityOptionCustomProfileTemplateMsg { /* PlaceHolder Class Structure */
};

typedef struct PersonalityOptionDeleteProfileMsg PersonalityOptionDeleteProfileMsg, *PPersonalityOptionDeleteProfileMsg;

struct PersonalityOptionDeleteProfileMsg { /* PlaceHolder Class Structure */
};

typedef struct PersonalityOptionFeatureEncryptionMsg PersonalityOptionFeatureEncryptionMsg, *PPersonalityOptionFeatureEncryptionMsg;

struct PersonalityOptionFeatureEncryptionMsg { /* PlaceHolder Class Structure */
};

typedef struct PersonalityOptionGrouplistProvision2Msg PersonalityOptionGrouplistProvision2Msg, *PPersonalityOptionGrouplistProvision2Msg;

struct PersonalityOptionGrouplistProvision2Msg { /* PlaceHolder Class Structure */
};

typedef struct PersonalityOptionGrouplistProvisionMsg PersonalityOptionGrouplistProvisionMsg, *PPersonalityOptionGrouplistProvisionMsg;

struct PersonalityOptionGrouplistProvisionMsg { /* PlaceHolder Class Structure */
};

typedef struct PersonalityOptionSpeedDialListMsg PersonalityOptionSpeedDialListMsg, *PPersonalityOptionSpeedDialListMsg;

struct PersonalityOptionSpeedDialListMsg { /* PlaceHolder Class Structure */
};

typedef struct PersonalityOptionUserProvisionMsg PersonalityOptionUserProvisionMsg, *PPersonalityOptionUserProvisionMsg;

struct PersonalityOptionUserProvisionMsg { /* PlaceHolder Class Structure */
};

typedef struct PresenceDAO PresenceDAO, *PPresenceDAO;

struct PresenceDAO { /* PlaceHolder Class Structure */
};

typedef struct PresenceOptionMsg PresenceOptionMsg, *PPresenceOptionMsg;

struct PresenceOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct PresentityIdOptionMsg PresentityIdOptionMsg, *PPresentityIdOptionMsg;

struct PresentityIdOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct PresentityIdOptionMsgIterator PresentityIdOptionMsgIterator, *PPresentityIdOptionMsgIterator;

struct PresentityIdOptionMsgIterator { /* PlaceHolder Class Structure */
};

typedef struct PrNotifyAckMsg PrNotifyAckMsg, *PPrNotifyAckMsg;

struct PrNotifyAckMsg { /* PlaceHolder Class Structure */
};

typedef struct ProcessorFactory ProcessorFactory, *PProcessorFactory;

struct ProcessorFactory { /* PlaceHolder Class Structure */
};

typedef struct ProfileDAO ProfileDAO, *PProfileDAO;

struct ProfileDAO { /* PlaceHolder Class Structure */
};

typedef struct ProfileGroupMap ProfileGroupMap, *PProfileGroupMap;

struct ProfileGroupMap { /* PlaceHolder Class Structure */
};

typedef struct ProfileGroupMapDAO ProfileGroupMapDAO, *PProfileGroupMapDAO;

struct ProfileGroupMapDAO { /* PlaceHolder Class Structure */
};

typedef struct ProvisioningStateMachine ProvisioningStateMachine, *PProvisioningStateMachine;

struct ProvisioningStateMachine { /* PlaceHolder Class Structure */
};

typedef struct ProvisionMsgParser ProvisionMsgParser, *PProvisionMsgParser;

struct ProvisionMsgParser { /* PlaceHolder Class Structure */
};

typedef struct ProvisionOptionMsgIterator ProvisionOptionMsgIterator, *PProvisionOptionMsgIterator;

struct ProvisionOptionMsgIterator { /* PlaceHolder Class Structure */
};

typedef struct ProvStateInProcess ProvStateInProcess, *PProvStateInProcess;

struct ProvStateInProcess { /* PlaceHolder Class Structure */
};

typedef struct ProvStateNotProvisioned ProvStateNotProvisioned, *PProvStateNotProvisioned;

struct ProvStateNotProvisioned { /* PlaceHolder Class Structure */
};

typedef struct ProvStateProvisioned ProvStateProvisioned, *PProvStateProvisioned;

struct ProvStateProvisioned { /* PlaceHolder Class Structure */
};

typedef struct PrPublishAckMsg PrPublishAckMsg, *PPrPublishAckMsg;

struct PrPublishAckMsg { /* PlaceHolder Class Structure */
};

typedef struct PrPublishLocationMsg PrPublishLocationMsg, *PPrPublishLocationMsg;

struct PrPublishLocationMsg { /* PlaceHolder Class Structure */
};

typedef struct PrPublishMsg PrPublishMsg, *PPrPublishMsg;

struct PrPublishMsg { /* PlaceHolder Class Structure */
};

typedef struct PrSubscribeAckMsg PrSubscribeAckMsg, *PPrSubscribeAckMsg;

struct PrSubscribeAckMsg { /* PlaceHolder Class Structure */
};

typedef struct PrSubscribeMsg PrSubscribeMsg, *PPrSubscribeMsg;

struct PrSubscribeMsg { /* PlaceHolder Class Structure */
};

typedef struct PrSyncAckMsg PrSyncAckMsg, *PPrSyncAckMsg;

struct PrSyncAckMsg { /* PlaceHolder Class Structure */
};

typedef struct PSSActivateAckMsg PSSActivateAckMsg, *PPSSActivateAckMsg;

struct PSSActivateAckMsg { /* PlaceHolder Class Structure */
};

typedef struct PSSActivateMsg PSSActivateMsg, *PPSSActivateMsg;

struct PSSActivateMsg { /* PlaceHolder Class Structure */
};

typedef struct PSSActivateOptionMsg PSSActivateOptionMsg, *PPSSActivateOptionMsg;

struct PSSActivateOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct PSSDeactivateAckMsg PSSDeactivateAckMsg, *PPSSDeactivateAckMsg;

struct PSSDeactivateAckMsg { /* PlaceHolder Class Structure */
};

typedef struct PSSDeactivateMsg PSSDeactivateMsg, *PPSSDeactivateMsg;

struct PSSDeactivateMsg { /* PlaceHolder Class Structure */
};

typedef struct PSSTeardownOptionMsg PSSTeardownOptionMsg, *PPSSTeardownOptionMsg;

struct PSSTeardownOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct ReceiptTimeoutOptionMsg ReceiptTimeoutOptionMsg, *PReceiptTimeoutOptionMsg;

struct ReceiptTimeoutOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct ReceiverThread ReceiverThread, *PReceiverThread;

struct ReceiverThread { /* PlaceHolder Class Structure */
};

typedef struct RegAckScanAckTimers RegAckScanAckTimers, *PRegAckScanAckTimers;

struct RegAckScanAckTimers { /* PlaceHolder Class Structure */
};

typedef struct RegisterAck2Msg RegisterAck2Msg, *PRegisterAck2Msg;

struct RegisterAck2Msg { /* PlaceHolder Class Structure */
};

typedef struct RegisterAck3Msg RegisterAck3Msg, *PRegisterAck3Msg;

struct RegisterAck3Msg { /* PlaceHolder Class Structure */
};

typedef struct RegisterAck5Msg RegisterAck5Msg, *PRegisterAck5Msg;

struct RegisterAck5Msg { /* PlaceHolder Class Structure */
};

typedef struct RegisterAck6Msg RegisterAck6Msg, *PRegisterAck6Msg;

struct RegisterAck6Msg { /* PlaceHolder Class Structure */
};

typedef struct RegisterAck7Msg RegisterAck7Msg, *PRegisterAck7Msg;

struct RegisterAck7Msg { /* PlaceHolder Class Structure */
};

typedef struct RegisterAckMsg RegisterAckMsg, *PRegisterAckMsg;

struct RegisterAckMsg { /* PlaceHolder Class Structure */
};

typedef struct RegisterInterResponse8MChalViMsg RegisterInterResponse8MChalViMsg, *PRegisterInterResponse8MChalViMsg;

struct RegisterInterResponse8MChalViMsg { /* PlaceHolder Class Structure */
};

typedef struct RegisterInterResponse8MCresMsg RegisterInterResponse8MCresMsg, *PRegisterInterResponse8MCresMsg;

struct RegisterInterResponse8MCresMsg { /* PlaceHolder Class Structure */
};

typedef struct RegisterInterResponse8Msg RegisterInterResponse8Msg, *PRegisterInterResponse8Msg;

struct RegisterInterResponse8Msg { /* PlaceHolder Class Structure */
};

typedef struct RegisterInterResponseMsg RegisterInterResponseMsg, *PRegisterInterResponseMsg;

struct RegisterInterResponseMsg { /* PlaceHolder Class Structure */
};

typedef struct RegisterRequest7AllOptionsMsg RegisterRequest7AllOptionsMsg, *PRegisterRequest7AllOptionsMsg;

struct RegisterRequest7AllOptionsMsg { /* PlaceHolder Class Structure */
};

typedef struct RegistrationStateMachine RegistrationStateMachine, *PRegistrationStateMachine;

struct RegistrationStateMachine { /* PlaceHolder Class Structure */
};

typedef struct RegOptionMChalMsg RegOptionMChalMsg, *PRegOptionMChalMsg;

struct RegOptionMChalMsg { /* PlaceHolder Class Structure */
};

typedef struct RegOptionMCresMsg RegOptionMCresMsg, *PRegOptionMCresMsg;

struct RegOptionMCresMsg { /* PlaceHolder Class Structure */
};

typedef struct RegOptionMsgIterator RegOptionMsgIterator, *PRegOptionMsgIterator;

struct RegOptionMsgIterator { /* PlaceHolder Class Structure */
};

typedef struct RegPage4Msg RegPage4Msg, *PRegPage4Msg;

struct RegPage4Msg { /* PlaceHolder Class Structure */
};

typedef struct RegPageMsg RegPageMsg, *PRegPageMsg;

struct RegPageMsg { /* PlaceHolder Class Structure */
};

typedef struct RegStateBase RegStateBase, *PRegStateBase;

struct RegStateBase { /* PlaceHolder Class Structure */
};

typedef struct RegStateNotRegistered RegStateNotRegistered, *PRegStateNotRegistered;

struct RegStateNotRegistered { /* PlaceHolder Class Structure */
};

typedef struct RegStateRegistered RegStateRegistered, *PRegStateRegistered;

struct RegStateRegistered { /* PlaceHolder Class Structure */
};

typedef struct ReleaseRequest2Msg ReleaseRequest2Msg, *PReleaseRequest2Msg;

struct ReleaseRequest2Msg { /* PlaceHolder Class Structure */
};

typedef struct ReleaseRequestMsg ReleaseRequestMsg, *PReleaseRequestMsg;

struct ReleaseRequestMsg { /* PlaceHolder Class Structure */
};

typedef struct ResponderListEntryIterator ResponderListEntryIterator, *PResponderListEntryIterator;

struct ResponderListEntryIterator { /* PlaceHolder Class Structure */
};

typedef struct ResponderListEntryMsg ResponderListEntryMsg, *PResponderListEntryMsg;

struct ResponderListEntryMsg { /* PlaceHolder Class Structure */
};

typedef struct ScanParmsAckMsg ScanParmsAckMsg, *PScanParmsAckMsg;

struct ScanParmsAckMsg { /* PlaceHolder Class Structure */
};

typedef struct ScanParmsMsg ScanParmsMsg, *PScanParmsMsg;

struct ScanParmsMsg { /* PlaceHolder Class Structure */
};

typedef struct SetupRequest3Msg SetupRequest3Msg, *PSetupRequest3Msg;

struct SetupRequest3Msg { /* PlaceHolder Class Structure */
};

typedef struct SetupRequest5Msg SetupRequest5Msg, *PSetupRequest5Msg;

struct SetupRequest5Msg { /* PlaceHolder Class Structure */
};

typedef struct SetupRequest8Msg SetupRequest8Msg, *PSetupRequest8Msg;

struct SetupRequest8Msg { /* PlaceHolder Class Structure */
};

typedef struct SetupRequestMsg SetupRequestMsg, *PSetupRequestMsg;

struct SetupRequestMsg { /* PlaceHolder Class Structure */
};

typedef struct ShortLocationReportOptionMsg ShortLocationReportOptionMsg, *PShortLocationReportOptionMsg;

struct ShortLocationReportOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct SimpleBeOnQueryRule SimpleBeOnQueryRule, *PSimpleBeOnQueryRule;

struct SimpleBeOnQueryRule { /* PlaceHolder Class Structure */
};

typedef struct SimpleQueryRule SimpleQueryRule, *PSimpleQueryRule;

struct SimpleQueryRule { /* PlaceHolder Class Structure */
};

typedef struct SlidingWindow SlidingWindow, *PSlidingWindow;

struct SlidingWindow { /* PlaceHolder Class Structure */
};

typedef struct SlnDAO SlnDAO, *PSlnDAO;

struct SlnDAO { /* PlaceHolder Class Structure */
};

typedef struct SlnGroupMapDAO SlnGroupMapDAO, *PSlnGroupMapDAO;

struct SlnGroupMapDAO { /* PlaceHolder Class Structure */
};

typedef struct SocketProcess SocketProcess, *PSocketProcess;

struct SocketProcess { /* PlaceHolder Class Structure */
};

typedef struct State State, *PState;

struct State { /* PlaceHolder Class Structure */
};

typedef struct StateMachine StateMachine, *PStateMachine;

struct StateMachine { /* PlaceHolder Class Structure */
};

typedef struct SystemFeaturesOptionMsg SystemFeaturesOptionMsg, *PSystemFeaturesOptionMsg;

struct SystemFeaturesOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct TestAckMsg TestAckMsg, *PTestAckMsg;

struct TestAckMsg { /* PlaceHolder Class Structure */
};

typedef struct TestConnectionThread TestConnectionThread, *PTestConnectionThread;

struct TestConnectionThread { /* PlaceHolder Class Structure */
};

typedef struct TestMsg TestMsg, *PTestMsg;

struct TestMsg { /* PlaceHolder Class Structure */
};

typedef struct TileServerOptionMsg TileServerOptionMsg, *PTileServerOptionMsg;

struct TileServerOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct UeEventRetentionOptionMsg UeEventRetentionOptionMsg, *PUeEventRetentionOptionMsg;

struct UeEventRetentionOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct UEProvisionAckMsg UEProvisionAckMsg, *PUEProvisionAckMsg;

struct UEProvisionAckMsg { /* PlaceHolder Class Structure */
};

typedef struct UEProvisionMsg UEProvisionMsg, *PUEProvisionMsg;

struct UEProvisionMsg { /* PlaceHolder Class Structure */
};

typedef struct UnknownRegOptionMsg UnknownRegOptionMsg, *PUnknownRegOptionMsg;

struct UnknownRegOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct UsDistribution3LocationMsg UsDistribution3LocationMsg, *PUsDistribution3LocationMsg;

struct UsDistribution3LocationMsg { /* PlaceHolder Class Structure */
};

typedef struct UsDistributionAck3DataReportMsg UsDistributionAck3DataReportMsg, *PUsDistributionAck3DataReportMsg;

struct UsDistributionAck3DataReportMsg { /* PlaceHolder Class Structure */
};

typedef struct UsDistributionAck3LocationMsg UsDistributionAck3LocationMsg, *PUsDistributionAck3LocationMsg;

struct UsDistributionAck3LocationMsg { /* PlaceHolder Class Structure */
};

typedef struct UsDistributionAck3Msg UsDistributionAck3Msg, *PUsDistributionAck3Msg;

struct UsDistributionAck3Msg { /* PlaceHolder Class Structure */
};

typedef struct UsDistributionAck3ResponseMsg UsDistributionAck3ResponseMsg, *PUsDistributionAck3ResponseMsg;

struct UsDistributionAck3ResponseMsg { /* PlaceHolder Class Structure */
};

typedef struct UsDistributionMsg UsDistributionMsg, *PUsDistributionMsg;

struct UsDistributionMsg { /* PlaceHolder Class Structure */
};

typedef struct UserPresentityData UserPresentityData, *PUserPresentityData;

struct UserPresentityData { /* PlaceHolder Class Structure */
};

typedef struct UserPresentityDataWithOptions UserPresentityDataWithOptions, *PUserPresentityDataWithOptions;

struct UserPresentityDataWithOptions { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionDefaultGroupBindingMsg UserProvisionDefaultGroupBindingMsg, *PUserProvisionDefaultGroupBindingMsg;

struct UserProvisionDefaultGroupBindingMsg { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionDefaultPstnBindingMsg UserProvisionDefaultPstnBindingMsg, *PUserProvisionDefaultPstnBindingMsg;

struct UserProvisionDefaultPstnBindingMsg { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionDefaultUnitToUnitBindingMsg UserProvisionDefaultUnitToUnitBindingMsg, *PUserProvisionDefaultUnitToUnitBindingMsg;

struct UserProvisionDefaultUnitToUnitBindingMsg { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionEncryptedGroupListIterator UserProvisionEncryptedGroupListIterator, *PUserProvisionEncryptedGroupListIterator;

struct UserProvisionEncryptedGroupListIterator { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionEncryptedGroupListOptionMsg UserProvisionEncryptedGroupListOptionMsg, *PUserProvisionEncryptedGroupListOptionMsg;

struct UserProvisionEncryptedGroupListOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionGroupBindingMsg UserProvisionGroupBindingMsg, *PUserProvisionGroupBindingMsg;

struct UserProvisionGroupBindingMsg { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionGroupListEntryMsg UserProvisionGroupListEntryMsg, *PUserProvisionGroupListEntryMsg;

struct UserProvisionGroupListEntryMsg { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionIterator UserProvisionIterator, *PUserProvisionIterator;

struct UserProvisionIterator { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionKmfBindingMsg UserProvisionKmfBindingMsg, *PUserProvisionKmfBindingMsg;

struct UserProvisionKmfBindingMsg { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionPstnBindingMsg UserProvisionPstnBindingMsg, *PUserProvisionPstnBindingMsg;

struct UserProvisionPstnBindingMsg { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionSlnBindingMsg UserProvisionSlnBindingMsg, *PUserProvisionSlnBindingMsg;

struct UserProvisionSlnBindingMsg { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionUnboundKeyMsg UserProvisionUnboundKeyMsg, *PUserProvisionUnboundKeyMsg;

struct UserProvisionUnboundKeyMsg { /* PlaceHolder Class Structure */
};

typedef struct UserProvisionUnitToUnitBindingMsg UserProvisionUnitToUnitBindingMsg, *PUserProvisionUnitToUnitBindingMsg;

struct UserProvisionUnitToUnitBindingMsg { /* PlaceHolder Class Structure */
};

typedef struct UserServicesManager UserServicesManager, *PUserServicesManager;

struct UserServicesManager { /* PlaceHolder Class Structure */
};

typedef struct UsInitAckMsg UsInitAckMsg, *PUsInitAckMsg;

struct UsInitAckMsg { /* PlaceHolder Class Structure */
};

typedef struct UsInitReq3DataMsg UsInitReq3DataMsg, *PUsInitReq3DataMsg;

struct UsInitReq3DataMsg { /* PlaceHolder Class Structure */
};

typedef struct UsInitReq3DataReportMsg UsInitReq3DataReportMsg, *PUsInitReq3DataReportMsg;

struct UsInitReq3DataReportMsg { /* PlaceHolder Class Structure */
};

typedef struct UsInitReq3LocationMsg UsInitReq3LocationMsg, *PUsInitReq3LocationMsg;

struct UsInitReq3LocationMsg { /* PlaceHolder Class Structure */
};

typedef struct UsInitReq3Msg UsInitReq3Msg, *PUsInitReq3Msg;

struct UsInitReq3Msg { /* PlaceHolder Class Structure */
};

typedef struct UsInitReqMsg UsInitReqMsg, *PUsInitReqMsg;

struct UsInitReqMsg { /* PlaceHolder Class Structure */
};

typedef struct UsReceipt7Msg UsReceipt7Msg, *PUsReceipt7Msg;

struct UsReceipt7Msg { /* PlaceHolder Class Structure */
};

typedef struct UsReceiptAckMsg UsReceiptAckMsg, *PUsReceiptAckMsg;

struct UsReceiptAckMsg { /* PlaceHolder Class Structure */
};

typedef struct UsReceiptMsg UsReceiptMsg, *PUsReceiptMsg;

struct UsReceiptMsg { /* PlaceHolder Class Structure */
};

typedef struct VideoServerOptionMsg VideoServerOptionMsg, *PVideoServerOptionMsg;

struct VideoServerOptionMsg { /* PlaceHolder Class Structure */
};

typedef struct Voice3Msg Voice3Msg, *PVoice3Msg;

struct Voice3Msg { /* PlaceHolder Class Structure */
};

typedef struct VoiceDecoderAmbeFullRate VoiceDecoderAmbeFullRate, *PVoiceDecoderAmbeFullRate;

struct VoiceDecoderAmbeFullRate { /* PlaceHolder Class Structure */
};

typedef struct VoiceDecoderAmbeHalfRate VoiceDecoderAmbeHalfRate, *PVoiceDecoderAmbeHalfRate;

struct VoiceDecoderAmbeHalfRate { /* PlaceHolder Class Structure */
};

typedef struct VoiceDecoderAmrWb VoiceDecoderAmrWb, *PVoiceDecoderAmrWb;

struct VoiceDecoderAmrWb { /* PlaceHolder Class Structure */
};

typedef struct VoiceDecoderBase VoiceDecoderBase, *PVoiceDecoderBase;

struct VoiceDecoderBase { /* PlaceHolder Class Structure */
};

typedef struct VoiceDecoderNull VoiceDecoderNull, *PVoiceDecoderNull;

struct VoiceDecoderNull { /* PlaceHolder Class Structure */
};

typedef struct VoiceEncoderAmbeFullRate VoiceEncoderAmbeFullRate, *PVoiceEncoderAmbeFullRate;

struct VoiceEncoderAmbeFullRate { /* PlaceHolder Class Structure */
};

typedef struct VoiceEncoderAmbeHalfRate VoiceEncoderAmbeHalfRate, *PVoiceEncoderAmbeHalfRate;

struct VoiceEncoderAmbeHalfRate { /* PlaceHolder Class Structure */
};

typedef struct VoiceEncoderAmrWb VoiceEncoderAmrWb, *PVoiceEncoderAmrWb;

struct VoiceEncoderAmrWb { /* PlaceHolder Class Structure */
};

typedef struct VoiceEncoderBase VoiceEncoderBase, *PVoiceEncoderBase;

struct VoiceEncoderBase { /* PlaceHolder Class Structure */
};

typedef struct VoiceEncoderNull VoiceEncoderNull, *PVoiceEncoderNull;

struct VoiceEncoderNull { /* PlaceHolder Class Structure */
};

typedef struct VoiceMsg VoiceMsg, *PVoiceMsg;

struct VoiceMsg { /* PlaceHolder Class Structure */
};

typedef struct VoiceUtils VoiceUtils, *PVoiceUtils;

struct VoiceUtils { /* PlaceHolder Class Structure */
};

typedef struct WakeupAckMsg WakeupAckMsg, *PWakeupAckMsg;

struct WakeupAckMsg { /* PlaceHolder Class Structure */
};

typedef struct WakeupMsg WakeupMsg, *PWakeupMsg;

struct WakeupMsg { /* PlaceHolder Class Structure */
};

typedef struct WorkQueue WorkQueue, *PWorkQueue;

struct WorkQueue { /* PlaceHolder Class Structure */
};

typedef struct bio_st bio_st, *Pbio_st;

typedef struct bio_st BIO;

typedef struct bio_method_st bio_method_st, *Pbio_method_st;

typedef void (bio_info_cb)(struct bio_st *, int, char *, int, long, long);

typedef struct bio_method_st BIO_METHOD;

typedef struct crypto_ex_data_st crypto_ex_data_st, *Pcrypto_ex_data_st;

typedef struct crypto_ex_data_st CRYPTO_EX_DATA;

typedef struct stack_st_void stack_st_void, *Pstack_st_void;

struct crypto_ex_data_st {
    struct stack_st_void * sk;
    int dummy;
};

struct bio_method_st {
    int type;
    char * name;
    int (* bwrite)(BIO *, char *, int);
    int (* bread)(BIO *, char *, int);
    int (* bputs)(BIO *, char *);
    int (* bgets)(BIO *, char *, int);
    long (* ctrl)(BIO *, int, long, void *);
    int (* create)(BIO *);
    int (* destroy)(BIO *);
    long (* callback_ctrl)(BIO *, int, bio_info_cb *);
};

struct bio_st {
    BIO_METHOD * method;
    long (* callback)(struct bio_st *, int, char *, int, long, long);
    char * cb_arg;
    int init;
    int shutdown;
    int flags;
    int retry_reason;
    int num;
    void * ptr;
    struct bio_st * next_bio;
    struct bio_st * prev_bio;
    int references;
    ulong num_read;
    ulong num_write;
    CRYPTO_EX_DATA ex_data;
};

struct stack_st_void {
    _STACK stack;
};

typedef struct hostent hostent, *Phostent;

struct hostent {
    char * h_name;
    char * * h_aliases;
    int h_addrtype;
    int h_length;
    char * * h_addr_list;
};

typedef union _union_175 _union_175, *P_union_175;

typedef struct bn_gencb_st bn_gencb_st, *Pbn_gencb_st;

typedef struct bn_gencb_st BN_GENCB;

union _union_175 {
    void (* cb_1)(int, int, void *);
    int (* cb_2)(int, int, BN_GENCB *);
};

struct bn_gencb_st {
    uint ver;
    void * arg;
    union _union_175 cb;
};

typedef struct comp_ctx_st comp_ctx_st, *Pcomp_ctx_st;

typedef struct comp_ctx_st COMP_CTX;

typedef struct comp_method_st comp_method_st, *Pcomp_method_st;

typedef struct comp_method_st COMP_METHOD;

struct comp_ctx_st {
    COMP_METHOD * meth;
    ulong compress_in;
    ulong compress_out;
    ulong expand_in;
    ulong expand_out;
    CRYPTO_EX_DATA ex_data;
};

struct comp_method_st {
    int type;
    char * name;
    int (* init)(COMP_CTX *);
    void (* finish)(COMP_CTX *);
    int (* compress)(COMP_CTX *, uchar *, uint, uchar *, uint);
    int (* expand)(COMP_CTX *, uchar *, uint, uchar *, uint);
    long (* ctrl)(void);
    long (* callback_ctrl)(void);
};

typedef struct crypto_threadid_st crypto_threadid_st, *Pcrypto_threadid_st;

typedef struct crypto_threadid_st CRYPTO_THREADID;

struct crypto_threadid_st {
    void * ptr;
    ulong val;
};

typedef dword DataType;

typedef dword OperationType;

typedef dword ReturnCode;


/* WARNING! conflicting data type names: /Demangler/BeOn/BeOnSocket/State - /BeOn/State */

typedef dword SubscriptionRequestType;

typedef dword DtlsState;

typedef dword NodeType;

typedef struct SocketStatus SocketStatus, *PSocketStatus;

struct SocketStatus { /* PlaceHolder Structure */
};

typedef dword FunctionCode;

typedef dword KeyBindType;

typedef dword SmartLocationSetting;

typedef dword LocationFormat;

typedef dword MobileMsgId;

typedef dword PersonalityOption;

typedef dword RegOption;

typedef dword ServiceOption;

typedef dword AuthenticationState;

typedef dword ReturnStatus;

typedef dword QPType;

typedef dword LapRegResult;

typedef dword PrSubscribeType;

typedef dword SubscriptionDuration;

typedef struct WorkQueueObject WorkQueueObject, *PWorkQueueObject;

struct WorkQueueObject { /* PlaceHolder Structure */
};

typedef struct AbstractOptionMsg AbstractOptionMsg, *PAbstractOptionMsg;

struct AbstractOptionMsg { /* PlaceHolder Structure */
};

typedef struct AbstractUpdateObject AbstractUpdateObject, *PAbstractUpdateObject;

struct AbstractUpdateObject { /* PlaceHolder Structure */
};

typedef struct AckQueueObject AckQueueObject, *PAckQueueObject;

struct AckQueueObject { /* PlaceHolder Structure */
};

typedef struct AddUpdateObject AddUpdateObject, *PAddUpdateObject;

struct AddUpdateObject { /* PlaceHolder Structure */
};

typedef struct AnnGroupOptionMsg AnnGroupOptionMsg, *PAnnGroupOptionMsg;

struct AnnGroupOptionMsg { /* PlaceHolder Structure */
};

typedef struct AudioData AudioData, *PAudioData;

struct AudioData { /* PlaceHolder Structure */
};

typedef struct BaseMsg BaseMsg, *PBaseMsg;

struct BaseMsg { /* PlaceHolder Structure */
};

typedef struct BearerTimers BearerTimers, *PBearerTimers;

struct BearerTimers { /* PlaceHolder Structure */
};

typedef struct BeOnCoreDatabase BeOnCoreDatabase, *PBeOnCoreDatabase;

struct BeOnCoreDatabase { /* PlaceHolder Structure */
};

typedef struct BeOnDataConnectionStatus BeOnDataConnectionStatus, *PBeOnDataConnectionStatus;

struct BeOnDataConnectionStatus { /* PlaceHolder Structure */
};

typedef struct BeOnEntities BeOnEntities, *PBeOnEntities;

struct BeOnEntities { /* PlaceHolder Structure */
};

typedef struct BeOnQueryResult BeOnQueryResult, *PBeOnQueryResult;

struct BeOnQueryResult { /* PlaceHolder Structure */
};

typedef struct BeOnVoicePayloadData BeOnVoicePayloadData, *PBeOnVoicePayloadData;

struct BeOnVoicePayloadData { /* PlaceHolder Structure */
};

typedef struct CancelServiceRequestMsg CancelServiceRequestMsg, *PCancelServiceRequestMsg;

struct CancelServiceRequestMsg { /* PlaceHolder Structure */
};

typedef struct CoreGroup CoreGroup, *PCoreGroup;

struct CoreGroup { /* PlaceHolder Structure */
};

typedef struct CoreGroupInProfile CoreGroupInProfile, *PCoreGroupInProfile;

struct CoreGroupInProfile { /* PlaceHolder Structure */
};

typedef struct CustICallVoice3Msg CustICallVoice3Msg, *PCustICallVoice3Msg;

struct CustICallVoice3Msg { /* PlaceHolder Structure */
};

typedef struct CustPersonalityOptionUserProvisionMsg CustPersonalityOptionUserProvisionMsg, *PCustPersonalityOptionUserProvisionMsg;

struct CustPersonalityOptionUserProvisionMsg { /* PlaceHolder Structure */
};

typedef struct CustPSSActivateOptionMsg CustPSSActivateOptionMsg, *PCustPSSActivateOptionMsg;

struct CustPSSActivateOptionMsg { /* PlaceHolder Structure */
};

typedef struct CustUsReceipt7Msg CustUsReceipt7Msg, *PCustUsReceipt7Msg;

struct CustUsReceipt7Msg { /* PlaceHolder Structure */
};

typedef struct CustVoice3Msg CustVoice3Msg, *PCustVoice3Msg;

struct CustVoice3Msg { /* PlaceHolder Structure */
};

typedef struct DataReportResponderListEntryMsg DataReportResponderListEntryMsg, *PDataReportResponderListEntryMsg;

struct DataReportResponderListEntryMsg { /* PlaceHolder Structure */
};

typedef struct DefaultTimer DefaultTimer, *PDefaultTimer;

struct DefaultTimer { /* PlaceHolder Structure */
};

typedef struct DelUpdateObject DelUpdateObject, *PDelUpdateObject;

struct DelUpdateObject { /* PlaceHolder Structure */
};

typedef struct EmergencyAlarm5Msg EmergencyAlarm5Msg, *PEmergencyAlarm5Msg;

struct EmergencyAlarm5Msg { /* PlaceHolder Structure */
};

typedef struct EventQueueObject EventQueueObject, *PEventQueueObject;

struct EventQueueObject { /* PlaceHolder Structure */
};

typedef struct GroupEmergencyStateMachine GroupEmergencyStateMachine, *PGroupEmergencyStateMachine;

struct GroupEmergencyStateMachine { /* PlaceHolder Structure */
};

typedef struct IBeOnDbConn IBeOnDbConn, *PIBeOnDbConn;

struct IBeOnDbConn { /* PlaceHolder Structure */
};

typedef struct IBeOnDbStatement IBeOnDbStatement, *PIBeOnDbStatement;

struct IBeOnDbStatement { /* PlaceHolder Structure */
};

typedef struct IBeOnExtendedCore IBeOnExtendedCore, *PIBeOnExtendedCore;

struct IBeOnExtendedCore { /* PlaceHolder Structure */
};

typedef struct IBeOnQueryResult IBeOnQueryResult, *PIBeOnQueryResult;

struct IBeOnQueryResult { /* PlaceHolder Structure */
};

typedef struct IBeOnQueryRule IBeOnQueryRule, *PIBeOnQueryRule;

struct IBeOnQueryRule { /* PlaceHolder Structure */
};

typedef struct IBeOnResultChangeListener IBeOnResultChangeListener, *PIBeOnResultChangeListener;

struct IBeOnResultChangeListener { /* PlaceHolder Structure */
};

typedef struct IBeOnSocket IBeOnSocket, *PIBeOnSocket;

struct IBeOnSocket { /* PlaceHolder Structure */
};

typedef struct IDownloadListener IDownloadListener, *PIDownloadListener;

struct IDownloadListener { /* PlaceHolder Structure */
};

typedef struct ILocationDecrypter ILocationDecrypter, *PILocationDecrypter;

struct ILocationDecrypter { /* PlaceHolder Structure */
};

typedef struct ILocationEncrypter ILocationEncrypter, *PILocationEncrypter;

struct ILocationEncrypter { /* PlaceHolder Structure */
};

typedef struct IncallControlMsg IncallControlMsg, *PIncallControlMsg;

struct IncallControlMsg { /* PlaceHolder Structure */
};

typedef struct IVoiceEncrypter IVoiceEncrypter, *PIVoiceEncrypter;

struct IVoiceEncrypter { /* PlaceHolder Structure */
};

typedef struct IVoicePlayBack IVoicePlayBack, *PIVoicePlayBack;

struct IVoicePlayBack { /* PlaceHolder Structure */
};

typedef struct LapQueueObject LapQueueObject, *PLapQueueObject;

struct LapQueueObject { /* PlaceHolder Structure */
};

typedef struct MobileMsg MobileMsg, *PMobileMsg;

struct MobileMsg { /* PlaceHolder Structure */
};

typedef struct ModUpdateObject ModUpdateObject, *PModUpdateObject;

struct ModUpdateObject { /* PlaceHolder Structure */
};

typedef struct OtarServiceMsg OtarServiceMsg, *POtarServiceMsg;

struct OtarServiceMsg { /* PlaceHolder Structure */
};

typedef struct P3000Msg P3000Msg, *PP3000Msg;

struct P3000Msg { /* PlaceHolder Structure */
};

typedef struct PatchSimulselect PatchSimulselect, *PPatchSimulselect;

struct PatchSimulselect { /* PlaceHolder Structure */
};

typedef struct Personality Personality, *PPersonality;

struct Personality { /* PlaceHolder Structure */
};

typedef struct PersonalityOptionAddProfileExtMsg PersonalityOptionAddProfileExtMsg, *PPersonalityOptionAddProfileExtMsg;

struct PersonalityOptionAddProfileExtMsg { /* PlaceHolder Structure */
};

typedef struct PersonalityOptionBasicInfoMsg PersonalityOptionBasicInfoMsg, *PPersonalityOptionBasicInfoMsg;

struct PersonalityOptionBasicInfoMsg { /* PlaceHolder Structure */
};

typedef struct PersonalityOptionDeleteVGCharExtMsg PersonalityOptionDeleteVGCharExtMsg, *PPersonalityOptionDeleteVGCharExtMsg;

struct PersonalityOptionDeleteVGCharExtMsg { /* PlaceHolder Structure */
};

typedef struct PersonalityOptionPresenceStatusMsg PersonalityOptionPresenceStatusMsg, *PPersonalityOptionPresenceStatusMsg;

struct PersonalityOptionPresenceStatusMsg { /* PlaceHolder Structure */
};

typedef struct PersonalityOptionPTTUserDefinitionMsg PersonalityOptionPTTUserDefinitionMsg, *PPersonalityOptionPTTUserDefinitionMsg;

struct PersonalityOptionPTTUserDefinitionMsg { /* PlaceHolder Structure */
};

typedef struct PersonalityOptionSequenceNumberMsg PersonalityOptionSequenceNumberMsg, *PPersonalityOptionSequenceNumberMsg;

struct PersonalityOptionSequenceNumberMsg { /* PlaceHolder Structure */
};

typedef struct PersonalityOptionUserDefinitionMsg PersonalityOptionUserDefinitionMsg, *PPersonalityOptionUserDefinitionMsg;

struct PersonalityOptionUserDefinitionMsg { /* PlaceHolder Structure */
};

typedef struct PersonalityOptionVgParametersExtMsg PersonalityOptionVgParametersExtMsg, *PPersonalityOptionVgParametersExtMsg;

struct PersonalityOptionVgParametersExtMsg { /* PlaceHolder Structure */
};

typedef struct PrNotifyMsg PrNotifyMsg, *PPrNotifyMsg;

struct PrNotifyMsg { /* PlaceHolder Structure */
};

typedef struct PrSyncMsg PrSyncMsg, *PPrSyncMsg;

struct PrSyncMsg { /* PlaceHolder Structure */
};

typedef struct RegOptionExplicitScan5Msg RegOptionExplicitScan5Msg, *PRegOptionExplicitScan5Msg;

struct RegOptionExplicitScan5Msg { /* PlaceHolder Structure */
};

typedef struct RegOptionVIChalMsg RegOptionVIChalMsg, *PRegOptionVIChalMsg;

struct RegOptionVIChalMsg { /* PlaceHolder Structure */
};

typedef struct RegOptionVICresMsg RegOptionVICresMsg, *PRegOptionVICresMsg;

struct RegOptionVICresMsg { /* PlaceHolder Structure */
};

typedef struct ReplaceUpdateObject ReplaceUpdateObject, *PReplaceUpdateObject;

struct ReplaceUpdateObject { /* PlaceHolder Structure */
};

typedef struct ScanInfo ScanInfo, *PScanInfo;

struct ScanInfo { /* PlaceHolder Structure */
};

typedef struct ScanInfoMsg ScanInfoMsg, *PScanInfoMsg;

struct ScanInfoMsg { /* PlaceHolder Structure */
};

typedef struct SlnGroupMap SlnGroupMap, *PSlnGroupMap;

struct SlnGroupMap { /* PlaceHolder Structure */
};

typedef struct SourceReference SourceReference, *PSourceReference;

struct SourceReference { /* PlaceHolder Structure */
};

typedef dword StateId;

typedef struct UsDistribution3DataMsg UsDistribution3DataMsg, *PUsDistribution3DataMsg;

struct UsDistribution3DataMsg { /* PlaceHolder Structure */
};

typedef struct UsDistribution3DataReportMsg UsDistribution3DataReportMsg, *PUsDistribution3DataReportMsg;

struct UsDistribution3DataReportMsg { /* PlaceHolder Structure */
};

typedef struct UsDistribution3Msg UsDistribution3Msg, *PUsDistribution3Msg;

struct UsDistribution3Msg { /* PlaceHolder Structure */
};

typedef struct VoiceProcessor VoiceProcessor, *PVoiceProcessor;

struct VoiceProcessor { /* PlaceHolder Structure */
};

typedef dword AlertType;

typedef dword ClearerType;

typedef dword AirlinkTechnology;

typedef dword EventType;

typedef dword GroupTextReceiptType;

typedef dword ScanPriority;

typedef dword SubscriptionType;

typedef dword EmergencyBehavior;

typedef dword CryptoNetAlgorithm;

typedef dword EquipmentType;

typedef dword ToneType;

typedef dword ClientType;

typedef dword DataConnectionStatus;

typedef dword DeviceIdType;

typedef dword FeatureType;

typedef dword SystemFeatureType;

typedef dword Reason;

typedef dword Status;

typedef dword Type;

typedef struct KeyFileStatus KeyFileStatus, *PKeyFileStatus;

struct KeyFileStatus { /* PlaceHolder Structure */
};

typedef dword LogLevel;

typedef dword ObjectType;

typedef dword KmtStoreAction;

typedef dword Kind;

typedef struct ErrorInfo ErrorInfo, *PErrorInfo;

struct ErrorInfo { /* PlaceHolder Structure */
};

typedef struct StructuredError StructuredError, *PStructuredError;

struct StructuredError { /* PlaceHolder Structure */
};

typedef struct Token Token, *PToken;

struct Token { /* PlaceHolder Structure */
};

typedef dword TokenType;

typedef dword DuplicationPolicy;

typedef dword CommentPlacement;

typedef struct StaticString StaticString, *PStaticString;

struct StaticString { /* PlaceHolder Structure */
};

typedef struct Value Value, *PValue;

struct Value { /* PlaceHolder Structure */
};

typedef dword ValueType;

typedef struct TimeStampedBeOnGroupMembership TimeStampedBeOnGroupMembership, *PTimeStampedBeOnGroupMembership;

struct TimeStampedBeOnGroupMembership { /* PlaceHolder Structure */
};

typedef dword node_type;

typedef struct xml_attribute xml_attribute, *Pxml_attribute;

struct xml_attribute { /* PlaceHolder Structure */
};

typedef struct xml_node xml_node, *Pxml_node;

struct xml_node { /* PlaceHolder Structure */
};

typedef struct sentry sentry, *Psentry;

struct sentry { /* PlaceHolder Structure */
};

typedef dword seekdir;

typedef struct id id, *Pid;

struct id { /* PlaceHolder Structure */
};

typedef dword __deque_iterator;

typedef struct __less __less, *P__less;

struct __less { /* PlaceHolder Structure */
};

typedef dword __list_const_iterator;

typedef dword __map_const_iterator;

typedef struct __map_iterator __map_iterator, *P__map_iterator;

struct __map_iterator { /* PlaceHolder Structure */
};

typedef struct __split_buffer __split_buffer, *P__split_buffer;

struct __split_buffer { /* PlaceHolder Structure */
};

typedef struct __tree __tree, *P__tree;

struct __tree { /* PlaceHolder Structure */
};

typedef dword __tree_const_iterator;

typedef struct __tree_end_node __tree_end_node, *P__tree_end_node;

struct __tree_end_node { /* PlaceHolder Structure */
};

typedef dword __tree_iterator;

typedef struct __tree_node __tree_node, *P__tree_node;

struct __tree_node { /* PlaceHolder Structure */
};

typedef struct __tree_node_base __tree_node_base, *P__tree_node_base;

struct __tree_node_base { /* PlaceHolder Structure */
};

typedef dword __wrap_iter;

typedef struct allocator allocator, *Pallocator;

struct allocator { /* PlaceHolder Structure */
};

typedef struct basic_istream basic_istream, *Pbasic_istream;

struct basic_istream { /* PlaceHolder Structure */
};

typedef struct basic_ostream basic_ostream, *Pbasic_ostream;

struct basic_ostream { /* PlaceHolder Structure */
};

typedef dword basic_string;

typedef struct basic_string.conflict basic_string.conflict, *Pbasic_string.conflict;

struct basic_string.conflict { /* PlaceHolder Structure */
};

typedef dword fpos;

typedef dword integral_constant;

typedef struct list list, *Plist;

struct list { /* PlaceHolder Structure */
};

typedef dword pair;

typedef struct piecewise_construct_t piecewise_construct_t, *Ppiecewise_construct_t;

struct piecewise_construct_t { /* PlaceHolder Structure */
};

typedef struct tuple tuple, *Ptuple;

struct tuple { /* PlaceHolder Structure */
};

typedef dword unique_ptr;

typedef struct vector vector, *Pvector;

struct vector { /* PlaceHolder Structure */
};

typedef struct _JavaVM _JavaVM, *P_JavaVM;

struct _JavaVM { /* PlaceHolder Structure */
};

typedef struct _jcharArray _jcharArray, *P_jcharArray;

struct _jcharArray { /* PlaceHolder Structure */
};

typedef struct _jclass _jclass, *P_jclass;

struct _jclass { /* PlaceHolder Structure */
};

typedef struct _jintArray _jintArray, *P_jintArray;

struct _jintArray { /* PlaceHolder Structure */
};

typedef struct _jmethodID _jmethodID, *P_jmethodID;

struct _jmethodID { /* PlaceHolder Structure */
};

typedef struct _JNIEnv _JNIEnv, *P_JNIEnv;

struct _JNIEnv { /* PlaceHolder Structure */
};

typedef struct _jobject _jobject, *P_jobject;

struct _jobject { /* PlaceHolder Structure */
};

typedef struct _jobjectArray _jobjectArray, *P_jobjectArray;

struct _jobjectArray { /* PlaceHolder Structure */
};

typedef struct BeOnAudioPlaybackData BeOnAudioPlaybackData, *PBeOnAudioPlaybackData;

struct BeOnAudioPlaybackData { /* PlaceHolder Structure */
};

typedef struct BeOnDataConnection BeOnDataConnection, *PBeOnDataConnection;

struct BeOnDataConnection { /* PlaceHolder Structure */
};

typedef struct BeOnEmergency BeOnEmergency, *PBeOnEmergency;

struct BeOnEmergency { /* PlaceHolder Structure */
};

typedef struct BeOnEntitiesList BeOnEntitiesList, *PBeOnEntitiesList;

struct BeOnEntitiesList { /* PlaceHolder Structure */
};

typedef struct BeOnEntity BeOnEntity, *PBeOnEntity;

struct BeOnEntity { /* PlaceHolder Structure */
};

typedef struct BeOnEventRule BeOnEventRule, *PBeOnEventRule;

struct BeOnEventRule { /* PlaceHolder Structure */
};

typedef struct BeOnGroupMembership BeOnGroupMembership, *PBeOnGroupMembership;

struct BeOnGroupMembership { /* PlaceHolder Structure */
};

typedef struct BeOnGroupSubscription BeOnGroupSubscription, *PBeOnGroupSubscription;

struct BeOnGroupSubscription { /* PlaceHolder Structure */
};

typedef struct BeOnInteger BeOnInteger, *PBeOnInteger;

struct BeOnInteger { /* PlaceHolder Structure */
};

typedef struct BeOnInterestedUeData BeOnInterestedUeData, *PBeOnInterestedUeData;

struct BeOnInterestedUeData { /* PlaceHolder Structure */
};

typedef struct BeOnKeyPresence BeOnKeyPresence, *PBeOnKeyPresence;

struct BeOnKeyPresence { /* PlaceHolder Structure */
};

typedef struct BeOnPatchId BeOnPatchId, *PBeOnPatchId;

struct BeOnPatchId { /* PlaceHolder Structure */
};

typedef struct BeOnSimulselectId BeOnSimulselectId, *PBeOnSimulselectId;

struct BeOnSimulselectId { /* PlaceHolder Structure */
};

typedef dword BeOnTaskId;

typedef struct BeOnUserPresenceLocation BeOnUserPresenceLocation, *PBeOnUserPresenceLocation;

struct BeOnUserPresenceLocation { /* PlaceHolder Structure */
};

typedef dword CachedClass;

typedef struct IBeOnAbstractQueueProcessor IBeOnAbstractQueueProcessor, *PIBeOnAbstractQueueProcessor;

struct IBeOnAbstractQueueProcessor { /* PlaceHolder Structure */
};

typedef struct IBeOnAudioBufferLevelListener IBeOnAudioBufferLevelListener, *PIBeOnAudioBufferLevelListener;

struct IBeOnAudioBufferLevelListener { /* PlaceHolder Structure */
};

typedef struct IBeOnAudioPlaybackProvider IBeOnAudioPlaybackProvider, *PIBeOnAudioPlaybackProvider;

struct IBeOnAudioPlaybackProvider { /* PlaceHolder Structure */
};

typedef struct IBeOnAudioProvider IBeOnAudioProvider, *PIBeOnAudioProvider;

struct IBeOnAudioProvider { /* PlaceHolder Structure */
};

typedef struct IBeOnCore IBeOnCore, *PIBeOnCore;

struct IBeOnCore { /* PlaceHolder Structure */
};

typedef struct IBeOnDataConnectionProvider IBeOnDataConnectionProvider, *PIBeOnDataConnectionProvider;

struct IBeOnDataConnectionProvider { /* PlaceHolder Structure */
};

typedef struct IBeOnEncryptionProvider IBeOnEncryptionProvider, *PIBeOnEncryptionProvider;

struct IBeOnEncryptionProvider { /* PlaceHolder Structure */
};

typedef struct IBeOnEventListener IBeOnEventListener, *PIBeOnEventListener;

struct IBeOnEventListener { /* PlaceHolder Structure */
};

typedef struct IBeOnP25EncryptionLibrary IBeOnP25EncryptionLibrary, *PIBeOnP25EncryptionLibrary;

struct IBeOnP25EncryptionLibrary { /* PlaceHolder Structure */
};

typedef struct IBeOnPowerManagementProvider IBeOnPowerManagementProvider, *PIBeOnPowerManagementProvider;

struct IBeOnPowerManagementProvider { /* PlaceHolder Structure */
};

typedef struct IBeOnQueueObject IBeOnQueueObject, *PIBeOnQueueObject;

struct IBeOnQueueObject { /* PlaceHolder Structure */
};

typedef struct IBeOnSubscriptionManagerEventListener IBeOnSubscriptionManagerEventListener, *PIBeOnSubscriptionManagerEventListener;

struct IBeOnSubscriptionManagerEventListener { /* PlaceHolder Structure */
};

typedef struct IBeOnTimer IBeOnTimer, *PIBeOnTimer;

struct IBeOnTimer { /* PlaceHolder Structure */
};

typedef struct IBeOnTimerListener IBeOnTimerListener, *PIBeOnTimerListener;

struct IBeOnTimerListener { /* PlaceHolder Structure */
};

typedef struct IBeOnVocoder IBeOnVocoder, *PIBeOnVocoder;

struct IBeOnVocoder { /* PlaceHolder Structure */
};

typedef struct IBeOnWorkQueue IBeOnWorkQueue, *PIBeOnWorkQueue;

struct IBeOnWorkQueue { /* PlaceHolder Structure */
};

typedef struct IBeOnWorkQueueProvider IBeOnWorkQueueProvider, *PIBeOnWorkQueueProvider;

struct IBeOnWorkQueueProvider { /* PlaceHolder Structure */
};

typedef struct IKmtListener IKmtListener, *PIKmtListener;

struct IKmtListener { /* PlaceHolder Structure */
};

typedef dword long_long;

typedef struct sqlite3_stmt sqlite3_stmt, *Psqlite3_stmt;

struct sqlite3_stmt { /* PlaceHolder Structure */
};

typedef union _union_771 _union_771, *P_union_771;

typedef uchar DES_cblock[8];

union _union_771 {
    DES_cblock cblock;
    uint deslong[2];
};

typedef uchar const_DES_cblock[8];

typedef struct DES_ks DES_ks, *PDES_ks;

typedef struct DES_ks DES_key_schedule;

struct DES_ks {
    union _union_771 ks[16];
};

typedef struct DSA_SIG_st DSA_SIG_st, *PDSA_SIG_st;

typedef struct DSA_SIG_st DSA_SIG;

typedef struct bignum_st bignum_st, *Pbignum_st;

typedef struct bignum_st BIGNUM;

struct bignum_st {
    ulong * d;
    int top;
    int dmax;
    int neg;
    int flags;
};

struct DSA_SIG_st {
    BIGNUM * r;
    BIGNUM * s;
};

typedef struct dtls1_bitmap_st dtls1_bitmap_st, *Pdtls1_bitmap_st;

typedef struct dtls1_bitmap_st DTLS1_BITMAP;

struct dtls1_bitmap_st {
    ulong map;
    uchar max_seq_num[8];
};

typedef struct dtls1_retransmit_state dtls1_retransmit_state, *Pdtls1_retransmit_state;

typedef struct evp_cipher_ctx_st evp_cipher_ctx_st, *Pevp_cipher_ctx_st;

typedef struct evp_cipher_ctx_st EVP_CIPHER_CTX;

typedef struct env_md_ctx_st env_md_ctx_st, *Penv_md_ctx_st;

typedef ulong size_t;

typedef struct env_md_ctx_st EVP_MD_CTX;

typedef struct ssl_session_st ssl_session_st, *Pssl_session_st;

typedef struct ssl_session_st SSL_SESSION;

typedef struct evp_cipher_st evp_cipher_st, *Pevp_cipher_st;

typedef struct evp_cipher_st EVP_CIPHER;

typedef struct engine_st engine_st, *Pengine_st;

typedef struct engine_st ENGINE;

typedef struct env_md_st env_md_st, *Penv_md_st;

typedef struct env_md_st EVP_MD;

typedef struct evp_pkey_ctx_st evp_pkey_ctx_st, *Pevp_pkey_ctx_st;

typedef struct evp_pkey_ctx_st EVP_PKEY_CTX;

typedef struct sess_cert_st sess_cert_st, *Psess_cert_st;

typedef struct x509_st x509_st, *Px509_st;

typedef struct x509_st X509;

typedef struct ssl_cipher_st ssl_cipher_st, *Pssl_cipher_st;

typedef struct ssl_cipher_st SSL_CIPHER;

typedef struct stack_st_SSL_CIPHER stack_st_SSL_CIPHER, *Pstack_st_SSL_CIPHER;

typedef struct x509_cinf_st x509_cinf_st, *Px509_cinf_st;

typedef struct x509_cinf_st X509_CINF;

typedef struct X509_algor_st X509_algor_st, *PX509_algor_st;

typedef struct X509_algor_st X509_ALGOR;

typedef struct AUTHORITY_KEYID_st AUTHORITY_KEYID_st, *PAUTHORITY_KEYID_st;

typedef struct AUTHORITY_KEYID_st AUTHORITY_KEYID;

typedef struct X509_POLICY_CACHE_st X509_POLICY_CACHE_st, *PX509_POLICY_CACHE_st;

typedef struct X509_POLICY_CACHE_st X509_POLICY_CACHE;

typedef struct stack_st_DIST_POINT stack_st_DIST_POINT, *Pstack_st_DIST_POINT;

typedef struct stack_st_GENERAL_NAME stack_st_GENERAL_NAME, *Pstack_st_GENERAL_NAME;

typedef struct NAME_CONSTRAINTS_st NAME_CONSTRAINTS_st, *PNAME_CONSTRAINTS_st;

typedef struct NAME_CONSTRAINTS_st NAME_CONSTRAINTS;

typedef struct stack_st_IPAddressFamily stack_st_IPAddressFamily, *Pstack_st_IPAddressFamily;

typedef struct ASIdentifiers_st ASIdentifiers_st, *PASIdentifiers_st;

typedef struct x509_cert_aux_st x509_cert_aux_st, *Px509_cert_aux_st;

typedef struct x509_cert_aux_st X509_CERT_AUX;

typedef struct X509_name_st X509_name_st, *PX509_name_st;

typedef struct X509_name_st X509_NAME;

typedef struct X509_val_st X509_val_st, *PX509_val_st;

typedef struct X509_val_st X509_VAL;

typedef struct X509_pubkey_st X509_pubkey_st, *PX509_pubkey_st;

typedef struct X509_pubkey_st X509_PUBKEY;

typedef struct stack_st_X509_EXTENSION stack_st_X509_EXTENSION, *Pstack_st_X509_EXTENSION;

typedef struct stack_st_GENERAL_NAME GENERAL_NAMES;

typedef struct stack_st_GENERAL_SUBTREE stack_st_GENERAL_SUBTREE, *Pstack_st_GENERAL_SUBTREE;

typedef struct ASIdentifierChoice_st ASIdentifierChoice_st, *PASIdentifierChoice_st;

typedef struct ASIdentifierChoice_st ASIdentifierChoice;

typedef struct stack_st_X509_NAME_ENTRY stack_st_X509_NAME_ENTRY, *Pstack_st_X509_NAME_ENTRY;

typedef struct buf_mem_st buf_mem_st, *Pbuf_mem_st;

typedef struct buf_mem_st BUF_MEM;

typedef struct asn1_string_st ASN1_TIME;

typedef struct evp_pkey_st evp_pkey_st, *Pevp_pkey_st;

typedef struct evp_pkey_st EVP_PKEY;

typedef union _union_930 _union_930, *P_union_930;

typedef struct evp_pkey_asn1_method_st evp_pkey_asn1_method_st, *Pevp_pkey_asn1_method_st;

typedef struct evp_pkey_asn1_method_st EVP_PKEY_ASN1_METHOD;

typedef union _union_271 _union_271, *P_union_271;

typedef struct stack_st_X509_ATTRIBUTE stack_st_X509_ATTRIBUTE, *Pstack_st_X509_ATTRIBUTE;

typedef int ASN1_NULL;

typedef struct stack_st_ASIdOrRange stack_st_ASIdOrRange, *Pstack_st_ASIdOrRange;

typedef struct stack_st_ASIdOrRange ASIdOrRanges;

typedef struct rsa_st rsa_st, *Prsa_st;

typedef struct dsa_st dsa_st, *Pdsa_st;

typedef struct dh_st dh_st, *Pdh_st;

typedef struct ec_key_st ec_key_st, *Pec_key_st;

typedef struct rsa_meth_st rsa_meth_st, *Prsa_meth_st;

typedef struct rsa_st RSA;

typedef struct bignum_ctx bignum_ctx, *Pbignum_ctx;

typedef struct bignum_ctx BN_CTX;

typedef struct bn_mont_ctx_st bn_mont_ctx_st, *Pbn_mont_ctx_st;

typedef struct bn_mont_ctx_st BN_MONT_CTX;

typedef struct rsa_meth_st RSA_METHOD;

typedef struct bn_blinding_st bn_blinding_st, *Pbn_blinding_st;

typedef struct bn_blinding_st BN_BLINDING;

typedef struct dsa_method dsa_method, *Pdsa_method;

typedef struct dsa_st DSA;

typedef struct dsa_method DSA_METHOD;

typedef struct dh_method dh_method, *Pdh_method;

typedef struct dh_st DH;

typedef struct dh_method DH_METHOD;

union _union_271 {
    char * ptr;
    struct rsa_st * rsa;
    struct dsa_st * dsa;
    struct dh_st * dh;
    struct ec_key_st * ec;
};

struct env_md_ctx_st {
    EVP_MD * digest;
    ENGINE * engine;
    ulong flags;
    void * md_data;
    EVP_PKEY_CTX * pctx;
    int (* update)(EVP_MD_CTX *, void *, size_t);
};

struct x509_cinf_st {
    ASN1_INTEGER * version;
    ASN1_INTEGER * serialNumber;
    X509_ALGOR * signature;
    X509_NAME * issuer;
    X509_VAL * validity;
    X509_NAME * subject;
    X509_PUBKEY * key;
    ASN1_BIT_STRING * issuerUID;
    ASN1_BIT_STRING * subjectUID;
    struct stack_st_X509_EXTENSION * extensions;
    ASN1_ENCODING enc;
};

struct rsa_st {
    int pad;
    long version;
    RSA_METHOD * meth;
    ENGINE * engine;
    BIGNUM * n;
    BIGNUM * e;
    BIGNUM * d;
    BIGNUM * p;
    BIGNUM * q;
    BIGNUM * dmp1;
    BIGNUM * dmq1;
    BIGNUM * iqmp;
    CRYPTO_EX_DATA ex_data;
    int references;
    int flags;
    BN_MONT_CTX * _method_mod_n;
    BN_MONT_CTX * _method_mod_p;
    BN_MONT_CTX * _method_mod_q;
    char * bignum_data;
    BN_BLINDING * blinding;
    BN_BLINDING * mt_blinding;
};

struct stack_st_SSL_CIPHER {
    _STACK stack;
};

struct ssl_cipher_st {
    int valid;
    char * name;
    ulong id;
    ulong algorithm_mkey;
    ulong algorithm_auth;
    ulong algorithm_enc;
    ulong algorithm_mac;
    ulong algorithm_ssl;
    ulong algo_strength;
    ulong algorithm2;
    int strength_bits;
    int alg_bits;
};

struct evp_pkey_asn1_method_st {
};

struct dh_st {
    int pad;
    int version;
    BIGNUM * p;
    BIGNUM * g;
    long length;
    BIGNUM * pub_key;
    BIGNUM * priv_key;
    int flags;
    BN_MONT_CTX * method_mont_p;
    BIGNUM * q;
    BIGNUM * j;
    uchar * seed;
    int seedlen;
    BIGNUM * counter;
    int references;
    CRYPTO_EX_DATA ex_data;
    DH_METHOD * meth;
    ENGINE * engine;
};

struct X509_pubkey_st {
    X509_ALGOR * algor;
    ASN1_BIT_STRING * public_key;
    EVP_PKEY * pkey;
};

struct AUTHORITY_KEYID_st {
    ASN1_OCTET_STRING * keyid;
    GENERAL_NAMES * issuer;
    ASN1_INTEGER * serial;
};

struct bn_blinding_st {
};

struct dh_method {
    char * name;
    int (* generate_key)(DH *);
    int (* compute_key)(uchar *, BIGNUM *, DH *);
    int (* bn_mod_exp)(DH *, BIGNUM *, BIGNUM *, BIGNUM *, BIGNUM *, BN_CTX *, BN_MONT_CTX *);
    int (* init)(DH *);
    int (* finish)(DH *);
    int flags;
    char * app_data;
    int (* generate_params)(DH *, int, int, BN_GENCB *);
};

struct buf_mem_st {
    size_t length;
    char * data;
    size_t max;
};

struct evp_pkey_ctx_st {
};

struct stack_st_X509_ATTRIBUTE {
    _STACK stack;
};

struct env_md_st {
    int type;
    int pkey_type;
    int md_size;
    ulong flags;
    int (* init)(EVP_MD_CTX *);
    int (* update)(EVP_MD_CTX *, void *, size_t);
    int (* final)(EVP_MD_CTX *, uchar *);
    int (* copy)(EVP_MD_CTX *, EVP_MD_CTX *);
    int (* cleanup)(EVP_MD_CTX *);
    int (* sign)(int, uchar *, uint, uchar *, uint *, void *);
    int (* verify)(int, uchar *, uint, uchar *, uint, void *);
    int required_pkey_type[5];
    int block_size;
    int ctx_size;
    int (* md_ctrl)(EVP_MD_CTX *, int, int, void *);
};

struct stack_st_DIST_POINT {
    _STACK stack;
};

struct NAME_CONSTRAINTS_st {
    struct stack_st_GENERAL_SUBTREE * permittedSubtrees;
    struct stack_st_GENERAL_SUBTREE * excludedSubtrees;
};

struct evp_cipher_st {
    int nid;
    int block_size;
    int key_len;
    int iv_len;
    ulong flags;
    int (* init)(EVP_CIPHER_CTX *, uchar *, uchar *, int);
    int (* do_cipher)(EVP_CIPHER_CTX *, uchar *, uchar *, size_t);
    int (* cleanup)(EVP_CIPHER_CTX *);
    int ctx_size;
    int (* set_asn1_parameters)(EVP_CIPHER_CTX *, ASN1_TYPE *);
    int (* get_asn1_parameters)(EVP_CIPHER_CTX *, ASN1_TYPE *);
    int (* ctrl)(EVP_CIPHER_CTX *, int, int, void *);
    void * app_data;
};

struct ec_key_st {
};

struct dtls1_retransmit_state {
    EVP_CIPHER_CTX * enc_write_ctx;
    EVP_MD_CTX * write_hash;
    COMP_CTX * compress;
    SSL_SESSION * session;
    ushort epoch;
};

struct ASIdentifiers_st {
    ASIdentifierChoice * asnum;
    ASIdentifierChoice * * rdi;
};

struct X509_name_st {
    struct stack_st_X509_NAME_ENTRY * entries;
    int modified;
    BUF_MEM * bytes;
    uchar * canon_enc;
    int canon_enclen;
};

struct X509_algor_st {
    ASN1_OBJECT * algorithm;
    ASN1_TYPE * parameter;
};

struct ssl_session_st {
    int ssl_version;
    uint key_arg_length;
    uchar key_arg[8];
    int master_key_length;
    uchar master_key[48];
    uint session_id_length;
    uchar session_id[32];
    uint sid_ctx_length;
    uchar sid_ctx[32];
    uint krb5_client_princ_len;
    uchar krb5_client_princ[256];
    char * psk_identity_hint;
    char * psk_identity;
    int not_resumable;
    struct sess_cert_st * sess_cert;
    X509 * peer;
    long verify_result;
    int references;
    long timeout;
    long time;
    uint compress_meth;
    SSL_CIPHER * cipher;
    ulong cipher_id;
    struct stack_st_SSL_CIPHER * ciphers;
    CRYPTO_EX_DATA ex_data;
    struct ssl_session_st * prev;
    struct ssl_session_st * * next;
    char * tlsext_hostname;
    size_t tlsext_ecpointformatlist_length;
    uchar * tlsext_ecpointformatlist;
    size_t tlsext_ellipticcurvelist_length;
    uchar * tlsext_ellipticcurvelist;
    uchar * tlsext_tick;
    size_t tlsext_ticklen;
    long tlsext_tick_lifetime_hint;
};

struct x509_st {
    X509_CINF * cert_info;
    X509_ALGOR * sig_alg;
    ASN1_BIT_STRING * signature;
    int valid;
    int references;
    char * name;
    CRYPTO_EX_DATA ex_data;
    long ex_pathlen;
    long ex_pcpathlen;
    ulong ex_flags;
    ulong ex_kusage;
    ulong ex_xkusage;
    ulong ex_nscert;
    ASN1_OCTET_STRING * skid;
    AUTHORITY_KEYID * akid;
    X509_POLICY_CACHE * policy_cache;
    struct stack_st_DIST_POINT * crldp;
    struct stack_st_GENERAL_NAME * altname;
    NAME_CONSTRAINTS * nc;
    struct stack_st_IPAddressFamily * rfc3779_addr;
    struct ASIdentifiers_st * rfc3779_asid;
    uchar sha1_hash[20];
    X509_CERT_AUX * aux;
};

struct X509_val_st {
    ASN1_TIME * notBefore;
    ASN1_TIME * notAfter;
};

struct bignum_ctx {
};

struct dsa_st {
    int pad;
    long version;
    int write_params;
    BIGNUM * p;
    BIGNUM * q;
    BIGNUM * g;
    BIGNUM * pub_key;
    BIGNUM * priv_key;
    BIGNUM * kinv;
    BIGNUM * r;
    int flags;
    BN_MONT_CTX * method_mont_p;
    int references;
    CRYPTO_EX_DATA ex_data;
    DSA_METHOD * meth;
    ENGINE * engine;
};

struct stack_st_X509_EXTENSION {
    _STACK stack;
};

struct X509_POLICY_CACHE_st {
};

struct stack_st_IPAddressFamily {
    _STACK stack;
};

struct stack_st_GENERAL_SUBTREE {
    _STACK stack;
};

struct rsa_meth_st {
    char * name;
    int (* rsa_pub_enc)(int, uchar *, uchar *, RSA *, int);
    int (* rsa_pub_dec)(int, uchar *, uchar *, RSA *, int);
    int (* rsa_priv_enc)(int, uchar *, uchar *, RSA *, int);
    int (* rsa_priv_dec)(int, uchar *, uchar *, RSA *, int);
    int (* rsa_mod_exp)(BIGNUM *, BIGNUM *, RSA *, BN_CTX *);
    int (* bn_mod_exp)(BIGNUM *, BIGNUM *, BIGNUM *, BIGNUM *, BN_CTX *, BN_MONT_CTX *);
    int (* init)(RSA *);
    int (* finish)(RSA *);
    int flags;
    char * app_data;
    int (* rsa_sign)(int, uchar *, uint, uchar *, uint *, RSA *);
    int (* rsa_verify)(int, uchar *, uint, uchar *, uint, RSA *);
    int (* rsa_keygen)(RSA *, int, BIGNUM *, BN_GENCB *);
};

struct engine_st {
};

struct evp_cipher_ctx_st {
    EVP_CIPHER * cipher;
    ENGINE * engine;
    int encrypt;
    int buf_len;
    uchar oiv[16];
    uchar iv[16];
    uchar buf[32];
    int num;
    void * app_data;
    int key_len;
    ulong flags;
    void * cipher_data;
    int final_used;
    int block_mask;
    uchar final[32];
};

struct stack_st_ASIdOrRange {
    _STACK stack;
};

struct x509_cert_aux_st {
    struct stack_st_ASN1_OBJECT * trust;
    struct stack_st_ASN1_OBJECT * reject;
    ASN1_UTF8STRING * alias;
    ASN1_OCTET_STRING * keyid;
    struct stack_st_X509_ALGOR * other;
};

union _union_930 {
    ASN1_NULL * inherit;
    ASIdOrRanges * asIdsOrRanges;
};

struct ASIdentifierChoice_st {
    int type;
    union _union_930 u;
};

struct stack_st_X509_NAME_ENTRY {
    _STACK stack;
};

struct dsa_method {
    char * name;
    DSA_SIG * (* dsa_do_sign)(uchar *, int, DSA *);
    int (* dsa_sign_setup)(DSA *, BN_CTX *, BIGNUM * *, BIGNUM * *);
    int (* dsa_do_verify)(uchar *, int, DSA_SIG *, DSA *);
    int (* dsa_mod_exp)(DSA *, BIGNUM *, BIGNUM *, BIGNUM *, BIGNUM *, BIGNUM *, BIGNUM *, BN_CTX *, BN_MONT_CTX *);
    int (* bn_mod_exp)(DSA *, BIGNUM *, BIGNUM *, BIGNUM *, BIGNUM *, BN_CTX *, BN_MONT_CTX *);
    int (* init)(DSA *);
    int (* finish)(DSA *);
    int flags;
    char * app_data;
    int (* dsa_paramgen)(DSA *, int, uchar *, int, int *, ulong *, BN_GENCB *);
    int (* dsa_keygen)(DSA *);
};

struct stack_st_GENERAL_NAME {
    _STACK stack;
};

struct evp_pkey_st {
    int type;
    int save_type;
    int references;
    EVP_PKEY_ASN1_METHOD * ameth;
    ENGINE * engine;
    union _union_271 pkey;
    int save_parameters;
    struct stack_st_X509_ATTRIBUTE * attributes;
};

struct sess_cert_st {
};

struct bn_mont_ctx_st {
    int ri;
    BIGNUM RR;
    BIGNUM N;
    BIGNUM Ni;
    ulong n0[2];
    int flags;
};

typedef struct dtls1_timeout_st dtls1_timeout_st, *Pdtls1_timeout_st;

struct dtls1_timeout_st {
    uint read_timeouts;
    uint write_timeouts;
    uint num_alerts;
};

typedef struct hm_header_st hm_header_st, *Phm_header_st;

struct hm_header_st {
    uchar type;
    ulong msg_len;
    ushort seq;
    ulong frag_off;
    ulong frag_len;
    uint is_ccs;
    struct dtls1_retransmit_state saved_retransmit_state;
};

typedef struct record_pqueue_st record_pqueue_st, *Precord_pqueue_st;

typedef struct record_pqueue_st record_pqueue;

typedef struct _pqueue _pqueue, *P_pqueue;

typedef struct _pqueue * pqueue;

struct record_pqueue_st {
    ushort epoch;
    pqueue q;
};

struct _pqueue {
};

typedef struct ec_key_st EC_KEY;

typedef struct Elf32_Dyn_ARM Elf32_Dyn_ARM, *PElf32_Dyn_ARM;

typedef enum Elf32_DynTag_ARM {
    DT_AUDIT=1879047932,
    DT_AUXILIARY=2147483645,
    DT_BIND_NOW=24,
    DT_CHECKSUM=1879047672,
    DT_CONFIG=1879047930,
    DT_DEBUG=21,
    DT_DEPAUDIT=1879047931,
    DT_ENCODING=32,
    DT_FEATURE_1=1879047676,
    DT_FILTER=2147483647,
    DT_FINI=13,
    DT_FINI_ARRAY=26,
    DT_FINI_ARRAYSZ=28,
    DT_FLAGS=30,
    DT_FLAGS_1=1879048187,
    DT_GNU_CONFLICT=1879047928,
    DT_GNU_CONFLICTSZ=1879047670,
    DT_GNU_HASH=1879047925,
    DT_GNU_LIBLIST=1879047929,
    DT_GNU_LIBLISTSZ=1879047671,
    DT_GNU_PRELINKED=1879047669,
    DT_HASH=4,
    DT_INIT=12,
    DT_INIT_ARRAY=25,
    DT_INIT_ARRAYSZ=27,
    DT_JMPREL=23,
    DT_MOVEENT=1879047674,
    DT_MOVESZ=1879047675,
    DT_MOVETAB=1879047934,
    DT_NEEDED=1,
    DT_NULL=0,
    DT_PLTGOT=3,
    DT_PLTPAD=1879047933,
    DT_PLTPADSZ=1879047673,
    DT_PLTREL=20,
    DT_PLTRELSZ=2,
    DT_POSFLAG_1=1879047677,
    DT_PREINIT_ARRAYSZ=33,
    DT_REL=17,
    DT_RELA=7,
    DT_RELACOUNT=1879048185,
    DT_RELAENT=9,
    DT_RELASZ=8,
    DT_RELCOUNT=1879048186,
    DT_RELENT=19,
    DT_RELSZ=18,
    DT_RPATH=15,
    DT_RUNPATH=29,
    DT_SONAME=14,
    DT_STRSZ=10,
    DT_STRTAB=5,
    DT_SYMBOLIC=16,
    DT_SYMENT=11,
    DT_SYMINENT=1879047679,
    DT_SYMINFO=1879047935,
    DT_SYMINSZ=1879047678,
    DT_SYMTAB=6,
    DT_TEXTREL=22,
    DT_TLSDESC_GOT=1879047927,
    DT_TLSDESC_PLT=1879047926,
    DT_VERDEF=1879048188,
    DT_VERDEFNUM=1879048189,
    DT_VERNEED=1879048190,
    DT_VERNEEDNUM=1879048191,
    DT_VERSYM=1879048176
} Elf32_DynTag_ARM;

struct Elf32_Dyn_ARM {
    enum Elf32_DynTag_ARM d_tag;
    dword d_val;
};

typedef struct Elf32_Ehdr Elf32_Ehdr, *PElf32_Ehdr;

struct Elf32_Ehdr {
    byte e_ident_magic_num;
    char e_ident_magic_str[3];
    byte e_ident_class;
    byte e_ident_data;
    byte e_ident_version;
    byte e_ident_pad[9];
    word e_type;
    word e_machine;
    dword e_version;
    dword e_entry;
    dword e_phoff;
    dword e_shoff;
    dword e_flags;
    word e_ehsize;
    word e_phentsize;
    word e_phnum;
    word e_shentsize;
    word e_shnum;
    word e_shstrndx;
};

typedef struct Elf32_Phdr Elf32_Phdr, *PElf32_Phdr;

typedef enum Elf_ProgramHeaderType_ARM {
    PT_ARM_EXIDX=1879048192,
    PT_DYNAMIC=2,
    PT_GNU_EH_FRAME=1685382480,
    PT_GNU_RELRO=1685382482,
    PT_GNU_STACK=1685382481,
    PT_INTERP=3,
    PT_LOAD=1,
    PT_NOTE=4,
    PT_NULL=0,
    PT_PHDR=6,
    PT_SHLIB=5,
    PT_TLS=7
} Elf_ProgramHeaderType_ARM;

struct Elf32_Phdr {
    enum Elf_ProgramHeaderType_ARM p_type;
    dword p_offset;
    dword p_vaddr;
    dword p_paddr;
    dword p_filesz;
    dword p_memsz;
    dword p_flags;
    dword p_align;
};

typedef struct Elf32_Rel Elf32_Rel, *PElf32_Rel;

struct Elf32_Rel {
    dword r_offset; /* location to apply the relocation action */
    dword r_info; /* the symbol table index and the type of relocation */
};

typedef struct Elf32_Shdr Elf32_Shdr, *PElf32_Shdr;

typedef enum Elf_SectionHeaderType_ARM {
    SHT_ARM_ATTRIBUTES=1879048195,
    SHT_ARM_DEBUGOVERLAY=1879048196,
    SHT_ARM_EXIDX=1879048193,
    SHT_ARM_OVERLAYSECTION=1879048197,
    SHT_ARM_PREEMPTMAP=1879048194,
    SHT_CHECKSUM=1879048184,
    SHT_DYNAMIC=6,
    SHT_DYNSYM=11,
    SHT_FINI_ARRAY=15,
    SHT_GNU_ATTRIBUTES=1879048181,
    SHT_GNU_HASH=1879048182,
    SHT_GNU_LIBLIST=1879048183,
    SHT_GNU_verdef=1879048189,
    SHT_GNU_verneed=1879048190,
    SHT_GNU_versym=1879048191,
    SHT_GROUP=17,
    SHT_HASH=5,
    SHT_INIT_ARRAY=14,
    SHT_NOBITS=8,
    SHT_NOTE=7,
    SHT_NULL=0,
    SHT_PREINIT_ARRAY=16,
    SHT_PROGBITS=1,
    SHT_REL=9,
    SHT_RELA=4,
    SHT_SHLIB=10,
    SHT_STRTAB=3,
    SHT_SUNW_COMDAT=1879048187,
    SHT_SUNW_move=1879048186,
    SHT_SUNW_syminfo=1879048188,
    SHT_SYMTAB=2,
    SHT_SYMTAB_SHNDX=18
} Elf_SectionHeaderType_ARM;

struct Elf32_Shdr {
    dword sh_name;
    enum Elf_SectionHeaderType_ARM sh_type;
    dword sh_flags;
    dword sh_addr;
    dword sh_offset;
    dword sh_size;
    dword sh_link;
    dword sh_info;
    dword sh_addralign;
    dword sh_entsize;
};

typedef struct Elf32_Sym Elf32_Sym, *PElf32_Sym;

struct Elf32_Sym {
    dword st_name;
    dword st_value;
    dword st_size;
    byte st_info;
    byte st_other;
    word st_shndx;
};

typedef int (* ENGINE_CIPHERS_PTR)(ENGINE *, EVP_CIPHER * *, int * *, int);

typedef struct ENGINE_CMD_DEFN_st ENGINE_CMD_DEFN_st, *PENGINE_CMD_DEFN_st;

typedef struct ENGINE_CMD_DEFN_st ENGINE_CMD_DEFN;

struct ENGINE_CMD_DEFN_st {
    uint cmd_num;
    char * cmd_name;
    char * cmd_desc;
    uint cmd_flags;
};

typedef int (* ENGINE_CTRL_FUNC_PTR)(ENGINE *, int, long, void *, void (* )(void));

typedef int (* ENGINE_DIGESTS_PTR)(ENGINE *, EVP_MD * *, int * *, int);

typedef int (* ENGINE_GEN_INT_FUNC_PTR)(ENGINE *);

typedef struct ui_method_st ui_method_st, *Pui_method_st;

typedef struct ui_method_st UI_METHOD;

typedef EVP_PKEY * (* ENGINE_LOAD_KEY_PTR)(ENGINE *, char *, UI_METHOD *, void *);

struct ui_method_st {
};

typedef int (* ENGINE_PKEY_ASN1_METHS_PTR)(ENGINE *, EVP_PKEY_ASN1_METHOD * *, int * *, int);

typedef struct evp_pkey_method_st evp_pkey_method_st, *Pevp_pkey_method_st;

typedef struct evp_pkey_method_st EVP_PKEY_METHOD;

typedef int (* ENGINE_PKEY_METHS_PTR)(ENGINE *, EVP_PKEY_METHOD * *, int * *, int);

struct evp_pkey_method_st {
};

typedef struct ssl_st ssl_st, *Pssl_st;

typedef struct x509_store_ctx_st x509_store_ctx_st, *Px509_store_ctx_st;

typedef struct X509_crl_st X509_crl_st, *PX509_crl_st;

typedef struct X509_crl_st X509_CRL;

typedef struct stack_st_X509 stack_st_X509, *Pstack_st_X509;

typedef struct stack_st_X509_CRL stack_st_X509_CRL, *Pstack_st_X509_CRL;

typedef struct x509_store_ctx_st X509_STORE_CTX;

typedef struct ssl_st SSL;

typedef struct stack_st_X509_NAME stack_st_X509_NAME, *Pstack_st_X509_NAME;

typedef int (* ENGINE_SSL_CLIENT_CERT_PTR)(ENGINE *, SSL *, struct stack_st_X509_NAME *, X509 * *, EVP_PKEY * *, struct stack_st_X509 * *, UI_METHOD *, void *);

typedef struct ssl_method_st ssl_method_st, *Pssl_method_st;

typedef struct ssl_ctx_st ssl_ctx_st, *Pssl_ctx_st;

typedef struct hmac_ctx_st hmac_ctx_st, *Phmac_ctx_st;

typedef struct hmac_ctx_st HMAC_CTX;

typedef struct ssl_ctx_st SSL_CTX;

typedef struct ssl_method_st SSL_METHOD;

typedef struct ssl2_state_st ssl2_state_st, *Pssl2_state_st;

typedef struct ssl3_state_st ssl3_state_st, *Pssl3_state_st;

typedef struct dtls1_state_st dtls1_state_st, *Pdtls1_state_st;

typedef struct X509_VERIFY_PARAM_st X509_VERIFY_PARAM_st, *PX509_VERIFY_PARAM_st;

typedef struct X509_VERIFY_PARAM_st X509_VERIFY_PARAM;

typedef struct cert_st cert_st, *Pcert_st;

typedef int (* GEN_SESSION_CB)(SSL *, uchar *, uint *);

typedef struct x509_store_st x509_store_st, *Px509_store_st;

typedef struct x509_store_st X509_STORE;

typedef struct X509_crl_info_st X509_crl_info_st, *PX509_crl_info_st;

typedef struct X509_crl_info_st X509_CRL_INFO;

typedef struct ISSUING_DIST_POINT_st ISSUING_DIST_POINT_st, *PISSUING_DIST_POINT_st;

typedef struct ISSUING_DIST_POINT_st ISSUING_DIST_POINT;

typedef struct stack_st_GENERAL_NAMES stack_st_GENERAL_NAMES, *Pstack_st_GENERAL_NAMES;

typedef struct x509_crl_method_st x509_crl_method_st, *Px509_crl_method_st;

typedef struct x509_crl_method_st X509_CRL_METHOD;

typedef struct X509_POLICY_TREE_st X509_POLICY_TREE_st, *PX509_POLICY_TREE_st;

typedef struct X509_POLICY_TREE_st X509_POLICY_TREE;

typedef struct kssl_ctx_st kssl_ctx_st, *Pkssl_ctx_st;

typedef struct kssl_ctx_st KSSL_CTX;

typedef struct stack_st_OCSP_RESPID stack_st_OCSP_RESPID, *Pstack_st_OCSP_RESPID;

typedef struct stack_st_X509_EXTENSION X509_EXTENSIONS;

typedef struct tls_session_ticket_ext_st tls_session_ticket_ext_st, *Ptls_session_ticket_ext_st;

typedef struct tls_session_ticket_ext_st TLS_SESSION_TICKET_EXT;

typedef int (* tls_session_ticket_ext_cb_fn)(SSL *, uchar *, int, void *);

typedef int (* tls_session_secret_cb_fn)(SSL *, void *, int *, struct stack_st_SSL_CIPHER *, SSL_CIPHER * *, void *);

typedef struct stack_st_SRTP_PROTECTION_PROFILE stack_st_SRTP_PROTECTION_PROFILE, *Pstack_st_SRTP_PROTECTION_PROFILE;

typedef struct srtp_protection_profile_st srtp_protection_profile_st, *Psrtp_protection_profile_st;

typedef struct srtp_protection_profile_st SRTP_PROTECTION_PROFILE;

typedef struct lhash_st_SSL_SESSION lhash_st_SSL_SESSION, *Plhash_st_SSL_SESSION;

typedef struct _struct_615 _struct_615, *P_struct_615;

typedef int (pem_password_cb)(char *, int, int, void *);

typedef struct stack_st_SSL_COMP stack_st_SSL_COMP, *Pstack_st_SSL_COMP;

typedef struct ssl3_buf_freelist_st ssl3_buf_freelist_st, *Pssl3_buf_freelist_st;

typedef struct ssl3_enc_method ssl3_enc_method, *Pssl3_enc_method;

typedef struct _struct_641 _struct_641, *P_struct_641;

typedef struct ssl3_buffer_st ssl3_buffer_st, *Pssl3_buffer_st;

typedef struct ssl3_buffer_st SSL3_BUFFER;

typedef struct ssl3_record_st ssl3_record_st, *Pssl3_record_st;

typedef struct ssl3_record_st SSL3_RECORD;

typedef struct _struct_645 _struct_645, *P_struct_645;

typedef struct timeval timeval, *Ptimeval;

typedef long __time_t;

typedef __time_t time_t;

typedef struct stack_st_X509_OBJECT stack_st_X509_OBJECT, *Pstack_st_X509_OBJECT;

typedef struct stack_st_X509_LOOKUP stack_st_X509_LOOKUP, *Pstack_st_X509_LOOKUP;

typedef struct stack_st_X509_REVOKED stack_st_X509_REVOKED, *Pstack_st_X509_REVOKED;

typedef struct DIST_POINT_NAME_st DIST_POINT_NAME_st, *PDIST_POINT_NAME_st;

typedef struct DIST_POINT_NAME_st DIST_POINT_NAME;

typedef int krb5_int32;

typedef krb5_int32 krb5_enctype;

typedef uchar krb5_octet;

typedef struct ssl_comp_st ssl_comp_st, *Pssl_comp_st;

typedef struct ssl_comp_st SSL_COMP;

typedef long __suseconds_t;

typedef union _union_856 _union_856, *P_union_856;

struct timeval {
    __time_t tv_sec;
    __suseconds_t tv_usec;
};

struct dtls1_state_st {
    uint send_cookie;
    uchar cookie[256];
    uchar rcvd_cookie[256];
    uint cookie_len;
    ushort r_epoch;
    ushort w_epoch;
    DTLS1_BITMAP bitmap;
    DTLS1_BITMAP next_bitmap;
    ushort handshake_write_seq;
    ushort next_handshake_write_seq;
    ushort handshake_read_seq;
    uchar last_write_sequence[8];
    record_pqueue unprocessed_rcds;
    record_pqueue processed_rcds;
    pqueue buffered_messages;
    pqueue sent_messages;
    record_pqueue buffered_app_data;
    uint mtu;
    struct hm_header_st w_msg_hdr;
    struct hm_header_st r_msg_hdr;
    struct dtls1_timeout_st timeout;
    struct timeval next_timeout;
    ushort timeout_duration;
    uchar alert_fragment[2];
    uint alert_fragment_len;
    uchar handshake_fragment[12];
    uint handshake_fragment_len;
    uint retransmitting;
    uint change_cipher_spec_ok;
    uint listen;
};

struct ssl3_buffer_st {
    uchar * buf;
    size_t len;
    int offset;
    int left;
};

struct cert_st {
};

struct srtp_protection_profile_st {
    char * name;
    ulong id;
};

struct x509_crl_method_st {
};

struct lhash_st_SSL_SESSION {
    int dummy;
};

struct stack_st_X509_OBJECT {
    _STACK stack;
};

struct ssl3_record_st {
    int type;
    uint length;
    uint off;
    uchar * data;
    uchar * input;
    uchar * comp;
    ulong epoch;
    uchar seq_num[8];
};

struct ssl_comp_st {
    int id;
    char * name;
    COMP_METHOD * method;
};

struct ssl3_buf_freelist_st {
};

struct _struct_615 {
    int sess_connect;
    int sess_connect_renegotiate;
    int sess_connect_good;
    int sess_accept;
    int sess_accept_renegotiate;
    int sess_accept_good;
    int sess_miss;
    int sess_timeout;
    int sess_cache_full;
    int sess_hit;
    int sess_cb_hit;
};

struct ISSUING_DIST_POINT_st {
    DIST_POINT_NAME * distpoint;
    int onlyuser;
    int onlyCA;
    ASN1_BIT_STRING * onlysomereasons;
    int indirectCRL;
    int onlyattr;
};

struct stack_st_X509 {
    _STACK stack;
};

struct ssl3_enc_method {
};

struct _struct_645 {
    uchar cert_verify_md[128];
    uchar finish_md[128];
    int finish_md_len;
    uchar peer_finish_md[128];
    int peer_finish_md_len;
    ulong message_size;
    int message_type;
    SSL_CIPHER * new_cipher;
    DH * dh;
    EC_KEY * ecdh;
    int next_state;
    int reuse_message;
    int cert_req;
    int ctype_num;
    char ctype[9];
    struct stack_st_X509_NAME * ca_names;
    int use_rsa_tmp;
    int key_block_length;
    uchar * key_block;
    EVP_CIPHER * new_sym_enc;
    EVP_MD * new_hash;
    int new_mac_pkey_type;
    int new_mac_secret_size;
    SSL_COMP * new_compression;
    int cert_request;
};

struct ssl3_state_st {
    long flags;
    int delay_buf_pop_ret;
    uchar read_sequence[8];
    int read_mac_secret_size;
    uchar read_mac_secret[64];
    uchar write_sequence[8];
    int write_mac_secret_size;
    uchar write_mac_secret[64];
    uchar server_random[32];
    uchar client_random[32];
    int need_empty_fragments;
    int empty_fragment_done;
    int init_extra;
    SSL3_BUFFER rbuf;
    SSL3_BUFFER wbuf;
    SSL3_RECORD rrec;
    SSL3_RECORD wrec;
    uchar alert_fragment[2];
    uint alert_fragment_len;
    uchar handshake_fragment[4];
    uint handshake_fragment_len;
    uint wnum;
    int wpend_tot;
    int wpend_type;
    int wpend_ret;
    uchar * wpend_buf;
    BIO * handshake_buffer;
    EVP_MD_CTX * * handshake_dgst;
    int change_cipher_spec;
    int warn_alert;
    int fatal_alert;
    int alert_dispatch;
    uchar send_alert[2];
    int renegotiate;
    int total_renegotiations;
    int num_renegotiations;
    int in_read_app_data;
    void * client_opaque_prf_input;
    size_t client_opaque_prf_input_len;
    void * server_opaque_prf_input;
    size_t server_opaque_prf_input_len;
    struct _struct_645 tmp;
    uchar previous_client_finished[64];
    uchar previous_client_finished_len;
    uchar previous_server_finished[64];
    uchar previous_server_finished_len;
    int send_connection_binding;
    int next_proto_neg_seen;
};

struct X509_crl_st {
    X509_CRL_INFO * crl;
    X509_ALGOR * sig_alg;
    ASN1_BIT_STRING * signature;
    int references;
    int flags;
    AUTHORITY_KEYID * akid;
    ISSUING_DIST_POINT * idp;
    int idp_flags;
    int idp_reasons;
    ASN1_INTEGER * crl_number;
    ASN1_INTEGER * base_crl_number;
    uchar sha1_hash[20];
    struct stack_st_GENERAL_NAMES * issuers;
    X509_CRL_METHOD * meth;
    void * meth_data;
};

struct X509_crl_info_st {
    ASN1_INTEGER * version;
    X509_ALGOR * sig_alg;
    X509_NAME * issuer;
    ASN1_TIME * lastUpdate;
    ASN1_TIME * nextUpdate;
    struct stack_st_X509_REVOKED * revoked;
    struct stack_st_X509_EXTENSION * extensions;
    ASN1_ENCODING enc;
};

struct X509_VERIFY_PARAM_st {
    char * name;
    time_t check_time;
    ulong inh_flags;
    ulong flags;
    int purpose;
    int trust;
    int depth;
    struct stack_st_ASN1_OBJECT * policies;
};

struct stack_st_X509_REVOKED {
    _STACK stack;
};

struct stack_st_X509_NAME {
    _STACK stack;
};

struct stack_st_OCSP_RESPID {
    _STACK stack;
};

struct stack_st_GENERAL_NAMES {
    _STACK stack;
};

struct stack_st_SRTP_PROTECTION_PROFILE {
    _STACK stack;
};

struct ssl_st {
    int version;
    int type;
    SSL_METHOD * method;
    BIO * rbio;
    BIO * wbio;
    BIO * bbio;
    int rwstate;
    int in_handshake;
    int (* handshake_func)(SSL *);
    int server;
    int new_session;
    int quiet_shutdown;
    int shutdown;
    int state;
    int rstate;
    BUF_MEM * init_buf;
    void * init_msg;
    int init_num;
    int init_off;
    uchar * packet;
    uint packet_length;
    struct ssl2_state_st * s2;
    struct ssl3_state_st * s3;
    struct dtls1_state_st * d1;
    int read_ahead;
    void (* msg_callback)(int, int, int, void *, size_t, SSL *, void *);
    void * msg_callback_arg;
    int hit;
    X509_VERIFY_PARAM * param;
    struct stack_st_SSL_CIPHER * cipher_list;
    struct stack_st_SSL_CIPHER * cipher_list_by_id;
    int mac_flags;
    EVP_CIPHER_CTX * enc_read_ctx;
    EVP_MD_CTX * read_hash;
    COMP_CTX * expand;
    EVP_CIPHER_CTX * enc_write_ctx;
    EVP_MD_CTX * write_hash;
    COMP_CTX * compress;
    struct cert_st * cert;
    uint sid_ctx_length;
    uchar sid_ctx[32];
    SSL_SESSION * session;
    GEN_SESSION_CB generate_session_id;
    int verify_mode;
    int (* verify_callback)(int, X509_STORE_CTX *);
    void (* info_callback)(SSL *, int, int);
    int error;
    int error_code;
    KSSL_CTX * kssl_ctx;
    uint (* psk_client_callback)(SSL *, char *, char *, uint, uchar *, uint);
    uint (* psk_server_callback)(SSL *, char *, uchar *, uint);
    SSL_CTX * ctx;
    int debug;
    long verify_result;
    CRYPTO_EX_DATA ex_data;
    struct stack_st_X509_NAME * client_CA;
    int references;
    ulong options;
    ulong mode;
    long max_cert_list;
    int first_packet;
    int client_version;
    uint max_send_fragment;
    void (* tlsext_debug_cb)(SSL *, int, int, uchar *, int, void *);
    void * tlsext_debug_arg;
    char * tlsext_hostname;
    int servername_done;
    int tlsext_status_type;
    int tlsext_status_expected;
    struct stack_st_OCSP_RESPID * tlsext_ocsp_ids;
    X509_EXTENSIONS * tlsext_ocsp_exts;
    uchar * tlsext_ocsp_resp;
    int tlsext_ocsp_resplen;
    int tlsext_ticket_expected;
    size_t tlsext_ecpointformatlist_length;
    uchar * tlsext_ecpointformatlist;
    size_t tlsext_ellipticcurvelist_length;
    uchar * tlsext_ellipticcurvelist;
    void * tlsext_opaque_prf_input;
    size_t tlsext_opaque_prf_input_len;
    TLS_SESSION_TICKET_EXT * tlsext_session_ticket;
    tls_session_ticket_ext_cb_fn tls_session_ticket_ext_cb;
    void * tls_session_ticket_ext_cb_arg;
    tls_session_secret_cb_fn tls_session_secret_cb;
    void * tls_session_secret_cb_arg;
    SSL_CTX * initial_ctx;
    uchar * next_proto_negotiated;
    uchar next_proto_negotiated_len;
    struct stack_st_SRTP_PROTECTION_PROFILE * srtp_profiles;
    SRTP_PROTECTION_PROFILE * srtp_profile;
    uint tlsext_heartbeat;
    uint tlsext_hb_pending;
    uint tlsext_hb_seq;
    int renegotiate;
};

struct stack_st_SSL_COMP {
    _STACK stack;
};

union _union_856 {
    GENERAL_NAMES * fullname;
    struct stack_st_X509_NAME_ENTRY * relativename;
};

struct _struct_641 {
    uint conn_id_length;
    uint cert_type;
    uint cert_length;
    uint csl;
    uint clear;
    uint enc;
    uchar ccl[32];
    uint cipher_spec_length;
    uint session_id_length;
    uint clen;
    uint rlen;
};

struct x509_store_st {
    int cache;
    struct stack_st_X509_OBJECT * objs;
    struct stack_st_X509_LOOKUP * get_cert_methods;
    X509_VERIFY_PARAM * param;
    int (* verify)(X509_STORE_CTX *);
    int (* verify_cb)(int, X509_STORE_CTX *);
    int (* get_issuer)(X509 * *, X509_STORE_CTX *, X509 *);
    int (* check_issued)(X509_STORE_CTX *, X509 *, X509 *);
    int (* check_revocation)(X509_STORE_CTX *);
    int (* get_crl)(X509_STORE_CTX *, X509_CRL * *, X509 *);
    int (* check_crl)(X509_STORE_CTX *, X509_CRL *);
    int (* cert_crl)(X509_STORE_CTX *, X509_CRL *, X509 *);
    stack_st_X509 * (* lookup_certs)(X509_STORE_CTX *, X509_NAME *);
    stack_st_X509_CRL * (* lookup_crls)(X509_STORE_CTX *, X509_NAME *);
    int (* cleanup)(X509_STORE_CTX *);
    CRYPTO_EX_DATA ex_data;
    int references;
};

struct stack_st_X509_LOOKUP {
    _STACK stack;
};

struct stack_st_X509_CRL {
    _STACK stack;
};

struct x509_store_ctx_st {
    X509_STORE * ctx;
    int current_method;
    X509 * cert;
    struct stack_st_X509 * untrusted;
    struct stack_st_X509_CRL * crls;
    X509_VERIFY_PARAM * param;
    void * other_ctx;
    int (* verify)(X509_STORE_CTX *);
    int (* verify_cb)(int, X509_STORE_CTX *);
    int (* get_issuer)(X509 * *, X509_STORE_CTX *, X509 *);
    int (* check_issued)(X509_STORE_CTX *, X509 *, X509 *);
    int (* check_revocation)(X509_STORE_CTX *);
    int (* get_crl)(X509_STORE_CTX *, X509_CRL * *, X509 *);
    int (* check_crl)(X509_STORE_CTX *, X509_CRL *);
    int (* cert_crl)(X509_STORE_CTX *, X509_CRL *, X509 *);
    int (* check_policy)(X509_STORE_CTX *);
    stack_st_X509 * (* lookup_certs)(X509_STORE_CTX *, X509_NAME *);
    stack_st_X509_CRL * (* lookup_crls)(X509_STORE_CTX *, X509_NAME *);
    int (* cleanup)(X509_STORE_CTX *);
    int valid;
    int last_untrusted;
    struct stack_st_X509 * chain;
    X509_POLICY_TREE * tree;
    int explicit_policy;
    int error_depth;
    int error;
    X509 * current_cert;
    X509 * current_issuer;
    X509_CRL * current_crl;
    int current_crl_score;
    uint current_reasons;
    X509_STORE_CTX * parent;
    CRYPTO_EX_DATA ex_data;
};

struct ssl_ctx_st {
    SSL_METHOD * method;
    struct stack_st_SSL_CIPHER * cipher_list;
    struct stack_st_SSL_CIPHER * cipher_list_by_id;
    struct x509_store_st * cert_store;
    struct lhash_st_SSL_SESSION * sessions;
    ulong session_cache_size;
    struct ssl_session_st * session_cache_head;
    struct ssl_session_st * session_cache_tail;
    int session_cache_mode;
    long session_timeout;
    int (* new_session_cb)(struct ssl_st *, SSL_SESSION *);
    void (* remove_session_cb)(struct ssl_ctx_st *, SSL_SESSION *);
    SSL_SESSION * (* get_session_cb)(struct ssl_st *, uchar *, int, int *);
    struct _struct_615 stats;
    int references;
    int (* app_verify_callback)(X509_STORE_CTX *, void *);
    void * app_verify_arg;
    pem_password_cb * default_passwd_callback;
    void * default_passwd_callback_userdata;
    int (* client_cert_cb)(SSL *, X509 * *, EVP_PKEY * *);
    int (* app_gen_cookie_cb)(SSL *, uchar *, uint *);
    int (* app_verify_cookie_cb)(SSL *, uchar *, uint);
    CRYPTO_EX_DATA ex_data;
    EVP_MD * rsa_md5;
    EVP_MD * md5;
    EVP_MD * sha1;
    struct stack_st_X509 * extra_certs;
    struct stack_st_SSL_COMP * comp_methods;
    void (* info_callback)(SSL *, int, int);
    struct stack_st_X509_NAME * client_CA;
    ulong options;
    ulong mode;
    long max_cert_list;
    struct cert_st * cert;
    int read_ahead;
    void (* msg_callback)(int, int, int, void *, size_t, SSL *, void *);
    void * msg_callback_arg;
    int verify_mode;
    uint sid_ctx_length;
    uchar sid_ctx[32];
    int (* default_verify_callback)(int, X509_STORE_CTX *);
    GEN_SESSION_CB generate_session_id;
    X509_VERIFY_PARAM * param;
    int quiet_shutdown;
    uint max_send_fragment;
    ENGINE * client_cert_engine;
    int (* tlsext_servername_callback)(SSL *, int *, void *);
    void * tlsext_servername_arg;
    uchar tlsext_tick_key_name[16];
    uchar tlsext_tick_hmac_key[16];
    uchar tlsext_tick_aes_key[16];
    int (* tlsext_ticket_key_cb)(SSL *, uchar *, uchar *, EVP_CIPHER_CTX *, HMAC_CTX *, int);
    int (* tlsext_status_cb)(SSL *, void *);
    void * tlsext_status_arg;
    int (* tlsext_opaque_prf_input_callback)(SSL *, void *, size_t, void *);
    void * tlsext_opaque_prf_input_callback_arg;
    char * psk_identity_hint;
    uint (* psk_client_callback)(SSL *, char *, char *, uint, uchar *, uint);
    uint (* psk_server_callback)(SSL *, char *, uchar *, uint);
    uint freelist_max_len;
    struct ssl3_buf_freelist_st * wbuf_freelist;
    struct ssl3_buf_freelist_st * rbuf_freelist;
    int (* next_protos_advertised_cb)(SSL *, uchar * *, uint *, void *);
    void * next_protos_advertised_cb_arg;
    int (* next_proto_select_cb)(SSL *, uchar * *, uchar *, uchar *, uint, void *);
    void * next_proto_select_cb_arg;
    struct stack_st_SRTP_PROTECTION_PROFILE * srtp_profiles;
};

struct ssl_method_st {
    int version;
    int (* ssl_new)(SSL *);
    void (* ssl_clear)(SSL *);
    void (* ssl_free)(SSL *);
    int (* ssl_accept)(SSL *);
    int (* ssl_connect)(SSL *);
    int (* ssl_read)(SSL *, void *, int);
    int (* ssl_peek)(SSL *, void *, int);
    int (* ssl_write)(SSL *, void *, int);
    int (* ssl_shutdown)(SSL *);
    int (* ssl_renegotiate)(SSL *);
    int (* ssl_renegotiate_check)(SSL *);
    long (* ssl_get_message)(SSL *, int, int, int, long, int *);
    int (* ssl_read_bytes)(SSL *, int, uchar *, int, int);
    int (* ssl_write_bytes)(SSL *, int, void *, int);
    int (* ssl_dispatch_alert)(SSL *);
    long (* ssl_ctrl)(SSL *, int, long, void *);
    long (* ssl_ctx_ctrl)(SSL_CTX *, int, long, void *);
    SSL_CIPHER * (* get_cipher_by_char)(uchar *);
    int (* put_cipher_by_char)(SSL_CIPHER *, uchar *);
    int (* ssl_pending)(SSL *);
    int (* num_ciphers)(void);
    SSL_CIPHER * (* get_cipher)(uint);
    ssl_method_st * (* get_ssl_method)(int);
    long (* get_timeout)(void);
    struct ssl3_enc_method * ssl3_enc;
    int (* ssl_version)(void);
    long (* ssl_callback_ctrl)(SSL *, int, void (* )(void));
    long (* ssl_ctx_callback_ctrl)(SSL_CTX *, int, void (* )(void));
};

struct hmac_ctx_st {
    EVP_MD * md;
    EVP_MD_CTX md_ctx;
    EVP_MD_CTX i_ctx;
    EVP_MD_CTX o_ctx;
    uint key_length;
    uchar key[128];
};

struct DIST_POINT_NAME_st {
    int type;
    union _union_856 name;
    X509_NAME * dpname;
};

struct ssl2_state_st {
    int three_byte_header;
    int clear_text;
    int escape;
    int ssl2_rollback;
    uint wnum;
    int wpend_tot;
    uchar * wpend_buf;
    int wpend_off;
    int wpend_len;
    int wpend_ret;
    int rbuf_left;
    int rbuf_offs;
    uchar * rbuf;
    uchar * wbuf;
    uchar * write_ptr;
    uint padding;
    uint rlength;
    int ract_data_length;
    uint wlength;
    int wact_data_length;
    uchar * ract_data;
    uchar * wact_data;
    uchar * mac_data;
    uchar * read_key;
    uchar * write_key;
    uint challenge_length;
    uchar challenge[32];
    uint conn_id_length;
    uchar conn_id[16];
    uint key_material_length;
    uchar key_material[48];
    ulong read_sequence;
    ulong write_sequence;
    struct _struct_641 tmp;
};

struct kssl_ctx_st {
    char * service_name;
    char * service_host;
    char * client_princ;
    char * keytab_file;
    char * cred_cache;
    krb5_enctype enctype;
    int length;
    krb5_octet * key;
};

struct tls_session_ticket_ext_st {
};

struct X509_POLICY_TREE_st {
};

typedef struct CommentInfo CommentInfo, *PCommentInfo;

struct CommentInfo { /* PlaceHolder Class Structure */
};

typedef struct CZString CZString, *PCZString;

struct CZString { /* PlaceHolder Class Structure */
};

typedef struct FastWriter FastWriter, *PFastWriter;

struct FastWriter { /* PlaceHolder Class Structure */
};

typedef struct Features Features, *PFeatures;

struct Features { /* PlaceHolder Class Structure */
};

typedef struct Path Path, *PPath;

struct Path { /* PlaceHolder Class Structure */
};

typedef struct PathArgument PathArgument, *PPathArgument;

struct PathArgument { /* PlaceHolder Class Structure */
};

typedef struct Reader Reader, *PReader;

struct Reader { /* PlaceHolder Class Structure */
};

typedef struct StyledStreamWriter StyledStreamWriter, *PStyledStreamWriter;

struct StyledStreamWriter { /* PlaceHolder Class Structure */
};

typedef struct StyledWriter StyledWriter, *PStyledWriter;

struct StyledWriter { /* PlaceHolder Class Structure */
};

typedef struct ValueConstIterator ValueConstIterator, *PValueConstIterator;

struct ValueConstIterator { /* PlaceHolder Class Structure */
};

typedef struct ValueIterator ValueIterator, *PValueIterator;

struct ValueIterator { /* PlaceHolder Class Structure */
};

typedef struct ValueIteratorBase ValueIteratorBase, *PValueIteratorBase;

struct ValueIteratorBase { /* PlaceHolder Class Structure */
};

typedef struct Writer Writer, *PWriter;

struct Writer { /* PlaceHolder Class Structure */
};

typedef struct lhash_st lhash_st, *Plhash_st;

typedef struct lhash_st _LHASH;

typedef struct lhash_node_st lhash_node_st, *Plhash_node_st;

typedef struct lhash_node_st LHASH_NODE;

typedef int (* LHASH_COMP_FN_TYPE)(void *, void *);

typedef ulong (* LHASH_HASH_FN_TYPE)(void *);

struct lhash_node_st {
    void * data;
    struct lhash_node_st * next;
    ulong hash;
};

struct lhash_st {
    LHASH_NODE * * b;
    LHASH_COMP_FN_TYPE comp;
    LHASH_HASH_FN_TYPE hash;
    uint num_nodes;
    uint num_alloc_nodes;
    uint p;
    uint pmax;
    ulong up_load;
    ulong down_load;
    ulong num_items;
    ulong num_expands;
    ulong num_expand_reallocs;
    ulong num_contracts;
    ulong num_contract_reallocs;
    ulong num_hash_calls;
    ulong num_comp_calls;
    ulong num_insert;
    ulong num_replace;
    ulong num_delete;
    ulong num_no_delete;
    ulong num_retrieve;
    ulong num_retrieve_miss;
    ulong num_hash_comps;
    int error;
};

typedef void (* LHASH_DOALL_ARG_FN_TYPE)(void *, void *);

typedef void (* LHASH_DOALL_FN_TYPE)(void *);

typedef void _IO_lock_t;

typedef struct _IO_marker _IO_marker, *P_IO_marker;

typedef struct _IO_FILE _IO_FILE, *P_IO_FILE;

typedef long __off_t;

typedef longlong __quad_t;

typedef __quad_t __off64_t;

struct _IO_marker {
    struct _IO_marker * _next;
    struct _IO_FILE * _sbuf;
    int _pos;
};

struct _IO_FILE {
    int _flags;
    char * _IO_read_ptr;
    char * _IO_read_end;
    char * _IO_read_base;
    char * _IO_write_base;
    char * _IO_write_ptr;
    char * _IO_write_end;
    char * _IO_buf_base;
    char * _IO_buf_end;
    char * _IO_save_base;
    char * _IO_backup_base;
    char * _IO_save_end;
    struct _IO_marker * _markers;
    struct _IO_FILE * _chain;
    int _fileno;
    int _flags2;
    __off_t _old_offset;
    ushort _cur_column;
    char _vtable_offset;
    char _shortbuf[1];
    _IO_lock_t * _lock;
    __off64_t _offset;
    void * __pad1;
    void * __pad2;
    void * __pad3;
    void * __pad4;
    size_t __pad5;
    int _mode;
    char _unused2[15];
};

typedef struct MD4state_st MD4state_st, *PMD4state_st;

typedef struct MD4state_st MD4_CTX;

struct MD4state_st {
    uint A;
    uint B;
    uint C;
    uint D;
    uint Nl;
    uint Nh;
    uint data[16];
    uint num;
};

typedef struct MD5state_st MD5state_st, *PMD5state_st;

typedef struct MD5state_st MD5_CTX;

struct MD5state_st {
    uint A;
    uint B;
    uint C;
    uint D;
    uint Nl;
    uint Nh;
    uint data[16];
    uint num;
};

typedef struct addrinfo addrinfo, *Paddrinfo;

typedef uint __socklen_t;

typedef __socklen_t socklen_t;

typedef struct sockaddr sockaddr, *Psockaddr;

typedef ushort sa_family_t;

struct addrinfo {
    int ai_flags;
    int ai_family;
    int ai_socktype;
    int ai_protocol;
    socklen_t ai_addrlen;
    struct sockaddr * ai_addr;
    char * ai_canonname;
    struct addrinfo * ai_next;
};

struct sockaddr {
    sa_family_t sa_family;
    char sa_data[14];
};

typedef union _union_958 _union_958, *P_union_958;

union _union_958 {
    X509_NAME * byName;
    ASN1_OCTET_STRING * byKey;
};

typedef union _union_962 _union_962, *P_union_962;

typedef struct ocsp_revoked_info_st ocsp_revoked_info_st, *Pocsp_revoked_info_st;

typedef struct ocsp_revoked_info_st OCSP_REVOKEDINFO;

union _union_962 {
    ASN1_NULL * good;
    OCSP_REVOKEDINFO * revoked;
    ASN1_NULL * unknown;
};

struct ocsp_revoked_info_st {
    ASN1_GENERALIZEDTIME * revocationTime;
    ASN1_ENUMERATED * revocationReason;
};

typedef struct ocsp_basic_response_st ocsp_basic_response_st, *Pocsp_basic_response_st;

typedef struct ocsp_response_data_st ocsp_response_data_st, *Pocsp_response_data_st;

typedef struct ocsp_response_data_st OCSP_RESPDATA;

typedef struct ocsp_responder_id_st ocsp_responder_id_st, *Pocsp_responder_id_st;

typedef struct ocsp_responder_id_st OCSP_RESPID;

typedef struct stack_st_OCSP_SINGLERESP stack_st_OCSP_SINGLERESP, *Pstack_st_OCSP_SINGLERESP;

struct ocsp_response_data_st {
    ASN1_INTEGER * version;
    OCSP_RESPID * responderId;
    ASN1_GENERALIZEDTIME * producedAt;
    struct stack_st_OCSP_SINGLERESP * responses;
    struct stack_st_X509_EXTENSION * responseExtensions;
};

struct ocsp_responder_id_st {
    int type;
    union _union_958 value;
};

struct ocsp_basic_response_st {
    OCSP_RESPDATA * tbsResponseData;
    X509_ALGOR * signatureAlgorithm;
    ASN1_BIT_STRING * signature;
    struct stack_st_X509 * certs;
};

struct stack_st_OCSP_SINGLERESP {
    _STACK stack;
};

typedef struct ocsp_basic_response_st OCSP_BASICRESP;

typedef struct ocsp_cert_id_st ocsp_cert_id_st, *Pocsp_cert_id_st;

struct ocsp_cert_id_st {
    X509_ALGOR * hashAlgorithm;
    ASN1_OCTET_STRING * issuerNameHash;
    ASN1_OCTET_STRING * issuerKeyHash;
    ASN1_INTEGER * serialNumber;
};

typedef struct ocsp_cert_status_st ocsp_cert_status_st, *Pocsp_cert_status_st;

struct ocsp_cert_status_st {
    int type;
    union _union_962 value;
};

typedef struct ocsp_cert_id_st OCSP_CERTID;

typedef struct ocsp_cert_status_st OCSP_CERTSTATUS;

typedef struct ocsp_resp_bytes_st ocsp_resp_bytes_st, *Pocsp_resp_bytes_st;

struct ocsp_resp_bytes_st {
    ASN1_OBJECT * responseType;
    ASN1_OCTET_STRING * response;
};

typedef struct ocsp_resp_bytes_st OCSP_RESPBYTES;

typedef struct ocsp_single_response_st ocsp_single_response_st, *Pocsp_single_response_st;

struct ocsp_single_response_st {
    OCSP_CERTID * certId;
    OCSP_CERTSTATUS * certStatus;
    ASN1_GENERALIZEDTIME * thisUpdate;
    ASN1_GENERALIZEDTIME * nextUpdate;
    struct stack_st_X509_EXTENSION * singleExtensions;
};

typedef struct ocsp_single_response_st OCSP_SINGLERESP;

typedef int (CRYPTO_EX_dup)(CRYPTO_EX_DATA *, CRYPTO_EX_DATA *, void *, int, long, void *);

typedef void (CRYPTO_EX_free)(void *, void *, CRYPTO_EX_DATA *, int, long, void *);

typedef int (CRYPTO_EX_new)(void *, void *, CRYPTO_EX_DATA *, int, long, void *);

typedef struct ecdh_method ecdh_method, *Pecdh_method;

struct ecdh_method {
};

typedef struct ecdh_method ECDH_METHOD;

typedef struct ecdsa_method ecdsa_method, *Pecdsa_method;

typedef struct ecdsa_method ECDSA_METHOD;

struct ecdsa_method {
};

typedef struct ocsp_response_st ocsp_response_st, *Pocsp_response_st;

typedef struct ocsp_response_st OCSP_RESPONSE;

struct ocsp_response_st {
    ASN1_ENUMERATED * responseStatus;
    OCSP_RESPBYTES * responseBytes;
};

typedef struct rand_meth_st rand_meth_st, *Prand_meth_st;

struct rand_meth_st {
    void (* seed)(void *, int);
    int (* bytes)(uchar *, int);
    void (* cleanup)(void);
    void (* add)(void *, int, double);
    int (* pseudorand)(uchar *, int);
    int (* status)(void);
};

typedef struct rand_meth_st RAND_METHOD;

typedef struct ui_st ui_st, *Pui_st;

typedef struct ui_st UI;

struct ui_st {
};

typedef struct PKCS12 PKCS12, *PPKCS12;

typedef struct PKCS12_MAC_DATA PKCS12_MAC_DATA, *PPKCS12_MAC_DATA;

typedef struct pkcs7_st pkcs7_st, *Ppkcs7_st;

typedef struct pkcs7_st PKCS7;

typedef struct X509_sig_st X509_sig_st, *PX509_sig_st;

typedef struct X509_sig_st X509_SIG;

typedef union _union_444 _union_444, *P_union_444;

typedef struct pkcs7_signed_st pkcs7_signed_st, *Ppkcs7_signed_st;

typedef struct pkcs7_signed_st PKCS7_SIGNED;

typedef struct pkcs7_enveloped_st pkcs7_enveloped_st, *Ppkcs7_enveloped_st;

typedef struct pkcs7_enveloped_st PKCS7_ENVELOPE;

typedef struct pkcs7_signedandenveloped_st pkcs7_signedandenveloped_st, *Ppkcs7_signedandenveloped_st;

typedef struct pkcs7_signedandenveloped_st PKCS7_SIGN_ENVELOPE;

typedef struct pkcs7_digest_st pkcs7_digest_st, *Ppkcs7_digest_st;

typedef struct pkcs7_digest_st PKCS7_DIGEST;

typedef struct pkcs7_encrypted_st pkcs7_encrypted_st, *Ppkcs7_encrypted_st;

typedef struct pkcs7_encrypted_st PKCS7_ENCRYPT;

typedef struct stack_st_PKCS7_SIGNER_INFO stack_st_PKCS7_SIGNER_INFO, *Pstack_st_PKCS7_SIGNER_INFO;

typedef struct stack_st_PKCS7_RECIP_INFO stack_st_PKCS7_RECIP_INFO, *Pstack_st_PKCS7_RECIP_INFO;

typedef struct pkcs7_enc_content_st pkcs7_enc_content_st, *Ppkcs7_enc_content_st;

typedef struct pkcs7_enc_content_st PKCS7_ENC_CONTENT;

struct stack_st_PKCS7_RECIP_INFO {
    _STACK stack;
};

struct pkcs7_digest_st {
    ASN1_INTEGER * version;
    X509_ALGOR * md;
    struct pkcs7_st * contents;
    ASN1_OCTET_STRING * digest;
};

struct PKCS12 {
    ASN1_INTEGER * version;
    struct PKCS12_MAC_DATA * mac;
    PKCS7 * authsafes;
};

union _union_444 {
    char * ptr;
    ASN1_OCTET_STRING * data;
    PKCS7_SIGNED * sign;
    PKCS7_ENVELOPE * enveloped;
    PKCS7_SIGN_ENVELOPE * signed_and_enveloped;
    PKCS7_DIGEST * digest;
    PKCS7_ENCRYPT * encrypted;
    ASN1_TYPE * other;
};

struct pkcs7_st {
    uchar * asn1;
    long length;
    int state;
    int detached;
    ASN1_OBJECT * type;
    union _union_444 d;
};

struct pkcs7_encrypted_st {
    ASN1_INTEGER * version;
    PKCS7_ENC_CONTENT * enc_data;
};

struct pkcs7_signedandenveloped_st {
    ASN1_INTEGER * version;
    struct stack_st_X509_ALGOR * md_algs;
    struct stack_st_X509 * cert;
    struct stack_st_X509_CRL * crl;
    struct stack_st_PKCS7_SIGNER_INFO * signer_info;
    PKCS7_ENC_CONTENT * enc_data;
    struct stack_st_PKCS7_RECIP_INFO * recipientinfo;
};

struct PKCS12_MAC_DATA {
    X509_SIG * dinfo;
    ASN1_OCTET_STRING * salt;
    ASN1_INTEGER * iter;
};

struct X509_sig_st {
    X509_ALGOR * algor;
    ASN1_OCTET_STRING * digest;
};

struct pkcs7_enveloped_st {
    ASN1_INTEGER * version;
    struct stack_st_PKCS7_RECIP_INFO * recipientinfo;
    PKCS7_ENC_CONTENT * enc_data;
};

struct pkcs7_signed_st {
    ASN1_INTEGER * version;
    struct stack_st_X509_ALGOR * md_algs;
    struct stack_st_X509 * cert;
    struct stack_st_X509_CRL * crl;
    struct stack_st_PKCS7_SIGNER_INFO * signer_info;
    struct pkcs7_st * contents;
};

struct stack_st_PKCS7_SIGNER_INFO {
    _STACK stack;
};

struct pkcs7_enc_content_st {
    ASN1_OBJECT * content_type;
    X509_ALGOR * algorithm;
    ASN1_OCTET_STRING * enc_data;
    EVP_CIPHER * cipher;
};

typedef ulong nfds_t;

typedef struct pollfd pollfd, *Ppollfd;

struct pollfd {
    int fd;
    short events;
    short revents;
};

typedef struct __pthread_internal_slist __pthread_internal_slist, *P__pthread_internal_slist;

struct __pthread_internal_slist {
    struct __pthread_internal_slist * __next;
};

typedef struct __pthread_mutex_s __pthread_mutex_s, *P__pthread_mutex_s;

typedef union _union_13 _union_13, *P_union_13;

typedef struct __pthread_internal_slist __pthread_slist_t;

union _union_13 {
    int __spins;
    __pthread_slist_t __list;
};

struct __pthread_mutex_s {
    int __lock;
    uint __count;
    int __owner;
    int __kind;
    uint __nusers;
    union _union_13 field_0x14;
};

typedef struct _struct_16 _struct_16, *P_struct_16;

struct _struct_16 {
    int __lock;
    uint __futex;
    ulonglong __total_seq;
    ulonglong __wakeup_seq;
    ulonglong __woken_seq;
    void * __mutex;
    uint __nwaiters;
    uint __broadcast_seq;
};

typedef union pthread_attr_t pthread_attr_t, *Ppthread_attr_t;

union pthread_attr_t {
    char __size[36];
    long __align;
};

typedef union pthread_cond_t pthread_cond_t, *Ppthread_cond_t;

union pthread_cond_t {
    struct _struct_16 __data;
    char __size[48];
    longlong __align;
};

typedef union pthread_condattr_t pthread_condattr_t, *Ppthread_condattr_t;

union pthread_condattr_t {
    char __size[4];
    int __align;
};

typedef union pthread_mutex_t pthread_mutex_t, *Ppthread_mutex_t;

union pthread_mutex_t {
    struct __pthread_mutex_s __data;
    char __size[24];
    long __align;
};

typedef union pthread_mutexattr_t pthread_mutexattr_t, *Ppthread_mutexattr_t;

union pthread_mutexattr_t {
    char __size[4];
    int __align;
};

typedef ulong pthread_t;

typedef struct passwd passwd, *Ppasswd;

typedef uint __uid_t;

typedef uint __gid_t;

struct passwd {
    char * pw_name;
    char * pw_passwd;
    __uid_t pw_uid;
    __gid_t pw_gid;
    char * pw_gecos;
    char * pw_dir;
    char * pw_shell;
};

typedef struct memory_pool<char> memory_pool<char>, *Pmemory_pool<char>;

struct memory_pool<char> { /* PlaceHolder Class Structure */
};

typedef struct xml_document<char> xml_document<char>, *Pxml_document<char>;

struct xml_document<char> { /* PlaceHolder Class Structure */
};

typedef struct xml_node<char> xml_node<char>, *Pxml_node<char>;

struct xml_node<char> { /* PlaceHolder Class Structure */
};

typedef long __fd_mask;

typedef struct fd_set fd_set, *Pfd_set;

struct fd_set {
    __fd_mask fds_bits[128];
};

typedef struct SHA256state_st SHA256state_st, *PSHA256state_st;

typedef struct SHA256state_st SHA256_CTX;

struct SHA256state_st {
    uint h[8];
    uint Nl;
    uint Nh;
    uint data[16];
    uint num;
    uint md_len;
};

typedef union _union_1048 _union_1048, *P_union_1048;

typedef struct siginfo siginfo, *Psiginfo;

typedef struct siginfo siginfo_t;

typedef void (* __sighandler_t)(int);

typedef union _union_1028 _union_1028, *P_union_1028;

typedef struct _struct_1029 _struct_1029, *P_struct_1029;

typedef struct _struct_1030 _struct_1030, *P_struct_1030;

typedef struct _struct_1031 _struct_1031, *P_struct_1031;

typedef struct _struct_1032 _struct_1032, *P_struct_1032;

typedef struct _struct_1033 _struct_1033, *P_struct_1033;

typedef struct _struct_1034 _struct_1034, *P_struct_1034;

typedef int __pid_t;

typedef union sigval sigval, *Psigval;

typedef union sigval sigval_t;

typedef long __clock_t;

union sigval {
    int sival_int;
    void * sival_ptr;
};

struct _struct_1031 {
    __pid_t si_pid;
    __uid_t si_uid;
    sigval_t si_sigval;
};

struct _struct_1033 {
    void * si_addr;
};

struct _struct_1029 {
    __pid_t si_pid;
    __uid_t si_uid;
};

struct _struct_1030 {
    int si_tid;
    int si_overrun;
    sigval_t si_sigval;
};

struct _struct_1034 {
    long si_band;
    int si_fd;
};

struct _struct_1032 {
    __pid_t si_pid;
    __uid_t si_uid;
    int si_status;
    __clock_t si_utime;
    __clock_t si_stime;
};

union _union_1028 {
    int _pad[125];
    struct _struct_1029 _kill;
    struct _struct_1030 _timer;
    struct _struct_1031 _rt;
    struct _struct_1032 _sigchld;
    struct _struct_1033 _sigfault;
    struct _struct_1034 _sigpoll;
};

struct siginfo {
    int si_signo;
    int si_errno;
    int si_code;
    union _union_1028 _sifields;
};

union _union_1048 {
    __sighandler_t sa_handler;
    void (* sa_sigaction)(int, siginfo_t *, void *);
};

typedef struct sigaction sigaction, *Psigaction;

typedef struct __sigset_t __sigset_t, *P__sigset_t;

struct __sigset_t {
    ulong __val[128];
};

struct sigaction {
    union _union_1048 __sigaction_handler;
    struct __sigset_t sa_mask;
    int sa_flags;
    void (* sa_restorer)(void);
};

typedef struct _struct_1045 _struct_1045, *P_struct_1045;

struct _struct_1045 {
    void (* _function)(sigval_t);
    void * _attribute;
};

typedef union _union_1044 _union_1044, *P_union_1044;

union _union_1044 {
    int _pad[61];
    __pid_t _tid;
    struct _struct_1045 _sigev_thread;
};

typedef struct stat stat, *Pstat;

typedef ulonglong __u_quad_t;

typedef __u_quad_t __dev_t;

typedef ulong __ino_t;

typedef uint __mode_t;

typedef uint __nlink_t;

typedef long __blksize_t;

typedef long __blkcnt_t;

typedef struct timespec timespec, *Ptimespec;

struct timespec {
    __time_t tv_sec;
    long tv_nsec;
};

struct stat {
    __dev_t st_dev;
    ushort __pad1;
    __ino_t st_ino;
    __mode_t st_mode;
    __nlink_t st_nlink;
    __uid_t st_uid;
    __gid_t st_gid;
    __dev_t st_rdev;
    ushort __pad2;
    __off_t st_size;
    __blksize_t st_blksize;
    __blkcnt_t st_blocks;
    struct timespec st_atim;
    struct timespec st_mtim;
    struct timespec st_ctim;
    ulong __unused4;
    ulong __unused5;
};

typedef struct __deque_base<Json--Reader--ErrorInfo,std--__ndk1--allocator<Json--Reader--ErrorInfo>> __deque_base<Json--Reader--ErrorInfo,std--__ndk1--allocator<Json--Reader--ErrorInfo>>, *P__deque_base<Json--Reader--ErrorInfo,std--__ndk1--allocator<Json--Reader--ErrorInfo>>;

struct __deque_base<Json--Reader--ErrorInfo,std--__ndk1--allocator<Json--Reader--ErrorInfo>> { /* PlaceHolder Class Structure */
};

typedef struct __deque_base<Json--Value*,std--__ndk1--allocator<Json--Value*>> __deque_base<Json--Value*,std--__ndk1--allocator<Json--Value*>>, *P__deque_base<Json--Value*,std--__ndk1--allocator<Json--Value*>>;

struct __deque_base<Json--Value*,std--__ndk1--allocator<Json--Value*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOn--AudioData*,std--__ndk1--allocator<BeOn--AudioData*>> __list_imp<BeOn--AudioData*,std--__ndk1--allocator<BeOn--AudioData*>>, *P__list_imp<BeOn--AudioData*,std--__ndk1--allocator<BeOn--AudioData*>>;

struct __list_imp<BeOn--AudioData*,std--__ndk1--allocator<BeOn--AudioData*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOn--BaseQueueObject*,std--__ndk1--allocator<BeOn--BaseQueueObject*>> __list_imp<BeOn--BaseQueueObject*,std--__ndk1--allocator<BeOn--BaseQueueObject*>>, *P__list_imp<BeOn--BaseQueueObject*,std--__ndk1--allocator<BeOn--BaseQueueObject*>>;

struct __list_imp<BeOn--BaseQueueObject*,std--__ndk1--allocator<BeOn--BaseQueueObject*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOn--BeOnQueryResult<BeOnEvent_const*>*,std--__ndk1--allocator<BeOn--BeOnQueryResult<BeOnEvent_const*>*>> __list_imp<BeOn--BeOnQueryResult<BeOnEvent_const*>*,std--__ndk1--allocator<BeOn--BeOnQueryResult<BeOnEvent_const*>*>>, *P__list_imp<BeOn--BeOnQueryResult<BeOnEvent_const*>*,std--__ndk1--allocator<BeOn--BeOnQueryResult<BeOnEvent_const*>*>>;

struct __list_imp<BeOn--BeOnQueryResult<BeOnEvent_const*>*,std--__ndk1--allocator<BeOn--BeOnQueryResult<BeOnEvent_const*>*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOn--DefaultTimer*,std--__ndk1--allocator<BeOn--DefaultTimer*>> __list_imp<BeOn--DefaultTimer*,std--__ndk1--allocator<BeOn--DefaultTimer*>>, *P__list_imp<BeOn--DefaultTimer*,std--__ndk1--allocator<BeOn--DefaultTimer*>>;

struct __list_imp<BeOn--DefaultTimer*,std--__ndk1--allocator<BeOn--DefaultTimer*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOn--IBeOnDbStatement*,std--__ndk1--allocator<BeOn--IBeOnDbStatement*>> __list_imp<BeOn--IBeOnDbStatement*,std--__ndk1--allocator<BeOn--IBeOnDbStatement*>>, *P__list_imp<BeOn--IBeOnDbStatement*,std--__ndk1--allocator<BeOn--IBeOnDbStatement*>>;

struct __list_imp<BeOn--IBeOnDbStatement*,std--__ndk1--allocator<BeOn--IBeOnDbStatement*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOn--MsgBuffer*,std--__ndk1--allocator<BeOn--MsgBuffer*>> __list_imp<BeOn--MsgBuffer*,std--__ndk1--allocator<BeOn--MsgBuffer*>>, *P__list_imp<BeOn--MsgBuffer*,std--__ndk1--allocator<BeOn--MsgBuffer*>>;

struct __list_imp<BeOn--MsgBuffer*,std--__ndk1--allocator<BeOn--MsgBuffer*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOn--SourceReference*,std--__ndk1--allocator<BeOn--SourceReference*>> __list_imp<BeOn--SourceReference*,std--__ndk1--allocator<BeOn--SourceReference*>>, *P__list_imp<BeOn--SourceReference*,std--__ndk1--allocator<BeOn--SourceReference*>>;

struct __list_imp<BeOn--SourceReference*,std--__ndk1--allocator<BeOn--SourceReference*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOn--State*,std--__ndk1--allocator<BeOn--State*>> __list_imp<BeOn--State*,std--__ndk1--allocator<BeOn--State*>>, *P__list_imp<BeOn--State*,std--__ndk1--allocator<BeOn--State*>>;

struct __list_imp<BeOn--State*,std--__ndk1--allocator<BeOn--State*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOn--WorkQueue--WorkQueueObject*,std--__ndk1--allocator<BeOn--WorkQueue--WorkQueueObject*>> __list_imp<BeOn--WorkQueue--WorkQueueObject*,std--__ndk1--allocator<BeOn--WorkQueue--WorkQueueObject*>>, *P__list_imp<BeOn--WorkQueue--WorkQueueObject*,std--__ndk1--allocator<BeOn--WorkQueue--WorkQueueObject*>>;

struct __list_imp<BeOn--WorkQueue--WorkQueueObject*,std--__ndk1--allocator<BeOn--WorkQueue--WorkQueueObject*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>> __list_imp<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>>, *P__list_imp<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>>;

struct __list_imp<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<BeOnEvent--EventType,std--__ndk1--allocator<BeOnEvent--EventType>> __list_imp<BeOnEvent--EventType,std--__ndk1--allocator<BeOnEvent--EventType>>, *P__list_imp<BeOnEvent--EventType,std--__ndk1--allocator<BeOnEvent--EventType>>;

struct __list_imp<BeOnEvent--EventType,std--__ndk1--allocator<BeOnEvent--EventType>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>> __list_imp<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>, *P__list_imp<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>;

struct __list_imp<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>> __list_imp<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>, *P__list_imp<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>;

struct __list_imp<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>> { /* PlaceHolder Class Structure */
};

typedef struct __list_imp<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership,std--__ndk1--allocator<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership>> __list_imp<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership,std--__ndk1--allocator<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership>>, *P__list_imp<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership,std--__ndk1--allocator<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership>>;

struct __list_imp<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership,std--__ndk1--allocator<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership>> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>&> __split_buffer<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>&>, *P__split_buffer<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>&>;

struct __split_buffer<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>&> __split_buffer<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>&>, *P__split_buffer<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>&>;

struct __split_buffer<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>&> __split_buffer<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>&>, *P__split_buffer<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>&>;

struct __split_buffer<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>&> __split_buffer<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>&>, *P__split_buffer<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>&>;

struct __split_buffer<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>&> __split_buffer<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>&>, *P__split_buffer<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>&>;

struct __split_buffer<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>&> __split_buffer<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>&>, *P__split_buffer<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>&>;

struct __split_buffer<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>&> __split_buffer<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>&>, *P__split_buffer<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>&>;

struct __split_buffer<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>&> __split_buffer<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>&>, *P__split_buffer<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>&>;

struct __split_buffer<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>&> __split_buffer<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>&>, *P__split_buffer<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>&>;

struct __split_buffer<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>&> __split_buffer<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>&>, *P__split_buffer<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>&>;

struct __split_buffer<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>&> __split_buffer<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>&>, *P__split_buffer<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>&>;

struct __split_buffer<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>&> __split_buffer<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>&>, *P__split_buffer<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>&>;

struct __split_buffer<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>&> __split_buffer<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>&>, *P__split_buffer<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>&>;

struct __split_buffer<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>&> __split_buffer<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>&>, *P__split_buffer<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>&>;

struct __split_buffer<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>&> __split_buffer<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>&>, *P__split_buffer<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>&>;

struct __split_buffer<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnPresence,std--__ndk1--allocator<BeOnPresence>&> __split_buffer<BeOnPresence,std--__ndk1--allocator<BeOnPresence>&>, *P__split_buffer<BeOnPresence,std--__ndk1--allocator<BeOnPresence>&>;

struct __split_buffer<BeOnPresence,std--__ndk1--allocator<BeOnPresence>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnProfile,std--__ndk1--allocator<BeOnProfile>&> __split_buffer<BeOnProfile,std--__ndk1--allocator<BeOnProfile>&>, *P__split_buffer<BeOnProfile,std--__ndk1--allocator<BeOnProfile>&>;

struct __split_buffer<BeOnProfile,std--__ndk1--allocator<BeOnProfile>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>&> __split_buffer<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>&>, *P__split_buffer<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>&>;

struct __split_buffer<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnTek*,std--__ndk1--allocator<BeOnTek*>&> __split_buffer<BeOnTek*,std--__ndk1--allocator<BeOnTek*>&>, *P__split_buffer<BeOnTek*,std--__ndk1--allocator<BeOnTek*>&>;

struct __split_buffer<BeOnTek*,std--__ndk1--allocator<BeOnTek*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>&> __split_buffer<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>&>, *P__split_buffer<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>&>;

struct __split_buffer<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<char,std--__ndk1--allocator<char>&> __split_buffer<char,std--__ndk1--allocator<char>&>, *P__split_buffer<char,std--__ndk1--allocator<char>&>;

struct __split_buffer<char,std--__ndk1--allocator<char>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>&> __split_buffer<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>&>, *P__split_buffer<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>&>;

struct __split_buffer<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<int,std--__ndk1--allocator<int>&> __split_buffer<int,std--__ndk1--allocator<int>&>, *P__split_buffer<int,std--__ndk1--allocator<int>&>;

struct __split_buffer<int,std--__ndk1--allocator<int>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>&> __split_buffer<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>&>, *P__split_buffer<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>&>;

struct __split_buffer<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>&> __split_buffer<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>&>, *P__split_buffer<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>&>;

struct __split_buffer<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<Json--Reader--ErrorInfo*,std--__ndk1--allocator<Json--Reader--ErrorInfo*>&> __split_buffer<Json--Reader--ErrorInfo*,std--__ndk1--allocator<Json--Reader--ErrorInfo*>&>, *P__split_buffer<Json--Reader--ErrorInfo*,std--__ndk1--allocator<Json--Reader--ErrorInfo*>&>;

struct __split_buffer<Json--Reader--ErrorInfo*,std--__ndk1--allocator<Json--Reader--ErrorInfo*>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<Json--Reader--ErrorInfo*,std--__ndk1--allocator<Json--Reader--ErrorInfo*>> __split_buffer<Json--Reader--ErrorInfo*,std--__ndk1--allocator<Json--Reader--ErrorInfo*>>, *P__split_buffer<Json--Reader--ErrorInfo*,std--__ndk1--allocator<Json--Reader--ErrorInfo*>>;

struct __split_buffer<Json--Reader--ErrorInfo*,std--__ndk1--allocator<Json--Reader--ErrorInfo*>> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>&> __split_buffer<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>&>, *P__split_buffer<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>&>;

struct __split_buffer<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<Json--Value**,std--__ndk1--allocator<Json--Value**>&> __split_buffer<Json--Value**,std--__ndk1--allocator<Json--Value**>&>, *P__split_buffer<Json--Value**,std--__ndk1--allocator<Json--Value**>&>;

struct __split_buffer<Json--Value**,std--__ndk1--allocator<Json--Value**>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<Json--Value**,std--__ndk1--allocator<Json--Value**>> __split_buffer<Json--Value**,std--__ndk1--allocator<Json--Value**>>, *P__split_buffer<Json--Value**,std--__ndk1--allocator<Json--Value**>>;

struct __split_buffer<Json--Value**,std--__ndk1--allocator<Json--Value**>> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>&> __split_buffer<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>&>, *P__split_buffer<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>&>;

struct __split_buffer<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>&> { /* PlaceHolder Class Structure */
};

typedef struct __split_buffer<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>&> __split_buffer<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>&>, *P__split_buffer<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>&>;

struct __split_buffer<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>&> { /* PlaceHolder Class Structure */
};

typedef struct __tree<int,std--__ndk1--less<int>,std--__ndk1--allocator<int>> __tree<int,std--__ndk1--less<int>,std--__ndk1--allocator<int>>, *P__tree<int,std--__ndk1--less<int>,std--__ndk1--allocator<int>>;

struct __tree<int,std--__ndk1--less<int>,std--__ndk1--allocator<int>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>,std--__ndk1--__map_value_compare<BeOn--AbstractUpdateObject--DataType,std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>,std--__ndk1--less<BeOn--AbstractUpdateObject--DataType>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>>> __tree<std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>,std--__ndk1--__map_value_compare<BeOn--AbstractUpdateObject--DataType,std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>,std--__ndk1--less<BeOn--AbstractUpdateObject--DataType>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>>>, *P__tree<std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>,std--__ndk1--__map_value_compare<BeOn--AbstractUpdateObject--DataType,std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>,std--__ndk1--less<BeOn--AbstractUpdateObject--DataType>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>>>;

struct __tree<std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>,std--__ndk1--__map_value_compare<BeOn--AbstractUpdateObject--DataType,std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>,std--__ndk1--less<BeOn--AbstractUpdateObject--DataType>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>>> __tree<std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>>>, *P__tree<std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>>>;

struct __tree<std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--BeOnAckTimer*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>>> __tree<std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>>>, *P__tree<std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>>>;

struct __tree<std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--GroupEmergencyStateMachine*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>>> __tree<std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>>>, *P__tree<std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>>>;

struct __tree<std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOn--PatchSimulselect*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<int,BeOnGroupMembership*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOnGroupMembership*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOnGroupMembership*>>> __tree<std--__ndk1--__value_type<int,BeOnGroupMembership*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOnGroupMembership*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOnGroupMembership*>>>, *P__tree<std--__ndk1--__value_type<int,BeOnGroupMembership*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOnGroupMembership*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOnGroupMembership*>>>;

struct __tree<std--__ndk1--__value_type<int,BeOnGroupMembership*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOnGroupMembership*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOnGroupMembership*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<int,BeOnGroupSubscription*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOnGroupSubscription*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOnGroupSubscription*>>> __tree<std--__ndk1--__value_type<int,BeOnGroupSubscription*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOnGroupSubscription*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOnGroupSubscription*>>>, *P__tree<std--__ndk1--__value_type<int,BeOnGroupSubscription*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOnGroupSubscription*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOnGroupSubscription*>>>;

struct __tree<std--__ndk1--__value_type<int,BeOnGroupSubscription*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,BeOnGroupSubscription*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,BeOnGroupSubscription*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<int,int>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,int>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,int>>> __tree<std--__ndk1--__value_type<int,int>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,int>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,int>>>, *P__tree<std--__ndk1--__value_type<int,int>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,int>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,int>>>;

struct __tree<std--__ndk1--__value_type<int,int>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,int>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,int>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<int,long>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,long>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,long>>> __tree<std--__ndk1--__value_type<int,long>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,long>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,long>>>, *P__tree<std--__ndk1--__value_type<int,long>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,long>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,long>>>;

struct __tree<std--__ndk1--__value_type<int,long>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,long>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,long>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>>> __tree<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>>>, *P__tree<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>>>;

struct __tree<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>>> __tree<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>>>, *P__tree<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>>>;

struct __tree<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>,std--__ndk1--__map_value_compare<int,std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>,std--__ndk1--less<int>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<Json--Value--CZString,Json--Value>,std--__ndk1--__map_value_compare<Json--Value--CZString,std--__ndk1--__value_type<Json--Value--CZString,Json--Value>,std--__ndk1--less<Json--Value--CZString>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<Json--Value--CZString,Json--Value>>> __tree<std--__ndk1--__value_type<Json--Value--CZString,Json--Value>,std--__ndk1--__map_value_compare<Json--Value--CZString,std--__ndk1--__value_type<Json--Value--CZString,Json--Value>,std--__ndk1--less<Json--Value--CZString>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<Json--Value--CZString,Json--Value>>>, *P__tree<std--__ndk1--__value_type<Json--Value--CZString,Json--Value>,std--__ndk1--__map_value_compare<Json--Value--CZString,std--__ndk1--__value_type<Json--Value--CZString,Json--Value>,std--__ndk1--less<Json--Value--CZString>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<Json--Value--CZString,Json--Value>>>;

struct __tree<std--__ndk1--__value_type<Json--Value--CZString,Json--Value>,std--__ndk1--__map_value_compare<Json--Value--CZString,std--__ndk1--__value_type<Json--Value--CZString,Json--Value>,std--__ndk1--less<Json--Value--CZString>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<Json--Value--CZString,Json--Value>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>,std--__ndk1--__map_value_compare<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>>> __tree<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>,std--__ndk1--__map_value_compare<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>>>, *P__tree<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>,std--__ndk1--__map_value_compare<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>>>;

struct __tree<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>,std--__ndk1--__map_value_compare<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--__map_value_compare<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>>> __tree<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--__map_value_compare<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>>>, *P__tree<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--__map_value_compare<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>>>;

struct __tree<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--__map_value_compare<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>>> __tree<std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>>>, *P__tree<std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>>>;

struct __tree<std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,BeOnTextMessage*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>>> __tree<std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>>>, *P__tree<std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>>>;

struct __tree<std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,IBeOnP25EncryptionLibrary*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>>> __tree<std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>>>, *P__tree<std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>>>;

struct __tree<std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,IBeOnVocoder*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<unsigned_char,unsigned_char*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,unsigned_char*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,unsigned_char*>>> __tree<std--__ndk1--__value_type<unsigned_char,unsigned_char*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,unsigned_char*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,unsigned_char*>>>, *P__tree<std--__ndk1--__value_type<unsigned_char,unsigned_char*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,unsigned_char*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,unsigned_char*>>>;

struct __tree<std--__ndk1--__value_type<unsigned_char,unsigned_char*>,std--__ndk1--__map_value_compare<unsigned_char,std--__ndk1--__value_type<unsigned_char,unsigned_char*>,std--__ndk1--less<unsigned_char>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_char,unsigned_char*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>>> __tree<std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>>>, *P__tree<std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>>>;

struct __tree<std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,BeOnInterestedUeData_const*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>>> __tree<std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>>>, *P__tree<std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>>>;

struct __tree<std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,BeOnUserSubscription*>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<std--__ndk1--__value_type<unsigned_long_long,int>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,int>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,int>>> __tree<std--__ndk1--__value_type<unsigned_long_long,int>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,int>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,int>>>, *P__tree<std--__ndk1--__value_type<unsigned_long_long,int>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,int>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,int>>>;

struct __tree<std--__ndk1--__value_type<unsigned_long_long,int>,std--__ndk1--__map_value_compare<unsigned_long_long,std--__ndk1--__value_type<unsigned_long_long,int>,std--__ndk1--less<unsigned_long_long>,true>,std--__ndk1--allocator<std--__ndk1--__value_type<unsigned_long_long,int>>> { /* PlaceHolder Class Structure */
};

typedef struct __tree<unsigned_long_long,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<unsigned_long_long>> __tree<unsigned_long_long,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<unsigned_long_long>>, *P__tree<unsigned_long_long,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<unsigned_long_long>>;

struct __tree<unsigned_long_long,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<unsigned_long_long>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>> __vector_base<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>>, *P__vector_base<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>>;

struct __vector_base<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>> __vector_base<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>>, *P__vector_base<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>>;

struct __vector_base<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>> __vector_base<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>>, *P__vector_base<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>>;

struct __vector_base<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>> __vector_base<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>>, *P__vector_base<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>>;

struct __vector_base<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>> __vector_base<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>>, *P__vector_base<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>>;

struct __vector_base<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOn--GeneralData_const*,std--__ndk1--allocator<BeOn--GeneralData_const*>> __vector_base<BeOn--GeneralData_const*,std--__ndk1--allocator<BeOn--GeneralData_const*>>, *P__vector_base<BeOn--GeneralData_const*,std--__ndk1--allocator<BeOn--GeneralData_const*>>;

struct __vector_base<BeOn--GeneralData_const*,std--__ndk1--allocator<BeOn--GeneralData_const*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>> __vector_base<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>>, *P__vector_base<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>>;

struct __vector_base<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOn--ProfileGroupMap*,std--__ndk1--allocator<BeOn--ProfileGroupMap*>> __vector_base<BeOn--ProfileGroupMap*,std--__ndk1--allocator<BeOn--ProfileGroupMap*>>, *P__vector_base<BeOn--ProfileGroupMap*,std--__ndk1--allocator<BeOn--ProfileGroupMap*>>;

struct __vector_base<BeOn--ProfileGroupMap*,std--__ndk1--allocator<BeOn--ProfileGroupMap*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOn--SlnGroupMap*,std--__ndk1--allocator<BeOn--SlnGroupMap*>> __vector_base<BeOn--SlnGroupMap*,std--__ndk1--allocator<BeOn--SlnGroupMap*>>, *P__vector_base<BeOn--SlnGroupMap*,std--__ndk1--allocator<BeOn--SlnGroupMap*>>;

struct __vector_base<BeOn--SlnGroupMap*,std--__ndk1--allocator<BeOn--SlnGroupMap*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>> __vector_base<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>>, *P__vector_base<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>>;

struct __vector_base<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>> __vector_base<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>>, *P__vector_base<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>>;

struct __vector_base<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>> __vector_base<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>>, *P__vector_base<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>>;

struct __vector_base<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>> __vector_base<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>>, *P__vector_base<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>>;

struct __vector_base<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>> __vector_base<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>>, *P__vector_base<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>>;

struct __vector_base<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>> __vector_base<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>>, *P__vector_base<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>>;

struct __vector_base<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>> __vector_base<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>>, *P__vector_base<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>>;

struct __vector_base<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>> __vector_base<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>>, *P__vector_base<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>>;

struct __vector_base<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>> __vector_base<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>>, *P__vector_base<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>>;

struct __vector_base<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnPresence,std--__ndk1--allocator<BeOnPresence>> __vector_base<BeOnPresence,std--__ndk1--allocator<BeOnPresence>>, *P__vector_base<BeOnPresence,std--__ndk1--allocator<BeOnPresence>>;

struct __vector_base<BeOnPresence,std--__ndk1--allocator<BeOnPresence>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnProfile,std--__ndk1--allocator<BeOnProfile>> __vector_base<BeOnProfile,std--__ndk1--allocator<BeOnProfile>>, *P__vector_base<BeOnProfile,std--__ndk1--allocator<BeOnProfile>>;

struct __vector_base<BeOnProfile,std--__ndk1--allocator<BeOnProfile>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>> __vector_base<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>>, *P__vector_base<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>>;

struct __vector_base<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnTek*,std--__ndk1--allocator<BeOnTek*>> __vector_base<BeOnTek*,std--__ndk1--allocator<BeOnTek*>>, *P__vector_base<BeOnTek*,std--__ndk1--allocator<BeOnTek*>>;

struct __vector_base<BeOnTek*,std--__ndk1--allocator<BeOnTek*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>> __vector_base<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>>, *P__vector_base<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>>;

struct __vector_base<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<char,std--__ndk1--allocator<char>> __vector_base<char,std--__ndk1--allocator<char>>, *P__vector_base<char,std--__ndk1--allocator<char>>;

struct __vector_base<char,std--__ndk1--allocator<char>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>> __vector_base<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>>, *P__vector_base<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>>;

struct __vector_base<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<int,std--__ndk1--allocator<int>> __vector_base<int,std--__ndk1--allocator<int>>, *P__vector_base<int,std--__ndk1--allocator<int>>;

struct __vector_base<int,std--__ndk1--allocator<int>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>> __vector_base<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>>, *P__vector_base<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>>;

struct __vector_base<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>> __vector_base<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>>, *P__vector_base<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>>;

struct __vector_base<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>> __vector_base<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>>, *P__vector_base<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>>;

struct __vector_base<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>> __vector_base<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>>, *P__vector_base<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>>;

struct __vector_base<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>> { /* PlaceHolder Class Structure */
};

typedef struct __vector_base<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>> __vector_base<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>>, *P__vector_base<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>>;

struct __vector_base<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>> { /* PlaceHolder Class Structure */
};

typedef struct basic_filebuf<char,std--__ndk1--char_traits<char>> basic_filebuf<char,std--__ndk1--char_traits<char>>, *Pbasic_filebuf<char,std--__ndk1--char_traits<char>>;

struct basic_filebuf<char,std--__ndk1--char_traits<char>> { /* PlaceHolder Class Structure */
};

typedef struct basic_ifstream<char,std--__ndk1--char_traits<char>> basic_ifstream<char,std--__ndk1--char_traits<char>>, *Pbasic_ifstream<char,std--__ndk1--char_traits<char>>;

struct basic_ifstream<char,std--__ndk1--char_traits<char>> { /* PlaceHolder Class Structure */
};

typedef struct basic_istream<char,std--__ndk1--char_traits<char>> basic_istream<char,std--__ndk1--char_traits<char>>, *Pbasic_istream<char,std--__ndk1--char_traits<char>>;

struct basic_istream<char,std--__ndk1--char_traits<char>> { /* PlaceHolder Class Structure */
};

typedef struct basic_ofstream<char,std--__ndk1--char_traits<char>> basic_ofstream<char,std--__ndk1--char_traits<char>>, *Pbasic_ofstream<char,std--__ndk1--char_traits<char>>;

struct basic_ofstream<char,std--__ndk1--char_traits<char>> { /* PlaceHolder Class Structure */
};

typedef struct basic_ostream<char,std--__ndk1--char_traits<char>> basic_ostream<char,std--__ndk1--char_traits<char>>, *Pbasic_ostream<char,std--__ndk1--char_traits<char>>;

struct basic_ostream<char,std--__ndk1--char_traits<char>> { /* PlaceHolder Class Structure */
};

typedef struct basic_ostringstream<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>> basic_ostringstream<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>, *Pbasic_ostringstream<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>;

struct basic_ostringstream<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>> { /* PlaceHolder Class Structure */
};

typedef struct basic_streambuf<char,std--__ndk1--char_traits<char>> basic_streambuf<char,std--__ndk1--char_traits<char>>, *Pbasic_streambuf<char,std--__ndk1--char_traits<char>>;

struct basic_streambuf<char,std--__ndk1--char_traits<char>> { /* PlaceHolder Class Structure */
};

typedef struct basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>> basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>, *Pbasic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>;

struct basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>> { /* PlaceHolder Class Structure */
};

typedef struct basic_stringbuf<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>> basic_stringbuf<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>, *Pbasic_stringbuf<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>;

struct basic_stringbuf<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>> { /* PlaceHolder Class Structure */
};

typedef struct deque<Json--Reader--ErrorInfo,std--__ndk1--allocator<Json--Reader--ErrorInfo>> deque<Json--Reader--ErrorInfo,std--__ndk1--allocator<Json--Reader--ErrorInfo>>, *Pdeque<Json--Reader--ErrorInfo,std--__ndk1--allocator<Json--Reader--ErrorInfo>>;

struct deque<Json--Reader--ErrorInfo,std--__ndk1--allocator<Json--Reader--ErrorInfo>> { /* PlaceHolder Class Structure */
};

typedef struct deque<Json--Value*,std--__ndk1--allocator<Json--Value*>> deque<Json--Value*,std--__ndk1--allocator<Json--Value*>>, *Pdeque<Json--Value*,std--__ndk1--allocator<Json--Value*>>;

struct deque<Json--Value*,std--__ndk1--allocator<Json--Value*>> { /* PlaceHolder Class Structure */
};

typedef struct ios_base ios_base, *Pios_base;

struct ios_base { /* PlaceHolder Class Structure */
};

typedef struct list<BeOn--AudioData*,std--__ndk1--allocator<BeOn--AudioData*>> list<BeOn--AudioData*,std--__ndk1--allocator<BeOn--AudioData*>>, *Plist<BeOn--AudioData*,std--__ndk1--allocator<BeOn--AudioData*>>;

struct list<BeOn--AudioData*,std--__ndk1--allocator<BeOn--AudioData*>> { /* PlaceHolder Class Structure */
};

typedef struct list<BeOn--BaseQueueObject*,std--__ndk1--allocator<BeOn--BaseQueueObject*>> list<BeOn--BaseQueueObject*,std--__ndk1--allocator<BeOn--BaseQueueObject*>>, *Plist<BeOn--BaseQueueObject*,std--__ndk1--allocator<BeOn--BaseQueueObject*>>;

struct list<BeOn--BaseQueueObject*,std--__ndk1--allocator<BeOn--BaseQueueObject*>> { /* PlaceHolder Class Structure */
};

typedef struct list<BeOn--BeOnQueryResult<BeOnEvent_const*>*,std--__ndk1--allocator<BeOn--BeOnQueryResult<BeOnEvent_const*>*>> list<BeOn--BeOnQueryResult<BeOnEvent_const*>*,std--__ndk1--allocator<BeOn--BeOnQueryResult<BeOnEvent_const*>*>>, *Plist<BeOn--BeOnQueryResult<BeOnEvent_const*>*,std--__ndk1--allocator<BeOn--BeOnQueryResult<BeOnEvent_const*>*>>;

struct list<BeOn--BeOnQueryResult<BeOnEvent_const*>*,std--__ndk1--allocator<BeOn--BeOnQueryResult<BeOnEvent_const*>*>> { /* PlaceHolder Class Structure */
};

typedef struct list<BeOn--DefaultTimer*,std--__ndk1--allocator<BeOn--DefaultTimer*>> list<BeOn--DefaultTimer*,std--__ndk1--allocator<BeOn--DefaultTimer*>>, *Plist<BeOn--DefaultTimer*,std--__ndk1--allocator<BeOn--DefaultTimer*>>;

struct list<BeOn--DefaultTimer*,std--__ndk1--allocator<BeOn--DefaultTimer*>> { /* PlaceHolder Class Structure */
};

typedef struct list<BeOn--IBeOnDbStatement*,std--__ndk1--allocator<BeOn--IBeOnDbStatement*>> list<BeOn--IBeOnDbStatement*,std--__ndk1--allocator<BeOn--IBeOnDbStatement*>>, *Plist<BeOn--IBeOnDbStatement*,std--__ndk1--allocator<BeOn--IBeOnDbStatement*>>;

struct list<BeOn--IBeOnDbStatement*,std--__ndk1--allocator<BeOn--IBeOnDbStatement*>> { /* PlaceHolder Class Structure */
};

typedef struct list<BeOn--MsgBuffer*,std--__ndk1--allocator<BeOn--MsgBuffer*>> list<BeOn--MsgBuffer*,std--__ndk1--allocator<BeOn--MsgBuffer*>>, *Plist<BeOn--MsgBuffer*,std--__ndk1--allocator<BeOn--MsgBuffer*>>;

struct list<BeOn--MsgBuffer*,std--__ndk1--allocator<BeOn--MsgBuffer*>> { /* PlaceHolder Class Structure */
};

typedef struct list<BeOn--SourceReference*,std--__ndk1--allocator<BeOn--SourceReference*>> list<BeOn--SourceReference*,std--__ndk1--allocator<BeOn--SourceReference*>>, *Plist<BeOn--SourceReference*,std--__ndk1--allocator<BeOn--SourceReference*>>;

struct list<BeOn--SourceReference*,std--__ndk1--allocator<BeOn--SourceReference*>> { /* PlaceHolder Class Structure */
};

typedef struct list<BeOn--State*,std--__ndk1--allocator<BeOn--State*>> list<BeOn--State*,std--__ndk1--allocator<BeOn--State*>>, *Plist<BeOn--State*,std--__ndk1--allocator<BeOn--State*>>;

struct list<BeOn--State*,std--__ndk1--allocator<BeOn--State*>> { /* PlaceHolder Class Structure */
};

typedef struct list<BeOn--WorkQueue--WorkQueueObject*,std--__ndk1--allocator<BeOn--WorkQueue--WorkQueueObject*>> list<BeOn--WorkQueue--WorkQueueObject*,std--__ndk1--allocator<BeOn--WorkQueue--WorkQueueObject*>>, *Plist<BeOn--WorkQueue--WorkQueueObject*,std--__ndk1--allocator<BeOn--WorkQueue--WorkQueueObject*>>;

struct list<BeOn--WorkQueue--WorkQueueObject*,std--__ndk1--allocator<BeOn--WorkQueue--WorkQueueObject*>> { /* PlaceHolder Class Structure */
};

typedef struct list<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>> list<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>>, *Plist<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>>;

struct list<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>> { /* PlaceHolder Class Structure */
};

typedef struct list<BeOnEvent--EventType,std--__ndk1--allocator<BeOnEvent--EventType>> list<BeOnEvent--EventType,std--__ndk1--allocator<BeOnEvent--EventType>>, *Plist<BeOnEvent--EventType,std--__ndk1--allocator<BeOnEvent--EventType>>;

struct list<BeOnEvent--EventType,std--__ndk1--allocator<BeOnEvent--EventType>> { /* PlaceHolder Class Structure */
};

typedef struct list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>> list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>, *Plist<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>;

struct list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>> { /* PlaceHolder Class Structure */
};

typedef struct list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>> list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>, *Plist<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>;

struct list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>> { /* PlaceHolder Class Structure */
};

typedef struct list<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership,std--__ndk1--allocator<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership>> list<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership,std--__ndk1--allocator<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership>>, *Plist<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership,std--__ndk1--allocator<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership>>;

struct list<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership,std--__ndk1--allocator<OrderedBeOnGroupMembershipUpdates--TimeStampedBeOnGroupMembership>> { /* PlaceHolder Class Structure */
};

typedef struct locale locale, *Plocale;

struct locale { /* PlaceHolder Class Structure */
};

typedef struct map<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*,std--__ndk1--less<BeOn--AbstractUpdateObject--DataType>,std--__ndk1--allocator<std--__ndk1--pair<BeOn--AbstractUpdateObject--DataType_const,BeOn--AbstractBeOnDAO*>>> map<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*,std--__ndk1--less<BeOn--AbstractUpdateObject--DataType>,std--__ndk1--allocator<std--__ndk1--pair<BeOn--AbstractUpdateObject--DataType_const,BeOn--AbstractBeOnDAO*>>>, *Pmap<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*,std--__ndk1--less<BeOn--AbstractUpdateObject--DataType>,std--__ndk1--allocator<std--__ndk1--pair<BeOn--AbstractUpdateObject--DataType_const,BeOn--AbstractBeOnDAO*>>>;

struct map<BeOn--AbstractUpdateObject--DataType,BeOn--AbstractBeOnDAO*,std--__ndk1--less<BeOn--AbstractUpdateObject--DataType>,std--__ndk1--allocator<std--__ndk1--pair<BeOn--AbstractUpdateObject--DataType_const,BeOn--AbstractBeOnDAO*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<int,BeOn--BeOnAckTimer*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOn--BeOnAckTimer*>>> map<int,BeOn--BeOnAckTimer*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOn--BeOnAckTimer*>>>, *Pmap<int,BeOn--BeOnAckTimer*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOn--BeOnAckTimer*>>>;

struct map<int,BeOn--BeOnAckTimer*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOn--BeOnAckTimer*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<int,BeOn--GroupEmergencyStateMachine*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOn--GroupEmergencyStateMachine*>>> map<int,BeOn--GroupEmergencyStateMachine*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOn--GroupEmergencyStateMachine*>>>, *Pmap<int,BeOn--GroupEmergencyStateMachine*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOn--GroupEmergencyStateMachine*>>>;

struct map<int,BeOn--GroupEmergencyStateMachine*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOn--GroupEmergencyStateMachine*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<int,BeOnGroupMembership*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOnGroupMembership*>>> map<int,BeOnGroupMembership*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOnGroupMembership*>>>, *Pmap<int,BeOnGroupMembership*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOnGroupMembership*>>>;

struct map<int,BeOnGroupMembership*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOnGroupMembership*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<int,BeOnGroupSubscription*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOnGroupSubscription*>>> map<int,BeOnGroupSubscription*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOnGroupSubscription*>>>, *Pmap<int,BeOnGroupSubscription*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOnGroupSubscription*>>>;

struct map<int,BeOnGroupSubscription*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,BeOnGroupSubscription*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<int,int,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,int>>> map<int,int,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,int>>>, *Pmap<int,int,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,int>>>;

struct map<int,int,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,int>>> { /* PlaceHolder Class Structure */
};

typedef struct map<int,long,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,long>>> map<int,long,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,long>>>, *Pmap<int,long,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,long>>>;

struct map<int,long,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,long>>> { /* PlaceHolder Class Structure */
};

typedef struct map<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>>> map<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>>>, *Pmap<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>>>;

struct map<int,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,std--__ndk1--list<IBeOnEventListener*,std--__ndk1--allocator<IBeOnEventListener*>>*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>>> map<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>>>, *Pmap<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>>>;

struct map<int,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*,std--__ndk1--less<int>,std--__ndk1--allocator<std--__ndk1--pair<int_const,std--__ndk1--list<IBeOnSubscriptionManagerEventListener*,std--__ndk1--allocator<IBeOnSubscriptionManagerEventListener*>>*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--allocator<std--__ndk1--pair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>const,bool>>> map<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--allocator<std--__ndk1--pair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>const,bool>>>, *Pmap<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--allocator<std--__ndk1--pair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>const,bool>>>;

struct map<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,bool,std--__ndk1--less<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>,std--__ndk1--allocator<std--__ndk1--pair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>const,bool>>> { /* PlaceHolder Class Structure */
};

typedef struct map<unsigned_char,IBeOnP25EncryptionLibrary*,std--__ndk1--less<unsigned_char>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_char_const,IBeOnP25EncryptionLibrary*>>> map<unsigned_char,IBeOnP25EncryptionLibrary*,std--__ndk1--less<unsigned_char>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_char_const,IBeOnP25EncryptionLibrary*>>>, *Pmap<unsigned_char,IBeOnP25EncryptionLibrary*,std--__ndk1--less<unsigned_char>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_char_const,IBeOnP25EncryptionLibrary*>>>;

struct map<unsigned_char,IBeOnP25EncryptionLibrary*,std--__ndk1--less<unsigned_char>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_char_const,IBeOnP25EncryptionLibrary*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<unsigned_char,IBeOnVocoder*,std--__ndk1--less<unsigned_char>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_char_const,IBeOnVocoder*>>> map<unsigned_char,IBeOnVocoder*,std--__ndk1--less<unsigned_char>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_char_const,IBeOnVocoder*>>>, *Pmap<unsigned_char,IBeOnVocoder*,std--__ndk1--less<unsigned_char>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_char_const,IBeOnVocoder*>>>;

struct map<unsigned_char,IBeOnVocoder*,std--__ndk1--less<unsigned_char>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_char_const,IBeOnVocoder*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<unsigned_long_long,BeOnInterestedUeData_const*,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,BeOnInterestedUeData_const*>>> map<unsigned_long_long,BeOnInterestedUeData_const*,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,BeOnInterestedUeData_const*>>>, *Pmap<unsigned_long_long,BeOnInterestedUeData_const*,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,BeOnInterestedUeData_const*>>>;

struct map<unsigned_long_long,BeOnInterestedUeData_const*,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,BeOnInterestedUeData_const*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<unsigned_long_long,BeOnUserSubscription*,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,BeOnUserSubscription*>>> map<unsigned_long_long,BeOnUserSubscription*,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,BeOnUserSubscription*>>>, *Pmap<unsigned_long_long,BeOnUserSubscription*,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,BeOnUserSubscription*>>>;

struct map<unsigned_long_long,BeOnUserSubscription*,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,BeOnUserSubscription*>>> { /* PlaceHolder Class Structure */
};

typedef struct map<unsigned_long_long,int,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,int>>> map<unsigned_long_long,int,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,int>>>, *Pmap<unsigned_long_long,int,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,int>>>;

struct map<unsigned_long_long,int,std--__ndk1--less<unsigned_long_long>,std--__ndk1--allocator<std--__ndk1--pair<unsigned_long_long_const,int>>> { /* PlaceHolder Class Structure */
};

typedef struct pair<Json--Value--CZString_const,Json--Value> pair<Json--Value--CZString_const,Json--Value>, *Ppair<Json--Value--CZString_const,Json--Value>;

struct pair<Json--Value--CZString_const,Json--Value> { /* PlaceHolder Class Structure */
};

typedef struct pair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>> pair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>, *Ppair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>;

struct pair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>> { /* PlaceHolder Class Structure */
};

typedef struct pair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>const,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>> pair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>const,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>, *Ppair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>const,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>;

struct pair<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>const,std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>> vector<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>>, *Pvector<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>>;

struct vector<BeOn--BeOnContact*,std--__ndk1--allocator<BeOn--BeOnContact*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOn--BeOnUserLocation_const*,std--__ndk1--allocator<BeOn--BeOnUserLocation_const*>> vector<BeOn--BeOnUserLocation_const*,std--__ndk1--allocator<BeOn--BeOnUserLocation_const*>>, *Pvector<BeOn--BeOnUserLocation_const*,std--__ndk1--allocator<BeOn--BeOnUserLocation_const*>>;

struct vector<BeOn--BeOnUserLocation_const*,std--__ndk1--allocator<BeOn--BeOnUserLocation_const*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>> vector<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>>, *Pvector<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>>;

struct vector<BeOn--CoreGroup*,std--__ndk1--allocator<BeOn--CoreGroup*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>> vector<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>>, *Pvector<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>>;

struct vector<BeOn--CoreGroupInProfile*,std--__ndk1--allocator<BeOn--CoreGroupInProfile*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>> vector<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>>, *Pvector<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>>;

struct vector<BeOn--CorePresenceState*,std--__ndk1--allocator<BeOn--CorePresenceState*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>> vector<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>>, *Pvector<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>>;

struct vector<BeOn--CoreProfile*,std--__ndk1--allocator<BeOn--CoreProfile*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOn--GeneralData_const*,std--__ndk1--allocator<BeOn--GeneralData_const*>> vector<BeOn--GeneralData_const*,std--__ndk1--allocator<BeOn--GeneralData_const*>>, *Pvector<BeOn--GeneralData_const*,std--__ndk1--allocator<BeOn--GeneralData_const*>>;

struct vector<BeOn--GeneralData_const*,std--__ndk1--allocator<BeOn--GeneralData_const*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>> vector<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>>, *Pvector<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>>;

struct vector<BeOn--InterestedUEData,std--__ndk1--allocator<BeOn--InterestedUEData>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>> vector<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>>, *Pvector<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>>;

struct vector<BeOn--SlnGroupMap,std--__ndk1--allocator<BeOn--SlnGroupMap>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>> vector<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>>, *Pvector<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>>;

struct vector<BeOnEntity*,std--__ndk1--allocator<BeOnEntity*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>> vector<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>>, *Pvector<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>>;

struct vector<BeOnEntity_const*,std--__ndk1--allocator<BeOnEntity_const*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnEvent_const*,std--__ndk1--allocator<BeOnEvent_const*>> vector<BeOnEvent_const*,std--__ndk1--allocator<BeOnEvent_const*>>, *Pvector<BeOnEvent_const*,std--__ndk1--allocator<BeOnEvent_const*>>;

struct vector<BeOnEvent_const*,std--__ndk1--allocator<BeOnEvent_const*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>> vector<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>>, *Pvector<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>>;

struct vector<BeOnGroupId,std--__ndk1--allocator<BeOnGroupId>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>> vector<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>>, *Pvector<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>>;

struct vector<BeOnGroupInProfile,std--__ndk1--allocator<BeOnGroupInProfile>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>> vector<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>>, *Pvector<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>>;

struct vector<BeOnKeyPresence,std--__ndk1--allocator<BeOnKeyPresence>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>> vector<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>>, *Pvector<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>>;

struct vector<BeOnKeyPresence_const*,std--__ndk1--allocator<BeOnKeyPresence_const*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>> vector<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>>, *Pvector<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>>;

struct vector<BeOnLocation*,std--__ndk1--allocator<BeOnLocation*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>> vector<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>>, *Pvector<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>>;

struct vector<BeOnObject_const*,std--__ndk1--allocator<BeOnObject_const*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnPresence,std--__ndk1--allocator<BeOnPresence>> vector<BeOnPresence,std--__ndk1--allocator<BeOnPresence>>, *Pvector<BeOnPresence,std--__ndk1--allocator<BeOnPresence>>;

struct vector<BeOnPresence,std--__ndk1--allocator<BeOnPresence>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnProfile,std--__ndk1--allocator<BeOnProfile>> vector<BeOnProfile,std--__ndk1--allocator<BeOnProfile>>, *Pvector<BeOnProfile,std--__ndk1--allocator<BeOnProfile>>;

struct vector<BeOnProfile,std--__ndk1--allocator<BeOnProfile>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>> vector<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>>, *Pvector<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>>;

struct vector<BeOnSlnInfo*,std--__ndk1--allocator<BeOnSlnInfo*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnTek*,std--__ndk1--allocator<BeOnTek*>> vector<BeOnTek*,std--__ndk1--allocator<BeOnTek*>>, *Pvector<BeOnTek*,std--__ndk1--allocator<BeOnTek*>>;

struct vector<BeOnTek*,std--__ndk1--allocator<BeOnTek*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>> vector<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>>, *Pvector<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>>;

struct vector<BeOnUserId*,std--__ndk1--allocator<BeOnUserId*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<char,std--__ndk1--allocator<char>> vector<char,std--__ndk1--allocator<char>>, *Pvector<char,std--__ndk1--allocator<char>>;

struct vector<char,std--__ndk1--allocator<char>> { /* PlaceHolder Class Structure */
};

typedef struct vector<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>> vector<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>>, *Pvector<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>>;

struct vector<IBeOnVocoder*,std--__ndk1--allocator<IBeOnVocoder*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<int,std--__ndk1--allocator<int>> vector<int,std--__ndk1--allocator<int>>, *Pvector<int,std--__ndk1--allocator<int>>;

struct vector<int,std--__ndk1--allocator<int>> { /* PlaceHolder Class Structure */
};

typedef struct vector<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>> vector<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>>, *Pvector<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>>;

struct vector<Json--PathArgument,std--__ndk1--allocator<Json--PathArgument>> { /* PlaceHolder Class Structure */
};

typedef struct vector<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>> vector<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>>, *Pvector<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>>;

struct vector<Json--PathArgument_const*,std--__ndk1--allocator<Json--PathArgument_const*>> { /* PlaceHolder Class Structure */
};

typedef struct vector<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>> vector<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>>, *Pvector<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>>;

struct vector<Json--Reader--StructuredError,std--__ndk1--allocator<Json--Reader--StructuredError>> { /* PlaceHolder Class Structure */
};

typedef struct vector<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>> vector<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>>, *Pvector<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>>;

struct vector<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>,std--__ndk1--allocator<std--__ndk1--basic_string<char,std--__ndk1--char_traits<char>,std--__ndk1--allocator<char>>>> { /* PlaceHolder Class Structure */
};

typedef struct vector<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>> vector<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>>, *Pvector<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>>;

struct vector<unsigned_long_long,std--__ndk1--allocator<unsigned_long_long>> { /* PlaceHolder Class Structure */
};

typedef struct __ndk1 __ndk1, *P__ndk1;

struct __ndk1 { /* PlaceHolder Class Structure */
};

typedef struct bad_cast bad_cast, *Pbad_cast;

struct bad_cast { /* PlaceHolder Class Structure */
};

typedef struct length_error length_error, *Plength_error;

struct length_error { /* PlaceHolder Class Structure */
};

typedef struct logic_error logic_error, *Plogic_error;

struct logic_error { /* PlaceHolder Class Structure */
};

typedef struct out_of_range out_of_range, *Pout_of_range;

struct out_of_range { /* PlaceHolder Class Structure */
};

typedef void * __gnuc_va_list;

typedef struct _IO_FILE FILE;

typedef int (* __compar_fn_t)(void *, void *);

typedef struct timezone timezone, *Ptimezone;

typedef struct timezone * __timezone_ptr_t;

struct timezone {
    int tz_minuteswest;
    int tz_dsttime;
};

typedef int __clockid_t;

typedef __clockid_t clockid_t;

typedef struct itimerspec itimerspec, *Pitimerspec;

struct itimerspec {
    struct timespec it_interval;
    struct timespec it_value;
};

typedef struct sigevent sigevent, *Psigevent;

struct sigevent {
    sigval_t sigev_value;
    int sigev_signo;
    int sigev_notify;
    union _union_1044 _sigev_un;
};

typedef void * __timer_t;

typedef __timer_t timer_t;

typedef struct tm tm, *Ptm;

struct tm {
    int tm_sec;
    int tm_min;
    int tm_hour;
    int tm_mday;
    int tm_mon;
    int tm_year;
    int tm_wday;
    int tm_yday;
    int tm_isdst;
    long tm_gmtoff;
    char * tm_zone;
};

typedef int __ssize_t;

typedef longlong int64_t;

typedef __ssize_t ssize_t;

typedef struct ui_string_st ui_string_st, *Pui_string_st;

typedef struct ui_string_st UI_STRING;

struct ui_string_st {
};

typedef enum UI_string_types {
    UIT_BOOLEAN=3,
    UIT_ERROR=5,
    UIT_INFO=4,
    UIT_NONE=0,
    UIT_PROMPT=1,
    UIT_VERIFY=2
} UI_string_types;

typedef struct X509_extension_st X509_extension_st, *PX509_extension_st;

typedef struct X509_extension_st X509_EXTENSION;

struct X509_extension_st {
    ASN1_OBJECT * object;
    ASN1_BOOLEAN critical;
    ASN1_OCTET_STRING * value;
};

typedef struct X509_name_entry_st X509_name_entry_st, *PX509_name_entry_st;

typedef struct X509_name_entry_st X509_NAME_ENTRY;

struct X509_name_entry_st {
    ASN1_OBJECT * object;
    ASN1_STRING * value;
    int set;
    int size;
};

typedef union _union_381 _union_381, *P_union_381;

union _union_381 {
    char * ptr;
    X509 * x509;
    X509_CRL * crl;
    EVP_PKEY * pkey;
};

typedef struct x509_lookup_st x509_lookup_st, *Px509_lookup_st;

typedef struct x509_lookup_st X509_LOOKUP;

typedef struct x509_lookup_method_st x509_lookup_method_st, *Px509_lookup_method_st;

typedef struct x509_object_st x509_object_st, *Px509_object_st;

typedef struct x509_object_st X509_OBJECT;

typedef struct x509_lookup_method_st X509_LOOKUP_METHOD;

struct x509_lookup_method_st {
    char * name;
    int (* new_item)(X509_LOOKUP *);
    void (* free)(X509_LOOKUP *);
    int (* init)(X509_LOOKUP *);
    int (* shutdown)(X509_LOOKUP *);
    int (* ctrl)(X509_LOOKUP *, int, char *, long, char * *);
    int (* get_by_subject)(X509_LOOKUP *, int, X509_NAME *, X509_OBJECT *);
    int (* get_by_issuer_serial)(X509_LOOKUP *, int, X509_NAME *, ASN1_INTEGER *, X509_OBJECT *);
    int (* get_by_fingerprint)(X509_LOOKUP *, int, uchar *, int, X509_OBJECT *);
    int (* get_by_alias)(X509_LOOKUP *, int, char *, int, X509_OBJECT *);
};

struct x509_object_st {
    int type;
    union _union_381 data;
};

struct x509_lookup_st {
    int init;
    int skip;
    X509_LOOKUP_METHOD * method;
    char * method_data;
    X509_STORE * store_ctx;
};

typedef struct BeOnAlertInfo BeOnAlertInfo, *PBeOnAlertInfo;

struct BeOnAlertInfo { /* PlaceHolder Class Structure */
};

typedef struct BeOnAudioPlayback BeOnAudioPlayback, *PBeOnAudioPlayback;

struct BeOnAudioPlayback { /* PlaceHolder Class Structure */
};

typedef struct BeOnBool BeOnBool, *PBeOnBool;

struct BeOnBool { /* PlaceHolder Class Structure */
};

typedef struct BeOnByteBuffer BeOnByteBuffer, *PBeOnByteBuffer;

struct BeOnByteBuffer { /* PlaceHolder Class Structure */
};

typedef struct BeOnCallEvent BeOnCallEvent, *PBeOnCallEvent;

struct BeOnCallEvent { /* PlaceHolder Class Structure */
};

typedef struct BeOnCellDataConnection BeOnCellDataConnection, *PBeOnCellDataConnection;

struct BeOnCellDataConnection { /* PlaceHolder Class Structure */
};

typedef struct BeOnEmergencyEvent BeOnEmergencyEvent, *PBeOnEmergencyEvent;

struct BeOnEmergencyEvent { /* PlaceHolder Class Structure */
};

typedef struct BeOnEvent BeOnEvent, *PBeOnEvent;

struct BeOnEvent { /* PlaceHolder Class Structure */
};

typedef struct BeOnEventDAO BeOnEventDAO, *PBeOnEventDAO;

struct BeOnEventDAO { /* PlaceHolder Class Structure */
};

typedef struct BeOnEventDatabase BeOnEventDatabase, *PBeOnEventDatabase;

struct BeOnEventDatabase { /* PlaceHolder Class Structure */
};

typedef struct BeOnEventManager BeOnEventManager, *PBeOnEventManager;

struct BeOnEventManager { /* PlaceHolder Class Structure */
};

typedef struct BeOnGroup BeOnGroup, *PBeOnGroup;

struct BeOnGroup { /* PlaceHolder Class Structure */
};

typedef struct BeOnGroupId BeOnGroupId, *PBeOnGroupId;

struct BeOnGroupId { /* PlaceHolder Class Structure */
};

typedef struct BeOnGroupInProfile BeOnGroupInProfile, *PBeOnGroupInProfile;

struct BeOnGroupInProfile { /* PlaceHolder Class Structure */
};

typedef struct BeOnInternetDataConnection BeOnInternetDataConnection, *PBeOnInternetDataConnection;

struct BeOnInternetDataConnection { /* PlaceHolder Class Structure */
};

typedef struct BeOnLlak BeOnLlak, *PBeOnLlak;

struct BeOnLlak { /* PlaceHolder Class Structure */
};

typedef struct BeOnLocation BeOnLocation, *PBeOnLocation;

struct BeOnLocation { /* PlaceHolder Class Structure */
};

typedef struct BeOnNetworkKmfKey BeOnNetworkKmfKey, *PBeOnNetworkKmfKey;

struct BeOnNetworkKmfKey { /* PlaceHolder Class Structure */
};

typedef struct BeOnObject BeOnObject, *PBeOnObject;

struct BeOnObject { /* PlaceHolder Class Structure */
};

typedef struct BeOnPresence BeOnPresence, *PBeOnPresence;

struct BeOnPresence { /* PlaceHolder Class Structure */
};

typedef struct BeOnProfile BeOnProfile, *PBeOnProfile;

struct BeOnProfile { /* PlaceHolder Class Structure */
};

typedef struct BeOnPtt BeOnPtt, *PBeOnPtt;

struct BeOnPtt { /* PlaceHolder Class Structure */
};

typedef struct BeOnSlnInfo BeOnSlnInfo, *PBeOnSlnInfo;

struct BeOnSlnInfo { /* PlaceHolder Class Structure */
};

typedef struct BeOnString BeOnString, *PBeOnString;

struct BeOnString { /* PlaceHolder Class Structure */
};

typedef struct BeOnTek BeOnTek, *PBeOnTek;

struct BeOnTek { /* PlaceHolder Class Structure */
};

typedef struct BeOnTextEvent BeOnTextEvent, *PBeOnTextEvent;

struct BeOnTextEvent { /* PlaceHolder Class Structure */
};

typedef struct BeOnTextMessage BeOnTextMessage, *PBeOnTextMessage;

struct BeOnTextMessage { /* PlaceHolder Class Structure */
};

typedef struct BeOnUkek BeOnUkek, *PBeOnUkek;

struct BeOnUkek { /* PlaceHolder Class Structure */
};

typedef struct BeOnUkeksContainer BeOnUkeksContainer, *PBeOnUkeksContainer;

struct BeOnUkeksContainer { /* PlaceHolder Class Structure */
};

typedef struct BeOnUser BeOnUser, *PBeOnUser;

struct BeOnUser { /* PlaceHolder Class Structure */
};

typedef struct BeOnUserEvent BeOnUserEvent, *PBeOnUserEvent;

struct BeOnUserEvent { /* PlaceHolder Class Structure */
};

typedef struct BeOnUserId BeOnUserId, *PBeOnUserId;

struct BeOnUserId { /* PlaceHolder Class Structure */
};

typedef struct IBeOnTimerProvider IBeOnTimerProvider, *PIBeOnTimerProvider;

struct IBeOnTimerProvider { /* PlaceHolder Class Structure */
};

typedef struct JavaAudioPlaybackProvider JavaAudioPlaybackProvider, *PJavaAudioPlaybackProvider;

struct JavaAudioPlaybackProvider { /* PlaceHolder Class Structure */
};

typedef struct JavaAudioProvider JavaAudioProvider, *PJavaAudioProvider;

struct JavaAudioProvider { /* PlaceHolder Class Structure */
};

typedef struct JavaDataConnectionProvider JavaDataConnectionProvider, *PJavaDataConnectionProvider;

struct JavaDataConnectionProvider { /* PlaceHolder Class Structure */
};

typedef struct JavaEventListener JavaEventListener, *PJavaEventListener;

struct JavaEventListener { /* PlaceHolder Class Structure */
};

typedef struct JavaLogger JavaLogger, *PJavaLogger;

struct JavaLogger { /* PlaceHolder Class Structure */
};

typedef struct JavaQueryResultListener JavaQueryResultListener, *PJavaQueryResultListener;

struct JavaQueryResultListener { /* PlaceHolder Class Structure */
};

typedef struct JavaSubscriptionManagerEventListener JavaSubscriptionManagerEventListener, *PJavaSubscriptionManagerEventListener;

struct JavaSubscriptionManagerEventListener { /* PlaceHolder Class Structure */
};

typedef struct JniEncryptionProvider JniEncryptionProvider, *PJniEncryptionProvider;

struct JniEncryptionProvider { /* PlaceHolder Class Structure */
};

typedef struct Json Json, *PJson;

struct Json { /* PlaceHolder Class Structure */
};

typedef struct OrderedBeOnGroupMembershipUpdates OrderedBeOnGroupMembershipUpdates, *POrderedBeOnGroupMembershipUpdates;

struct OrderedBeOnGroupMembershipUpdates { /* PlaceHolder Class Structure */
};

typedef struct Preferences Preferences, *PPreferences;

struct Preferences { /* PlaceHolder Class Structure */
};

typedef unsigned short    wchar16;
