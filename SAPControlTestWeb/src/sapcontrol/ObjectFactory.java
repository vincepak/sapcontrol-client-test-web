
package sapcontrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sapcontrol package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListLogFilesResponseElementFile_QNAME = new QName("", "file");
    private final static QName _SnapshotInfoTypeDescription_QNAME = new QName("", "description");
    private final static QName _SnapshotInfoTypeModtime_QNAME = new QName("", "modtime");
    private final static QName _SnapshotInfoTypeFilename_QNAME = new QName("", "filename");
    private final static QName _StartSystemElementPrioritylevel_QNAME = new QName("", "prioritylevel");
    private final static QName _StartSystemElementRunlevel_QNAME = new QName("", "runlevel");
    private final static QName _J2EEGetVMGCHistoryResponseElementGc_QNAME = new QName("", "gc");
    private final static QName _J2EESharedTableInfoTypeTable_QNAME = new QName("", "table");
    private final static QName _GetSecNetworkIdResponseElementProof_QNAME = new QName("", "proof");
    private final static QName _GetSecNetworkIdResponseElementKey_QNAME = new QName("", "key");
    private final static QName _CreateSnapshotElementAnalyseEndtime_QNAME = new QName("", "analyse-endtime");
    private final static QName _CreateSnapshotElementAnalyseStarttime_QNAME = new QName("", "analyse-starttime");
    private final static QName _CreateSnapshotElementDatcolParam_QNAME = new QName("", "datcol-param");
    private final static QName _GetAlertTreeResponseElementTree_QNAME = new QName("", "tree");
    private final static QName _J2EEProcess2TypeStartTime_QNAME = new QName("", "startTime");
    private final static QName _J2EEProcess2TypeRestart_QNAME = new QName("", "restart");
    private final static QName _J2EEProcess2TypeName_QNAME = new QName("", "name");
    private final static QName _J2EEProcess2TypeCpu_QNAME = new QName("", "cpu");
    private final static QName _J2EEProcess2TypeExitCode_QNAME = new QName("", "exitCode");
    private final static QName _J2EEProcess2TypeDebug_QNAME = new QName("", "debug");
    private final static QName _J2EEProcess2TypeType_QNAME = new QName("", "type");
    private final static QName _J2EEProcess2TypeElapsedTime_QNAME = new QName("", "elapsedTime");
    private final static QName _J2EEProcess2TypeStatetext_QNAME = new QName("", "statetext");
    private final static QName _HeapInfoTypeProcessname_QNAME = new QName("", "processname");
    private final static QName _J2EEGetProcessList2ResponseElementProcess_QNAME = new QName("", "process");
    private final static QName _SetProfileParameterTypeValues_QNAME = new QName("", "values");
    private final static QName _SetProfileParameterTypeValue_QNAME = new QName("", "value");
    private final static QName _GetVersionInfoResponseElementVersion_QNAME = new QName("", "version");
    private final static QName _ReadLogFileElementLanguage_QNAME = new QName("", "language");
    private final static QName _ReadLogFileElementFilter_QNAME = new QName("", "filter");
    private final static QName _ReadLogFileElementStatecookie_QNAME = new QName("", "statecookie");
    private final static QName _InstancePropertyTypeProperty_QNAME = new QName("", "property");
    private final static QName _InstancePropertyTypePropertytype_QNAME = new QName("", "propertytype");
    private final static QName _GetAlertsElementRootTid_QNAME = new QName("", "RootTid");
    private final static QName _SAPInstanceTypeStartPriority_QNAME = new QName("", "startPriority");
    private final static QName _SAPInstanceTypeFeatures_QNAME = new QName("", "features");
    private final static QName _SAPInstanceTypeHostname_QNAME = new QName("", "hostname");
    private final static QName _ABAPAcknowledgeAlertsResponseElementAlert_QNAME = new QName("", "alert");
    private final static QName _SubProfileParameterTypeUnit_QNAME = new QName("", "unit");
    private final static QName _J2EEGetClusterMsgListResponseElementMsg_QNAME = new QName("", "msg");
    private final static QName _J2EEGetWebSessionList2ResponseElementSession_QNAME = new QName("", "session");
    private final static QName _GCInfo2TypeReason_QNAME = new QName("", "reason");
    private final static QName _EnqLockTypeLockMode_QNAME = new QName("", "lock-mode");
    private final static QName _EnqLockTypeLockName_QNAME = new QName("", "lock-name");
    private final static QName _EnqLockTypeClient_QNAME = new QName("", "client");
    private final static QName _EnqLockTypeTransaction_QNAME = new QName("", "transaction");
    private final static QName _EnqLockTypeOwner_QNAME = new QName("", "owner");
    private final static QName _EnqLockTypeOwnerVb_QNAME = new QName("", "owner-vb");
    private final static QName _EnqLockTypeObject_QNAME = new QName("", "object");
    private final static QName _EnqLockTypeUser_QNAME = new QName("", "user");
    private final static QName _EnqLockTypeLockArg_QNAME = new QName("", "lock-arg");
    private final static QName _GetQueueStatisticResponseElementQueue_QNAME = new QName("", "queue");
    private final static QName _EnqRemoveLocksElementLock_QNAME = new QName("", "lock");
    private final static QName _J2EEControlClusterElementHost_QNAME = new QName("", "host");
    private final static QName _GetAccessPointListResponseElementAccesspoint_QNAME = new QName("", "accesspoint");
    private final static QName _ProfileParameterTypeDynamicValues_QNAME = new QName("", "dynamic-values");
    private final static QName _ProfileParameterTypeDynamicValue_QNAME = new QName("", "dynamic-value");
    private final static QName _ProfileParameterTypeSubPara_QNAME = new QName("", "sub-para");
    private final static QName _ProfileParameterTypeGroup_QNAME = new QName("", "group");
    private final static QName _J2EEGetRemoteObjectListResponseElementRemoteobject_QNAME = new QName("", "remoteobject");
    private final static QName _J2EEThreadTypeSubtask_QNAME = new QName("", "subtask");
    private final static QName _J2EEThreadTypeSubtaskupdateTime_QNAME = new QName("", "subtaskupdateTime");
    private final static QName _J2EEThreadTypePool_QNAME = new QName("", "pool");
    private final static QName _J2EEThreadTypeUpdateTime_QNAME = new QName("", "updateTime");
    private final static QName _J2EEThreadTypeTask_QNAME = new QName("", "task");
    private final static QName _J2EEThreadTypeClassname_QNAME = new QName("", "classname");
    private final static QName _J2EEThreadTypeState_QNAME = new QName("", "state");
    private final static QName _J2EEThreadTypeTaskupdateTime_QNAME = new QName("", "taskupdateTime");
    private final static QName _GetProcessParameterResponseElementParameter_QNAME = new QName("", "parameter");
    private final static QName _ABAPReadRawSyslogResponseElementLog_QNAME = new QName("", "log");
    private final static QName _J2EEApplicationAliasTypeAppActive_QNAME = new QName("", "AppActive");
    private final static QName _J2EEApplicationAliasTypeAlias_QNAME = new QName("", "Alias");
    private final static QName _J2EEApplicationAliasTypeAppName_QNAME = new QName("", "AppName");
    private final static QName _J2EEApplicationAliasTypeIgnoreCookie_QNAME = new QName("", "IgnoreCookie");
    private final static QName _J2EEGetSharedTableInfoResponseElementJsf_QNAME = new QName("", "jsf");
    private final static QName _J2EEEJBSessionTypeEjb_QNAME = new QName("", "ejb");
    private final static QName _J2EEEJBSessionTypeApplication_QNAME = new QName("", "application");
    private final static QName _J2EEEJBSessionTypeBackingStore_QNAME = new QName("", "backingStore");
    private final static QName _J2EEEJBSessionTypeReference_QNAME = new QName("", "reference");
    private final static QName _J2EEControlComponentsElementOperation_QNAME = new QName("", "operation");
    private final static QName _J2EEControlComponentsElementProcessName_QNAME = new QName("", "processName");
    private final static QName _J2EEControlComponentsElementComponentNames_QNAME = new QName("", "componentNames");
    private final static QName _J2EEControlComponentsElementComponentType_QNAME = new QName("", "componentType");
    private final static QName _J2EEGetComponentListResponseElementComponent_QNAME = new QName("", "component");
    private final static QName _J2EESessionTypeSticky_QNAME = new QName("", "sticky");
    private final static QName _J2EESessionTypeCorrupt_QNAME = new QName("", "corrupt");
    private final static QName _ReadLogFileResponseElementEndcookie_QNAME = new QName("", "endcookie");
    private final static QName _ReadLogFileResponseElementFormat_QNAME = new QName("", "format");
    private final static QName _ReadLogFileResponseElementStartcookie_QNAME = new QName("", "startcookie");
    private final static QName _J2EEGetApplicationAliasListResponseElementAlias_QNAME = new QName("", "alias");
    private final static QName _J2EEGetVMHeapInfoResponseElementHeap_QNAME = new QName("", "heap");
    private final static QName _ICMCacheEntryTypeCacheurl_QNAME = new QName("", "cacheurl");
    private final static QName _ICMCacheEntryTypeCache_QNAME = new QName("", "cache");
    private final static QName _ICMCacheEntryTypeExpirationTime_QNAME = new QName("", "expiration-time");
    private final static QName _ICMCacheEntryTypeLastAccessTime_QNAME = new QName("", "last-access-time");
    private final static QName _ICMCacheEntryTypeCreationTime_QNAME = new QName("", "creation-time");
    private final static QName _J2EECacheTypeCachename_QNAME = new QName("", "cachename");
    private final static QName _OSProcessTypeStarttime_QNAME = new QName("", "starttime");
    private final static QName _OSProcessTypeElapsedtime_QNAME = new QName("", "elapsedtime");
    private final static QName _OSProcessTypeTextstatus_QNAME = new QName("", "textstatus");
    private final static QName _ICMThreadTypeId_QNAME = new QName("", "id");
    private final static QName _ICMThreadTypeStatus_QNAME = new QName("", "status");
    private final static QName _ICMThreadTypeRequesttype_QNAME = new QName("", "requesttype");
    private final static QName _ICMGetConnectionListResponseElementConnection_QNAME = new QName("", "connection");
    private final static QName _AlertTypeDescription_QNAME = new QName("", "Description");
    private final static QName _AlertTypeTime_QNAME = new QName("", "Time");
    private final static QName _AlertTypeAttribute_QNAME = new QName("", "Attribute");
    private final static QName _AlertTypeTid_QNAME = new QName("", "Tid");
    private final static QName _AlertTypeAid_QNAME = new QName("", "Aid");
    private final static QName _AlertTypeObject_QNAME = new QName("", "Object");
    private final static QName _ParameterRestrictionTypeIntMax_QNAME = new QName("", "int-max");
    private final static QName _ParameterRestrictionTypeFloatMax_QNAME = new QName("", "float-max");
    private final static QName _ParameterRestrictionTypeFloatMin_QNAME = new QName("", "float-min");
    private final static QName _ParameterRestrictionTypeValuemap_QNAME = new QName("", "valuemap");
    private final static QName _ParameterRestrictionTypeIntMin_QNAME = new QName("", "int-min");
    private final static QName _GetLogFileListResponseElementLogfiles_QNAME = new QName("", "logfiles");
    private final static QName _J2EEComponentInfoTypeDetails_QNAME = new QName("", "details");
    private final static QName _J2EEComponentInfoTypeExpectedstatus_QNAME = new QName("", "expectedstatus");
    private final static QName _J2EEComponentInfoTypeStartupmode_QNAME = new QName("", "startupmode");
    private final static QName _J2EEGetThreadListResponseElementThread_QNAME = new QName("", "thread");
    private final static QName _HAGetFailoverConfigResponseElementHASAPInterfaceVersion_QNAME = new QName("", "HASAPInterfaceVersion");
    private final static QName _HAGetFailoverConfigResponseElementHAActiveNode_QNAME = new QName("", "HAActiveNode");
    private final static QName _HAGetFailoverConfigResponseElementHAProductVersion_QNAME = new QName("", "HAProductVersion");
    private final static QName _HAGetFailoverConfigResponseElementHADocumentation_QNAME = new QName("", "HADocumentation");
    private final static QName _DeleteSnapshotsElementSnapshots_QNAME = new QName("", "snapshots");
    private final static QName _HACheckTypeComment_QNAME = new QName("", "comment");
    private final static QName _J2EEClusterMsgTypeService_QNAME = new QName("", "service");
    private final static QName _ABAPGetWPTableResponseElementWorkprocess_QNAME = new QName("", "workprocess");
    private final static QName _HACheckFailoverConfigResponseElementCheck_QNAME = new QName("", "check");
    private final static QName _ICMProxyConnectionTypeFailoverStatus_QNAME = new QName("", "failover-status");
    private final static QName _ICMProxyConnectionTypeExternalConvid_QNAME = new QName("", "external-convid");
    private final static QName _ICMProxyConnectionTypeLocalAddress_QNAME = new QName("", "local-address");
    private final static QName _ICMProxyConnectionTypeConid_QNAME = new QName("", "conid");
    private final static QName _ICMProxyConnectionTypeTidUidMode_QNAME = new QName("", "tid-uid-mode");
    private final static QName _ICMProxyConnectionTypePeerAddress_QNAME = new QName("", "peer-address");
    private final static QName _ICMProxyConnectionTypeDisconnectTime_QNAME = new QName("", "disconnect-time");
    private final static QName _ICMProxyConnectionTypeRole_QNAME = new QName("", "role");
    private final static QName _ICMProxyConnectionTypeSncContextLength_QNAME = new QName("", "snc-context-length");
    private final static QName _ICMProxyConnectionTypePartner_QNAME = new QName("", "partner");
    private final static QName _ICMProxyConnectionTypeObjectid_QNAME = new QName("", "objectid");
    private final static QName _ICMProxyConnectionTypeInternalConvid_QNAME = new QName("", "internal-convid");
    private final static QName _SyslogEntryTypeUser_QNAME = new QName("", "User");
    private final static QName _SyslogEntryTypeText_QNAME = new QName("", "Text");
    private final static QName _SyslogEntryTypeTcode_QNAME = new QName("", "Tcode");
    private final static QName _SyslogEntryTypeMNo_QNAME = new QName("", "MNo");
    private final static QName _SyslogEntryTypeTyp_QNAME = new QName("", "Typ");
    private final static QName _SyslogEntryTypeClient_QNAME = new QName("", "Client");
    private final static QName _GetInstancePropertiesResponseElementProperties_QNAME = new QName("", "properties");
    private final static QName _GetEnvironmentResponseElementEnv_QNAME = new QName("", "env");
    private final static QName _AlertNodeTypeAlTime_QNAME = new QName("", "AlTime");
    private final static QName _AlertNodeTypeAnalyseTool_QNAME = new QName("", "AnalyseTool");
    private final static QName _AlertNodeTypeAlDescription_QNAME = new QName("", "AlDescription");
    private final static QName _GetProcessParameterElementProcesstype_QNAME = new QName("", "processtype");
    private final static QName _J2EEEnableDbgSessionElementFlags_QNAME = new QName("", "flags");
    private final static QName _InstanceVersionInfoTypeVersionInfo_QNAME = new QName("", "VersionInfo");
    private final static QName _InstanceVersionInfoTypeFilename_QNAME = new QName("", "Filename");
    private final static QName _ICMConnectionTypeProtocol_QNAME = new QName("", "protocol");
    private final static QName _ICMConnectionTypeConnectionTime_QNAME = new QName("", "connection-time");
    private final static QName _AnalyseLogFilesElementEndtime_QNAME = new QName("", "endtime");
    private final static QName _WebDispGetServerListResponseElementServer_QNAME = new QName("", "server");
    private final static QName _ICMGetCacheEntriesResponseElementEntry_QNAME = new QName("", "entry");
    private final static QName _AccessPointTypeAddress_QNAME = new QName("", "address");
    private final static QName _AccessPointTypeActive_QNAME = new QName("", "active");
    private final static QName _J2EEGetEJBSessionListResponseElementEjbsession_QNAME = new QName("", "ejbsession");
    private final static QName _WorkProcessTypeErr_QNAME = new QName("", "Err");
    private final static QName _WorkProcessTypeStart_QNAME = new QName("", "Start");
    private final static QName _WorkProcessTypeSem_QNAME = new QName("", "Sem");
    private final static QName _WorkProcessTypeTable_QNAME = new QName("", "Table");
    private final static QName _WorkProcessTypeStatus_QNAME = new QName("", "Status");
    private final static QName _WorkProcessTypeCpu_QNAME = new QName("", "Cpu");
    private final static QName _WorkProcessTypeAction_QNAME = new QName("", "Action");
    private final static QName _WorkProcessTypeProgram_QNAME = new QName("", "Program");
    private final static QName _WorkProcessTypeReason_QNAME = new QName("", "Reason");
    private final static QName _GetSecNetworkIdElementChallenge_QNAME = new QName("", "challenge");
    private final static QName _OSExecuteElementProtocolfile_QNAME = new QName("", "protocolfile");
    private final static QName _GetAlertsResponseElementRootTidName_QNAME = new QName("", "RootTidName");
    private final static QName _J2EERemoteObjectTypeDirection_QNAME = new QName("", "direction");
    private final static QName _J2EERemoteObjectTypeCreationTime_QNAME = new QName("", "creationTime");
    private final static QName _SystemWorkProcessTypeInstance_QNAME = new QName("", "Instance");
    private final static QName _ReadSnapshotResponseElementSnapshot_QNAME = new QName("", "snapshot");
    private final static QName _GetSystemInstanceListResponseElementInstance_QNAME = new QName("", "instance");
    private final static QName _WebDispServerTypeSid_QNAME = new QName("", "sid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sapcontrol
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link J2EEGetVMGCHistory2Element }
     * 
     */
    public J2EEGetVMGCHistory2Element createJ2EEGetVMGCHistory2Element() {
        return new J2EEGetVMGCHistory2Element();
    }

    /**
     * Create an instance of {@link StopBypassHAResponseElement }
     * 
     */
    public StopBypassHAResponseElement createStopBypassHAResponseElement() {
        return new StopBypassHAResponseElement();
    }

    /**
     * Create an instance of {@link StopBypassHAElement }
     * 
     */
    public StopBypassHAElement createStopBypassHAElement() {
        return new StopBypassHAElement();
    }

    /**
     * Create an instance of {@link GetTraceFileElement }
     * 
     */
    public GetTraceFileElement createGetTraceFileElement() {
        return new GetTraceFileElement();
    }

    /**
     * Create an instance of {@link DeleteSnapshotsResponseElement }
     * 
     */
    public DeleteSnapshotsResponseElement createDeleteSnapshotsResponseElement() {
        return new DeleteSnapshotsResponseElement();
    }

    /**
     * Create an instance of {@link J2EEControlClusterResponseElement }
     * 
     */
    public J2EEControlClusterResponseElement createJ2EEControlClusterResponseElement() {
        return new J2EEControlClusterResponseElement();
    }

    /**
     * Create an instance of {@link GetStartProfileResponseElement }
     * 
     */
    public GetStartProfileResponseElement createGetStartProfileResponseElement() {
        return new GetStartProfileResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfStringType }
     * 
     */
    public ArrayOfStringType createArrayOfStringType() {
        return new ArrayOfStringType();
    }

    /**
     * Create an instance of {@link GetCallstackElement }
     * 
     */
    public GetCallstackElement createGetCallstackElement() {
        return new GetCallstackElement();
    }

    /**
     * Create an instance of {@link GetStartProfileElement }
     * 
     */
    public GetStartProfileElement createGetStartProfileElement() {
        return new GetStartProfileElement();
    }

    /**
     * Create an instance of {@link GetAlertsResponseElement }
     * 
     */
    public GetAlertsResponseElement createGetAlertsResponseElement() {
        return new GetAlertsResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfAlertType }
     * 
     */
    public ArrayOfAlertType createArrayOfAlertType() {
        return new ArrayOfAlertType();
    }

    /**
     * Create an instance of {@link AccessCheckResponseElement }
     * 
     */
    public AccessCheckResponseElement createAccessCheckResponseElement() {
        return new AccessCheckResponseElement();
    }

    /**
     * Create an instance of {@link ABAPReadRawSyslogElement }
     * 
     */
    public ABAPReadRawSyslogElement createABAPReadRawSyslogElement() {
        return new ABAPReadRawSyslogElement();
    }

    /**
     * Create an instance of {@link ICMGetProxyConnectionListResponseElement }
     * 
     */
    public ICMGetProxyConnectionListResponseElement createICMGetProxyConnectionListResponseElement() {
        return new ICMGetProxyConnectionListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfICMProxyConnectionType }
     * 
     */
    public ArrayOfICMProxyConnectionType createArrayOfICMProxyConnectionType() {
        return new ArrayOfICMProxyConnectionType();
    }

    /**
     * Create an instance of {@link ICMGetCacheEntriesResponseElement }
     * 
     */
    public ICMGetCacheEntriesResponseElement createICMGetCacheEntriesResponseElement() {
        return new ICMGetCacheEntriesResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfICMCacheEntryType }
     * 
     */
    public ArrayOfICMCacheEntryType createArrayOfICMCacheEntryType() {
        return new ArrayOfICMCacheEntryType();
    }

    /**
     * Create an instance of {@link InstanceStartElement }
     * 
     */
    public InstanceStartElement createInstanceStartElement() {
        return new InstanceStartElement();
    }

    /**
     * Create an instance of {@link J2EEGetThreadTaskStackResponseElement }
     * 
     */
    public J2EEGetThreadTaskStackResponseElement createJ2EEGetThreadTaskStackResponseElement() {
        return new J2EEGetThreadTaskStackResponseElement();
    }

    /**
     * Create an instance of {@link EnqStatisticElement }
     * 
     */
    public EnqStatisticElement createEnqStatisticElement() {
        return new EnqStatisticElement();
    }

    /**
     * Create an instance of {@link StartBypassHAElement }
     * 
     */
    public StartBypassHAElement createStartBypassHAElement() {
        return new StartBypassHAElement();
    }

    /**
     * Create an instance of {@link ListLogFilesResponseElement }
     * 
     */
    public ListLogFilesResponseElement createListLogFilesResponseElement() {
        return new ListLogFilesResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfLogFileType }
     * 
     */
    public ArrayOfLogFileType createArrayOfLogFileType() {
        return new ArrayOfLogFileType();
    }

    /**
     * Create an instance of {@link InstanceStopElement }
     * 
     */
    public InstanceStopElement createInstanceStopElement() {
        return new InstanceStopElement();
    }

    /**
     * Create an instance of {@link ShmDetachResponseElement }
     * 
     */
    public ShmDetachResponseElement createShmDetachResponseElement() {
        return new ShmDetachResponseElement();
    }

    /**
     * Create an instance of {@link HAFailoverToNodeResponseElement }
     * 
     */
    public HAFailoverToNodeResponseElement createHAFailoverToNodeResponseElement() {
        return new HAFailoverToNodeResponseElement();
    }

    /**
     * Create an instance of {@link GetNetworkIdElement }
     * 
     */
    public GetNetworkIdElement createGetNetworkIdElement() {
        return new GetNetworkIdElement();
    }

    /**
     * Create an instance of {@link RestartServiceElement }
     * 
     */
    public RestartServiceElement createRestartServiceElement() {
        return new RestartServiceElement();
    }

    /**
     * Create an instance of {@link GetVersionInfoResponseElement }
     * 
     */
    public GetVersionInfoResponseElement createGetVersionInfoResponseElement() {
        return new GetVersionInfoResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfInstanceVersionInfoType }
     * 
     */
    public ArrayOfInstanceVersionInfoType createArrayOfInstanceVersionInfoType() {
        return new ArrayOfInstanceVersionInfoType();
    }

    /**
     * Create an instance of {@link J2EEGetRemoteObjectListElement }
     * 
     */
    public J2EEGetRemoteObjectListElement createJ2EEGetRemoteObjectListElement() {
        return new J2EEGetRemoteObjectListElement();
    }

    /**
     * Create an instance of {@link J2EEGetSessionListResponseElement }
     * 
     */
    public J2EEGetSessionListResponseElement createJ2EEGetSessionListResponseElement() {
        return new J2EEGetSessionListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EESessionType }
     * 
     */
    public ArrayOfJ2EESessionType createArrayOfJ2EESessionType() {
        return new ArrayOfJ2EESessionType();
    }

    /**
     * Create an instance of {@link HACheckConfigResponseElement }
     * 
     */
    public HACheckConfigResponseElement createHACheckConfigResponseElement() {
        return new HACheckConfigResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfHACheckType }
     * 
     */
    public ArrayOfHACheckType createArrayOfHACheckType() {
        return new ArrayOfHACheckType();
    }

    /**
     * Create an instance of {@link ReadDeveloperTraceResponseElement }
     * 
     */
    public ReadDeveloperTraceResponseElement createReadDeveloperTraceResponseElement() {
        return new ReadDeveloperTraceResponseElement();
    }

    /**
     * Create an instance of {@link GetProcessParameterResponseElement }
     * 
     */
    public GetProcessParameterResponseElement createGetProcessParameterResponseElement() {
        return new GetProcessParameterResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfProfileParameterType }
     * 
     */
    public ArrayOfProfileParameterType createArrayOfProfileParameterType() {
        return new ArrayOfProfileParameterType();
    }

    /**
     * Create an instance of {@link J2EEGetProcessListElement }
     * 
     */
    public J2EEGetProcessListElement createJ2EEGetProcessListElement() {
        return new J2EEGetProcessListElement();
    }

    /**
     * Create an instance of {@link J2EEGetProcessListResponseElement }
     * 
     */
    public J2EEGetProcessListResponseElement createJ2EEGetProcessListResponseElement() {
        return new J2EEGetProcessListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EEProcessType }
     * 
     */
    public ArrayOfJ2EEProcessType createArrayOfJ2EEProcessType() {
        return new ArrayOfJ2EEProcessType();
    }

    /**
     * Create an instance of {@link J2EEControlComponentsResponseElement }
     * 
     */
    public J2EEControlComponentsResponseElement createJ2EEControlComponentsResponseElement() {
        return new J2EEControlComponentsResponseElement();
    }

    /**
     * Create an instance of {@link ABAPReadSyslogElement }
     * 
     */
    public ABAPReadSyslogElement createABAPReadSyslogElement() {
        return new ABAPReadSyslogElement();
    }

    /**
     * Create an instance of {@link RestartInstanceResponseElement }
     * 
     */
    public RestartInstanceResponseElement createRestartInstanceResponseElement() {
        return new RestartInstanceResponseElement();
    }

    /**
     * Create an instance of {@link ListDeveloperTracesResponseElement }
     * 
     */
    public ListDeveloperTracesResponseElement createListDeveloperTracesResponseElement() {
        return new ListDeveloperTracesResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfDirEntryType }
     * 
     */
    public ArrayOfDirEntryType createArrayOfDirEntryType() {
        return new ArrayOfDirEntryType();
    }

    /**
     * Create an instance of {@link SendTicketElement }
     * 
     */
    public SendTicketElement createSendTicketElement() {
        return new SendTicketElement();
    }

    /**
     * Create an instance of {@link GetVersionInfoElement }
     * 
     */
    public GetVersionInfoElement createGetVersionInfoElement() {
        return new GetVersionInfoElement();
    }

    /**
     * Create an instance of {@link ABAPAcknowledgeAlertsResponseElement }
     * 
     */
    public ABAPAcknowledgeAlertsResponseElement createABAPAcknowledgeAlertsResponseElement() {
        return new ABAPAcknowledgeAlertsResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfIntType }
     * 
     */
    public ArrayOfIntType createArrayOfIntType() {
        return new ArrayOfIntType();
    }

    /**
     * Create an instance of {@link GetSecNetworkIdElement }
     * 
     */
    public GetSecNetworkIdElement createGetSecNetworkIdElement() {
        return new GetSecNetworkIdElement();
    }

    /**
     * Create an instance of {@link ABAPReadRawSyslogResponseElement }
     * 
     */
    public ABAPReadRawSyslogResponseElement createABAPReadRawSyslogResponseElement() {
        return new ABAPReadRawSyslogResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfRawSyslogEntryType }
     * 
     */
    public ArrayOfRawSyslogEntryType createArrayOfRawSyslogEntryType() {
        return new ArrayOfRawSyslogEntryType();
    }

    /**
     * Create an instance of {@link J2EEGetEJBSessionListResponseElement }
     * 
     */
    public J2EEGetEJBSessionListResponseElement createJ2EEGetEJBSessionListResponseElement() {
        return new J2EEGetEJBSessionListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EEEJBSessionType }
     * 
     */
    public ArrayOfJ2EEEJBSessionType createArrayOfJ2EEEJBSessionType() {
        return new ArrayOfJ2EEEJBSessionType();
    }

    /**
     * Create an instance of {@link ABAPGetSystemWPTableResponseElement }
     * 
     */
    public ABAPGetSystemWPTableResponseElement createABAPGetSystemWPTableResponseElement() {
        return new ABAPGetSystemWPTableResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfSystemWorkProcessType }
     * 
     */
    public ArrayOfSystemWorkProcessType createArrayOfSystemWorkProcessType() {
        return new ArrayOfSystemWorkProcessType();
    }

    /**
     * Create an instance of {@link GetProcessListElement }
     * 
     */
    public GetProcessListElement createGetProcessListElement() {
        return new GetProcessListElement();
    }

    /**
     * Create an instance of {@link EnqRemoveLocksResponseElement }
     * 
     */
    public EnqRemoveLocksResponseElement createEnqRemoveLocksResponseElement() {
        return new EnqRemoveLocksResponseElement();
    }

    /**
     * Create an instance of {@link GetEnvironmentElement }
     * 
     */
    public GetEnvironmentElement createGetEnvironmentElement() {
        return new GetEnvironmentElement();
    }

    /**
     * Create an instance of {@link InstanceStopResponseElement }
     * 
     */
    public InstanceStopResponseElement createInstanceStopResponseElement() {
        return new InstanceStopResponseElement();
    }

    /**
     * Create an instance of {@link ReadSnapshotResponseElement }
     * 
     */
    public ReadSnapshotResponseElement createReadSnapshotResponseElement() {
        return new ReadSnapshotResponseElement();
    }

    /**
     * Create an instance of {@link J2EEGetSharedTableInfoResponseElement }
     * 
     */
    public J2EEGetSharedTableInfoResponseElement createJ2EEGetSharedTableInfoResponseElement() {
        return new J2EEGetSharedTableInfoResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EESharedTableInfoType }
     * 
     */
    public ArrayOfJ2EESharedTableInfoType createArrayOfJ2EESharedTableInfoType() {
        return new ArrayOfJ2EESharedTableInfoType();
    }

    /**
     * Create an instance of {@link RestartSystemElement }
     * 
     */
    public RestartSystemElement createRestartSystemElement() {
        return new RestartSystemElement();
    }

    /**
     * Create an instance of {@link AccessCheckElement }
     * 
     */
    public AccessCheckElement createAccessCheckElement() {
        return new AccessCheckElement();
    }

    /**
     * Create an instance of {@link StopElement }
     * 
     */
    public StopElement createStopElement() {
        return new StopElement();
    }

    /**
     * Create an instance of {@link WebDispGetServerListResponseElement }
     * 
     */
    public WebDispGetServerListResponseElement createWebDispGetServerListResponseElement() {
        return new WebDispGetServerListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfWebDispServerType }
     * 
     */
    public ArrayOfWebDispServerType createArrayOfWebDispServerType() {
        return new ArrayOfWebDispServerType();
    }

    /**
     * Create an instance of {@link J2EEEnableDbgSessionElement }
     * 
     */
    public J2EEEnableDbgSessionElement createJ2EEEnableDbgSessionElement() {
        return new J2EEEnableDbgSessionElement();
    }

    /**
     * Create an instance of {@link J2EEControlClusterElement }
     * 
     */
    public J2EEControlClusterElement createJ2EEControlClusterElement() {
        return new J2EEControlClusterElement();
    }

    /**
     * Create an instance of {@link J2EEGetVMGCHistoryElement }
     * 
     */
    public J2EEGetVMGCHistoryElement createJ2EEGetVMGCHistoryElement() {
        return new J2EEGetVMGCHistoryElement();
    }

    /**
     * Create an instance of {@link HACheckConfigElement }
     * 
     */
    public HACheckConfigElement createHACheckConfigElement() {
        return new HACheckConfigElement();
    }

    /**
     * Create an instance of {@link J2EEGetSessionListElement }
     * 
     */
    public J2EEGetSessionListElement createJ2EEGetSessionListElement() {
        return new J2EEGetSessionListElement();
    }

    /**
     * Create an instance of {@link J2EEGetComponentListResponseElement }
     * 
     */
    public J2EEGetComponentListResponseElement createJ2EEGetComponentListResponseElement() {
        return new J2EEGetComponentListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EEComponentInfoType }
     * 
     */
    public ArrayOfJ2EEComponentInfoType createArrayOfJ2EEComponentInfoType() {
        return new ArrayOfJ2EEComponentInfoType();
    }

    /**
     * Create an instance of {@link J2EEGetClusterMsgListElement }
     * 
     */
    public J2EEGetClusterMsgListElement createJ2EEGetClusterMsgListElement() {
        return new J2EEGetClusterMsgListElement();
    }

    /**
     * Create an instance of {@link SendTicketResponseElement }
     * 
     */
    public SendTicketResponseElement createSendTicketResponseElement() {
        return new SendTicketResponseElement();
    }

    /**
     * Create an instance of {@link ABAPGetWPTableResponseElement }
     * 
     */
    public ABAPGetWPTableResponseElement createABAPGetWPTableResponseElement() {
        return new ABAPGetWPTableResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfWorkProcessType }
     * 
     */
    public ArrayOfWorkProcessType createArrayOfWorkProcessType() {
        return new ArrayOfWorkProcessType();
    }

    /**
     * Create an instance of {@link J2EEGetClusterMsgListResponseElement }
     * 
     */
    public J2EEGetClusterMsgListResponseElement createJ2EEGetClusterMsgListResponseElement() {
        return new J2EEGetClusterMsgListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EEClusterMsgType }
     * 
     */
    public ArrayOfJ2EEClusterMsgType createArrayOfJ2EEClusterMsgType() {
        return new ArrayOfJ2EEClusterMsgType();
    }

    /**
     * Create an instance of {@link StopServiceElement }
     * 
     */
    public StopServiceElement createStopServiceElement() {
        return new StopServiceElement();
    }

    /**
     * Create an instance of {@link GetSystemInstanceListElement }
     * 
     */
    public GetSystemInstanceListElement createGetSystemInstanceListElement() {
        return new GetSystemInstanceListElement();
    }

    /**
     * Create an instance of {@link J2EEGetApplicationAliasListResponseElement }
     * 
     */
    public J2EEGetApplicationAliasListResponseElement createJ2EEGetApplicationAliasListResponseElement() {
        return new J2EEGetApplicationAliasListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EEApplicationAliasType }
     * 
     */
    public ArrayOfJ2EEApplicationAliasType createArrayOfJ2EEApplicationAliasType() {
        return new ArrayOfJ2EEApplicationAliasType();
    }

    /**
     * Create an instance of {@link ListSnapshotsResponseElement }
     * 
     */
    public ListSnapshotsResponseElement createListSnapshotsResponseElement() {
        return new ListSnapshotsResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfSnapshotInfoType }
     * 
     */
    public ArrayOfSnapshotInfoType createArrayOfSnapshotInfoType() {
        return new ArrayOfSnapshotInfoType();
    }

    /**
     * Create an instance of {@link J2EEGetVMGCHistoryResponseElement }
     * 
     */
    public J2EEGetVMGCHistoryResponseElement createJ2EEGetVMGCHistoryResponseElement() {
        return new J2EEGetVMGCHistoryResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfGCInfoType }
     * 
     */
    public ArrayOfGCInfoType createArrayOfGCInfoType() {
        return new ArrayOfGCInfoType();
    }

    /**
     * Create an instance of {@link J2EEGetCacheStatistic2ResponseElement }
     * 
     */
    public J2EEGetCacheStatistic2ResponseElement createJ2EEGetCacheStatistic2ResponseElement() {
        return new J2EEGetCacheStatistic2ResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EECache2Type }
     * 
     */
    public ArrayOfJ2EECache2Type createArrayOfJ2EECache2Type() {
        return new ArrayOfJ2EECache2Type();
    }

    /**
     * Create an instance of {@link StopSystemResponseElement }
     * 
     */
    public StopSystemResponseElement createStopSystemResponseElement() {
        return new StopSystemResponseElement();
    }

    /**
     * Create an instance of {@link GetSystemInstanceListResponseElement }
     * 
     */
    public GetSystemInstanceListResponseElement createGetSystemInstanceListResponseElement() {
        return new GetSystemInstanceListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfSAPInstanceType }
     * 
     */
    public ArrayOfSAPInstanceType createArrayOfSAPInstanceType() {
        return new ArrayOfSAPInstanceType();
    }

    /**
     * Create an instance of {@link StartSystemElement }
     * 
     */
    public StartSystemElement createStartSystemElement() {
        return new StartSystemElement();
    }

    /**
     * Create an instance of {@link GetAlertTreeElement }
     * 
     */
    public GetAlertTreeElement createGetAlertTreeElement() {
        return new GetAlertTreeElement();
    }

    /**
     * Create an instance of {@link J2EEGetThreadList2ResponseElement }
     * 
     */
    public J2EEGetThreadList2ResponseElement createJ2EEGetThreadList2ResponseElement() {
        return new J2EEGetThreadList2ResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EEThread2Type }
     * 
     */
    public ArrayOfJ2EEThread2Type createArrayOfJ2EEThread2Type() {
        return new ArrayOfJ2EEThread2Type();
    }

    /**
     * Create an instance of {@link StartBypassHAResponseElement }
     * 
     */
    public StartBypassHAResponseElement createStartBypassHAResponseElement() {
        return new StartBypassHAResponseElement();
    }

    /**
     * Create an instance of {@link OSExecuteResponseElement }
     * 
     */
    public OSExecuteResponseElement createOSExecuteResponseElement() {
        return new OSExecuteResponseElement();
    }

    /**
     * Create an instance of {@link J2EEGetVMHeapInfoElement }
     * 
     */
    public J2EEGetVMHeapInfoElement createJ2EEGetVMHeapInfoElement() {
        return new J2EEGetVMHeapInfoElement();
    }

    /**
     * Create an instance of {@link J2EEGetThreadTaskStackElement }
     * 
     */
    public J2EEGetThreadTaskStackElement createJ2EEGetThreadTaskStackElement() {
        return new J2EEGetThreadTaskStackElement();
    }

    /**
     * Create an instance of {@link J2EEGetCacheStatistic2Element }
     * 
     */
    public J2EEGetCacheStatistic2Element createJ2EEGetCacheStatistic2Element() {
        return new J2EEGetCacheStatistic2Element();
    }

    /**
     * Create an instance of {@link GetProcessListResponseElement }
     * 
     */
    public GetProcessListResponseElement createGetProcessListResponseElement() {
        return new GetProcessListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfOSProcessType }
     * 
     */
    public ArrayOfOSProcessType createArrayOfOSProcessType() {
        return new ArrayOfOSProcessType();
    }

    /**
     * Create an instance of {@link J2EEDisableDbgSessionResponseElement }
     * 
     */
    public J2EEDisableDbgSessionResponseElement createJ2EEDisableDbgSessionResponseElement() {
        return new J2EEDisableDbgSessionResponseElement();
    }

    /**
     * Create an instance of {@link HAFailoverToNodeElement }
     * 
     */
    public HAFailoverToNodeElement createHAFailoverToNodeElement() {
        return new HAFailoverToNodeElement();
    }

    /**
     * Create an instance of {@link GetTraceFileResponseElement }
     * 
     */
    public GetTraceFileResponseElement createGetTraceFileResponseElement() {
        return new GetTraceFileResponseElement();
    }

    /**
     * Create an instance of {@link ICMGetProxyConnectionListElement }
     * 
     */
    public ICMGetProxyConnectionListElement createICMGetProxyConnectionListElement() {
        return new ICMGetProxyConnectionListElement();
    }

    /**
     * Create an instance of {@link HAGetFailoverConfigElement }
     * 
     */
    public HAGetFailoverConfigElement createHAGetFailoverConfigElement() {
        return new HAGetFailoverConfigElement();
    }

    /**
     * Create an instance of {@link StartSystemResponseElement }
     * 
     */
    public StartSystemResponseElement createStartSystemResponseElement() {
        return new StartSystemResponseElement();
    }

    /**
     * Create an instance of {@link SetProcessParameterElement }
     * 
     */
    public SetProcessParameterElement createSetProcessParameterElement() {
        return new SetProcessParameterElement();
    }

    /**
     * Create an instance of {@link ArrayOfSetProfileParameterType }
     * 
     */
    public ArrayOfSetProfileParameterType createArrayOfSetProfileParameterType() {
        return new ArrayOfSetProfileParameterType();
    }

    /**
     * Create an instance of {@link RequestTicketResponseElement }
     * 
     */
    public RequestTicketResponseElement createRequestTicketResponseElement() {
        return new RequestTicketResponseElement();
    }

    /**
     * Create an instance of {@link BootstrapElement }
     * 
     */
    public BootstrapElement createBootstrapElement() {
        return new BootstrapElement();
    }

    /**
     * Create an instance of {@link GetAccessPointListResponseElement }
     * 
     */
    public GetAccessPointListResponseElement createGetAccessPointListResponseElement() {
        return new GetAccessPointListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfAccessPointType }
     * 
     */
    public ArrayOfAccessPointType createArrayOfAccessPointType() {
        return new ArrayOfAccessPointType();
    }

    /**
     * Create an instance of {@link ICMGetCacheEntriesElement }
     * 
     */
    public ICMGetCacheEntriesElement createICMGetCacheEntriesElement() {
        return new ICMGetCacheEntriesElement();
    }

    /**
     * Create an instance of {@link GetQueueStatisticElement }
     * 
     */
    public GetQueueStatisticElement createGetQueueStatisticElement() {
        return new GetQueueStatisticElement();
    }

    /**
     * Create an instance of {@link J2EEGetProcessList2ResponseElement }
     * 
     */
    public J2EEGetProcessList2ResponseElement createJ2EEGetProcessList2ResponseElement() {
        return new J2EEGetProcessList2ResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EEProcess2Type }
     * 
     */
    public ArrayOfJ2EEProcess2Type createArrayOfJ2EEProcess2Type() {
        return new ArrayOfJ2EEProcess2Type();
    }

    /**
     * Create an instance of {@link InstanceStartResponseElement }
     * 
     */
    public InstanceStartResponseElement createInstanceStartResponseElement() {
        return new InstanceStartResponseElement();
    }

    /**
     * Create an instance of {@link GetAccessPointListElement }
     * 
     */
    public GetAccessPointListElement createGetAccessPointListElement() {
        return new GetAccessPointListElement();
    }

    /**
     * Create an instance of {@link EnqRemoveLocksElement }
     * 
     */
    public EnqRemoveLocksElement createEnqRemoveLocksElement() {
        return new EnqRemoveLocksElement();
    }

    /**
     * Create an instance of {@link ArrayOfEnqLockType }
     * 
     */
    public ArrayOfEnqLockType createArrayOfEnqLockType() {
        return new ArrayOfEnqLockType();
    }

    /**
     * Create an instance of {@link GetAlertTreeResponseElement }
     * 
     */
    public GetAlertTreeResponseElement createGetAlertTreeResponseElement() {
        return new GetAlertTreeResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfAlertNodeType }
     * 
     */
    public ArrayOfAlertNodeType createArrayOfAlertNodeType() {
        return new ArrayOfAlertNodeType();
    }

    /**
     * Create an instance of {@link J2EEGetWebSessionListResponseElement }
     * 
     */
    public J2EEGetWebSessionListResponseElement createJ2EEGetWebSessionListResponseElement() {
        return new J2EEGetWebSessionListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EEWebSessionType }
     * 
     */
    public ArrayOfJ2EEWebSessionType createArrayOfJ2EEWebSessionType() {
        return new ArrayOfJ2EEWebSessionType();
    }

    /**
     * Create an instance of {@link HACheckFailoverConfigResponseElement }
     * 
     */
    public HACheckFailoverConfigResponseElement createHACheckFailoverConfigResponseElement() {
        return new HACheckFailoverConfigResponseElement();
    }

    /**
     * Create an instance of {@link EnqGetLockTableElement }
     * 
     */
    public EnqGetLockTableElement createEnqGetLockTableElement() {
        return new EnqGetLockTableElement();
    }

    /**
     * Create an instance of {@link HACheckFailoverConfigElement }
     * 
     */
    public HACheckFailoverConfigElement createHACheckFailoverConfigElement() {
        return new HACheckFailoverConfigElement();
    }

    /**
     * Create an instance of {@link GetLogFileListElement }
     * 
     */
    public GetLogFileListElement createGetLogFileListElement() {
        return new GetLogFileListElement();
    }

    /**
     * Create an instance of {@link GetSecNetworkIdResponseElement }
     * 
     */
    public GetSecNetworkIdResponseElement createGetSecNetworkIdResponseElement() {
        return new GetSecNetworkIdResponseElement();
    }

    /**
     * Create an instance of {@link ABAPGetSystemWPTableElement }
     * 
     */
    public ABAPGetSystemWPTableElement createABAPGetSystemWPTableElement() {
        return new ABAPGetSystemWPTableElement();
    }

    /**
     * Create an instance of {@link SendSignalElement }
     * 
     */
    public SendSignalElement createSendSignalElement() {
        return new SendSignalElement();
    }

    /**
     * Create an instance of {@link GetEnvironmentResponseElement }
     * 
     */
    public GetEnvironmentResponseElement createGetEnvironmentResponseElement() {
        return new GetEnvironmentResponseElement();
    }

    /**
     * Create an instance of {@link StopServiceResponseElement }
     * 
     */
    public StopServiceResponseElement createStopServiceResponseElement() {
        return new StopServiceResponseElement();
    }

    /**
     * Create an instance of {@link ConfigureLogFileListResponseElement }
     * 
     */
    public ConfigureLogFileListResponseElement createConfigureLogFileListResponseElement() {
        return new ConfigureLogFileListResponseElement();
    }

    /**
     * Create an instance of {@link EnqGetLockTableResponseElement }
     * 
     */
    public EnqGetLockTableResponseElement createEnqGetLockTableResponseElement() {
        return new EnqGetLockTableResponseElement();
    }

    /**
     * Create an instance of {@link ICMGetThreadListResponseElement }
     * 
     */
    public ICMGetThreadListResponseElement createICMGetThreadListResponseElement() {
        return new ICMGetThreadListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfICMThreadType }
     * 
     */
    public ArrayOfICMThreadType createArrayOfICMThreadType() {
        return new ArrayOfICMThreadType();
    }

    /**
     * Create an instance of {@link ShutdownElement }
     * 
     */
    public ShutdownElement createShutdownElement() {
        return new ShutdownElement();
    }

    /**
     * Create an instance of {@link ParameterValueResponseElement }
     * 
     */
    public ParameterValueResponseElement createParameterValueResponseElement() {
        return new ParameterValueResponseElement();
    }

    /**
     * Create an instance of {@link ReadLogFileResponseElement }
     * 
     */
    public ReadLogFileResponseElement createReadLogFileResponseElement() {
        return new ReadLogFileResponseElement();
    }

    /**
     * Create an instance of {@link J2EEGetWebSessionList2ResponseElement }
     * 
     */
    public J2EEGetWebSessionList2ResponseElement createJ2EEGetWebSessionList2ResponseElement() {
        return new J2EEGetWebSessionList2ResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EEWebSession2Type }
     * 
     */
    public ArrayOfJ2EEWebSession2Type createArrayOfJ2EEWebSession2Type() {
        return new ArrayOfJ2EEWebSession2Type();
    }

    /**
     * Create an instance of {@link GetLogFileListResponseElement }
     * 
     */
    public GetLogFileListResponseElement createGetLogFileListResponseElement() {
        return new GetLogFileListResponseElement();
    }

    /**
     * Create an instance of {@link DeleteSnapshotsElement }
     * 
     */
    public DeleteSnapshotsElement createDeleteSnapshotsElement() {
        return new DeleteSnapshotsElement();
    }

    /**
     * Create an instance of {@link J2EEGetThreadListResponseElement }
     * 
     */
    public J2EEGetThreadListResponseElement createJ2EEGetThreadListResponseElement() {
        return new J2EEGetThreadListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EEThreadType }
     * 
     */
    public ArrayOfJ2EEThreadType createArrayOfJ2EEThreadType() {
        return new ArrayOfJ2EEThreadType();
    }

    /**
     * Create an instance of {@link J2EEControlProcessElement }
     * 
     */
    public J2EEControlProcessElement createJ2EEControlProcessElement() {
        return new J2EEControlProcessElement();
    }

    /**
     * Create an instance of {@link GetInstancePropertiesElement }
     * 
     */
    public GetInstancePropertiesElement createGetInstancePropertiesElement() {
        return new GetInstancePropertiesElement();
    }

    /**
     * Create an instance of {@link RequestLogonFileElement }
     * 
     */
    public RequestLogonFileElement createRequestLogonFileElement() {
        return new RequestLogonFileElement();
    }

    /**
     * Create an instance of {@link J2EEGetThreadCallStackElement }
     * 
     */
    public J2EEGetThreadCallStackElement createJ2EEGetThreadCallStackElement() {
        return new J2EEGetThreadCallStackElement();
    }

    /**
     * Create an instance of {@link ReadSnapshotElement }
     * 
     */
    public ReadSnapshotElement createReadSnapshotElement() {
        return new ReadSnapshotElement();
    }

    /**
     * Create an instance of {@link J2EEGetRemoteObjectListResponseElement }
     * 
     */
    public J2EEGetRemoteObjectListResponseElement createJ2EEGetRemoteObjectListResponseElement() {
        return new J2EEGetRemoteObjectListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EERemoteObjectType }
     * 
     */
    public ArrayOfJ2EERemoteObjectType createArrayOfJ2EERemoteObjectType() {
        return new ArrayOfJ2EERemoteObjectType();
    }

    /**
     * Create an instance of {@link J2EEGetThreadList2Element }
     * 
     */
    public J2EEGetThreadList2Element createJ2EEGetThreadList2Element() {
        return new J2EEGetThreadList2Element();
    }

    /**
     * Create an instance of {@link GetProcessParameterElement }
     * 
     */
    public GetProcessParameterElement createGetProcessParameterElement() {
        return new GetProcessParameterElement();
    }

    /**
     * Create an instance of {@link J2EEGetCacheStatisticResponseElement }
     * 
     */
    public J2EEGetCacheStatisticResponseElement createJ2EEGetCacheStatisticResponseElement() {
        return new J2EEGetCacheStatisticResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfJ2EECacheType }
     * 
     */
    public ArrayOfJ2EECacheType createArrayOfJ2EECacheType() {
        return new ArrayOfJ2EECacheType();
    }

    /**
     * Create an instance of {@link HAGetFailoverConfigResponseElement }
     * 
     */
    public HAGetFailoverConfigResponseElement createHAGetFailoverConfigResponseElement() {
        return new HAGetFailoverConfigResponseElement();
    }

    /**
     * Create an instance of {@link StartElement }
     * 
     */
    public StartElement createStartElement() {
        return new StartElement();
    }

    /**
     * Create an instance of {@link J2EEEnableDbgSessionResponseElement }
     * 
     */
    public J2EEEnableDbgSessionResponseElement createJ2EEEnableDbgSessionResponseElement() {
        return new J2EEEnableDbgSessionResponseElement();
    }

    /**
     * Create an instance of {@link CreateSnapshotResponseElement }
     * 
     */
    public CreateSnapshotResponseElement createCreateSnapshotResponseElement() {
        return new CreateSnapshotResponseElement();
    }

    /**
     * Create an instance of {@link J2EEGetCacheStatisticElement }
     * 
     */
    public J2EEGetCacheStatisticElement createJ2EEGetCacheStatisticElement() {
        return new J2EEGetCacheStatisticElement();
    }

    /**
     * Create an instance of {@link ListLogFilesElement }
     * 
     */
    public ListLogFilesElement createListLogFilesElement() {
        return new ListLogFilesElement();
    }

    /**
     * Create an instance of {@link StopSystemElement }
     * 
     */
    public StopSystemElement createStopSystemElement() {
        return new StopSystemElement();
    }

    /**
     * Create an instance of {@link RequestTicketElement }
     * 
     */
    public RequestTicketElement createRequestTicketElement() {
        return new RequestTicketElement();
    }

    /**
     * Create an instance of {@link AnalyseLogFilesResponseElement }
     * 
     */
    public AnalyseLogFilesResponseElement createAnalyseLogFilesResponseElement() {
        return new AnalyseLogFilesResponseElement();
    }

    /**
     * Create an instance of {@link J2EEGetComponentListElement }
     * 
     */
    public J2EEGetComponentListElement createJ2EEGetComponentListElement() {
        return new J2EEGetComponentListElement();
    }

    /**
     * Create an instance of {@link ListDeveloperTracesElement }
     * 
     */
    public ListDeveloperTracesElement createListDeveloperTracesElement() {
        return new ListDeveloperTracesElement();
    }

    /**
     * Create an instance of {@link J2EEGetThreadCallStackResponseElement }
     * 
     */
    public J2EEGetThreadCallStackResponseElement createJ2EEGetThreadCallStackResponseElement() {
        return new J2EEGetThreadCallStackResponseElement();
    }

    /**
     * Create an instance of {@link GetInstancePropertiesResponseElement }
     * 
     */
    public GetInstancePropertiesResponseElement createGetInstancePropertiesResponseElement() {
        return new GetInstancePropertiesResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfInstancePropertiesType }
     * 
     */
    public ArrayOfInstancePropertiesType createArrayOfInstancePropertiesType() {
        return new ArrayOfInstancePropertiesType();
    }

    /**
     * Create an instance of {@link J2EEDisableDbgSessionElement }
     * 
     */
    public J2EEDisableDbgSessionElement createJ2EEDisableDbgSessionElement() {
        return new J2EEDisableDbgSessionElement();
    }

    /**
     * Create an instance of {@link J2EEGetSharedTableInfoElement }
     * 
     */
    public J2EEGetSharedTableInfoElement createJ2EEGetSharedTableInfoElement() {
        return new J2EEGetSharedTableInfoElement();
    }

    /**
     * Create an instance of {@link J2EEGetThreadListElement }
     * 
     */
    public J2EEGetThreadListElement createJ2EEGetThreadListElement() {
        return new J2EEGetThreadListElement();
    }

    /**
     * Create an instance of {@link ICMGetConnectionListElement }
     * 
     */
    public ICMGetConnectionListElement createICMGetConnectionListElement() {
        return new ICMGetConnectionListElement();
    }

    /**
     * Create an instance of {@link RestartServiceResponseElement }
     * 
     */
    public RestartServiceResponseElement createRestartServiceResponseElement() {
        return new RestartServiceResponseElement();
    }

    /**
     * Create an instance of {@link GetAlertsElement }
     * 
     */
    public GetAlertsElement createGetAlertsElement() {
        return new GetAlertsElement();
    }

    /**
     * Create an instance of {@link J2EEGetVMHeapInfoResponseElement }
     * 
     */
    public J2EEGetVMHeapInfoResponseElement createJ2EEGetVMHeapInfoResponseElement() {
        return new J2EEGetVMHeapInfoResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfHeapInfoType }
     * 
     */
    public ArrayOfHeapInfoType createArrayOfHeapInfoType() {
        return new ArrayOfHeapInfoType();
    }

    /**
     * Create an instance of {@link ICMGetThreadListElement }
     * 
     */
    public ICMGetThreadListElement createICMGetThreadListElement() {
        return new ICMGetThreadListElement();
    }

    /**
     * Create an instance of {@link J2EEControlProcessResponseElement }
     * 
     */
    public J2EEControlProcessResponseElement createJ2EEControlProcessResponseElement() {
        return new J2EEControlProcessResponseElement();
    }

    /**
     * Create an instance of {@link J2EEGetWebSessionList2Element }
     * 
     */
    public J2EEGetWebSessionList2Element createJ2EEGetWebSessionList2Element() {
        return new J2EEGetWebSessionList2Element();
    }

    /**
     * Create an instance of {@link ReadDeveloperTraceElement }
     * 
     */
    public ReadDeveloperTraceElement createReadDeveloperTraceElement() {
        return new ReadDeveloperTraceElement();
    }

    /**
     * Create an instance of {@link StopResponseElement }
     * 
     */
    public StopResponseElement createStopResponseElement() {
        return new StopResponseElement();
    }

    /**
     * Create an instance of {@link ICMGetConnectionListResponseElement }
     * 
     */
    public ICMGetConnectionListResponseElement createICMGetConnectionListResponseElement() {
        return new ICMGetConnectionListResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfICMConnectionType }
     * 
     */
    public ArrayOfICMConnectionType createArrayOfICMConnectionType() {
        return new ArrayOfICMConnectionType();
    }

    /**
     * Create an instance of {@link SetProcessParameterResponseElement }
     * 
     */
    public SetProcessParameterResponseElement createSetProcessParameterResponseElement() {
        return new SetProcessParameterResponseElement();
    }

    /**
     * Create an instance of {@link ABAPReadSyslogResponseElement }
     * 
     */
    public ABAPReadSyslogResponseElement createABAPReadSyslogResponseElement() {
        return new ABAPReadSyslogResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfSyslogEntryType }
     * 
     */
    public ArrayOfSyslogEntryType createArrayOfSyslogEntryType() {
        return new ArrayOfSyslogEntryType();
    }

    /**
     * Create an instance of {@link WebDispGetServerListElement }
     * 
     */
    public WebDispGetServerListElement createWebDispGetServerListElement() {
        return new WebDispGetServerListElement();
    }

    /**
     * Create an instance of {@link SendSignalResponseElement }
     * 
     */
    public SendSignalResponseElement createSendSignalResponseElement() {
        return new SendSignalResponseElement();
    }

    /**
     * Create an instance of {@link ShmDetachElement }
     * 
     */
    public ShmDetachElement createShmDetachElement() {
        return new ShmDetachElement();
    }

    /**
     * Create an instance of {@link GetNetworkIdResponseElement }
     * 
     */
    public GetNetworkIdResponseElement createGetNetworkIdResponseElement() {
        return new GetNetworkIdResponseElement();
    }

    /**
     * Create an instance of {@link J2EEControlComponentsElement }
     * 
     */
    public J2EEControlComponentsElement createJ2EEControlComponentsElement() {
        return new J2EEControlComponentsElement();
    }

    /**
     * Create an instance of {@link J2EEGetApplicationAliasListElement }
     * 
     */
    public J2EEGetApplicationAliasListElement createJ2EEGetApplicationAliasListElement() {
        return new J2EEGetApplicationAliasListElement();
    }

    /**
     * Create an instance of {@link ConfigureLogFileListElement }
     * 
     */
    public ConfigureLogFileListElement createConfigureLogFileListElement() {
        return new ConfigureLogFileListElement();
    }

    /**
     * Create an instance of {@link J2EEGetProcessList2Element }
     * 
     */
    public J2EEGetProcessList2Element createJ2EEGetProcessList2Element() {
        return new J2EEGetProcessList2Element();
    }

    /**
     * Create an instance of {@link RequestLogonFileResponseElement }
     * 
     */
    public RequestLogonFileResponseElement createRequestLogonFileResponseElement() {
        return new RequestLogonFileResponseElement();
    }

    /**
     * Create an instance of {@link ABAPAcknowledgeAlertsElement }
     * 
     */
    public ABAPAcknowledgeAlertsElement createABAPAcknowledgeAlertsElement() {
        return new ABAPAcknowledgeAlertsElement();
    }

    /**
     * Create an instance of {@link EnqGetStatisticElement }
     * 
     */
    public EnqGetStatisticElement createEnqGetStatisticElement() {
        return new EnqGetStatisticElement();
    }

    /**
     * Create an instance of {@link J2EEGetEJBSessionListElement }
     * 
     */
    public J2EEGetEJBSessionListElement createJ2EEGetEJBSessionListElement() {
        return new J2EEGetEJBSessionListElement();
    }

    /**
     * Create an instance of {@link RestartInstanceElement }
     * 
     */
    public RestartInstanceElement createRestartInstanceElement() {
        return new RestartInstanceElement();
    }

    /**
     * Create an instance of {@link ListSnapshotsElement }
     * 
     */
    public ListSnapshotsElement createListSnapshotsElement() {
        return new ListSnapshotsElement();
    }

    /**
     * Create an instance of {@link J2EEGetVMGCHistory2ResponseElement }
     * 
     */
    public J2EEGetVMGCHistory2ResponseElement createJ2EEGetVMGCHistory2ResponseElement() {
        return new J2EEGetVMGCHistory2ResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfGCInfo2Type }
     * 
     */
    public ArrayOfGCInfo2Type createArrayOfGCInfo2Type() {
        return new ArrayOfGCInfo2Type();
    }

    /**
     * Create an instance of {@link ShutdownResponseElement }
     * 
     */
    public ShutdownResponseElement createShutdownResponseElement() {
        return new ShutdownResponseElement();
    }

    /**
     * Create an instance of {@link ABAPGetWPTableElement }
     * 
     */
    public ABAPGetWPTableElement createABAPGetWPTableElement() {
        return new ABAPGetWPTableElement();
    }

    /**
     * Create an instance of {@link BootstrapResponseElement }
     * 
     */
    public BootstrapResponseElement createBootstrapResponseElement() {
        return new BootstrapResponseElement();
    }

    /**
     * Create an instance of {@link GetCallstackResponseElement }
     * 
     */
    public GetCallstackResponseElement createGetCallstackResponseElement() {
        return new GetCallstackResponseElement();
    }

    /**
     * Create an instance of {@link ParameterValueElement }
     * 
     */
    public ParameterValueElement createParameterValueElement() {
        return new ParameterValueElement();
    }

    /**
     * Create an instance of {@link ReadLogFileElement }
     * 
     */
    public ReadLogFileElement createReadLogFileElement() {
        return new ReadLogFileElement();
    }

    /**
     * Create an instance of {@link J2EEGetWebSessionListElement }
     * 
     */
    public J2EEGetWebSessionListElement createJ2EEGetWebSessionListElement() {
        return new J2EEGetWebSessionListElement();
    }

    /**
     * Create an instance of {@link RestartSystemResponseElement }
     * 
     */
    public RestartSystemResponseElement createRestartSystemResponseElement() {
        return new RestartSystemResponseElement();
    }

    /**
     * Create an instance of {@link GetQueueStatisticResponseElement }
     * 
     */
    public GetQueueStatisticResponseElement createGetQueueStatisticResponseElement() {
        return new GetQueueStatisticResponseElement();
    }

    /**
     * Create an instance of {@link ArrayOfTaskHandlerQueueType }
     * 
     */
    public ArrayOfTaskHandlerQueueType createArrayOfTaskHandlerQueueType() {
        return new ArrayOfTaskHandlerQueueType();
    }

    /**
     * Create an instance of {@link AnalyseLogFilesElement }
     * 
     */
    public AnalyseLogFilesElement createAnalyseLogFilesElement() {
        return new AnalyseLogFilesElement();
    }

    /**
     * Create an instance of {@link OSExecuteElement }
     * 
     */
    public OSExecuteElement createOSExecuteElement() {
        return new OSExecuteElement();
    }

    /**
     * Create an instance of {@link StartResponseElement }
     * 
     */
    public StartResponseElement createStartResponseElement() {
        return new StartResponseElement();
    }

    /**
     * Create an instance of {@link CreateSnapshotElement }
     * 
     */
    public CreateSnapshotElement createCreateSnapshotElement() {
        return new CreateSnapshotElement();
    }

    /**
     * Create an instance of {@link J2EESessionType }
     * 
     */
    public J2EESessionType createJ2EESessionType() {
        return new J2EESessionType();
    }

    /**
     * Create an instance of {@link ICMCacheEntryType }
     * 
     */
    public ICMCacheEntryType createICMCacheEntryType() {
        return new ICMCacheEntryType();
    }

    /**
     * Create an instance of {@link SAPInstanceType }
     * 
     */
    public SAPInstanceType createSAPInstanceType() {
        return new SAPInstanceType();
    }

    /**
     * Create an instance of {@link EnqLockType }
     * 
     */
    public EnqLockType createEnqLockType() {
        return new EnqLockType();
    }

    /**
     * Create an instance of {@link HACheckType }
     * 
     */
    public HACheckType createHACheckType() {
        return new HACheckType();
    }

    /**
     * Create an instance of {@link J2EEThreadType }
     * 
     */
    public J2EEThreadType createJ2EEThreadType() {
        return new J2EEThreadType();
    }

    /**
     * Create an instance of {@link J2EECache2Type }
     * 
     */
    public J2EECache2Type createJ2EECache2Type() {
        return new J2EECache2Type();
    }

    /**
     * Create an instance of {@link J2EEEJBSessionType }
     * 
     */
    public J2EEEJBSessionType createJ2EEEJBSessionType() {
        return new J2EEEJBSessionType();
    }

    /**
     * Create an instance of {@link HeapInfoType }
     * 
     */
    public HeapInfoType createHeapInfoType() {
        return new HeapInfoType();
    }

    /**
     * Create an instance of {@link ICMConnectionType }
     * 
     */
    public ICMConnectionType createICMConnectionType() {
        return new ICMConnectionType();
    }

    /**
     * Create an instance of {@link SyslogEntryType }
     * 
     */
    public SyslogEntryType createSyslogEntryType() {
        return new SyslogEntryType();
    }

    /**
     * Create an instance of {@link J2EESharedTableInfoType }
     * 
     */
    public J2EESharedTableInfoType createJ2EESharedTableInfoType() {
        return new J2EESharedTableInfoType();
    }

    /**
     * Create an instance of {@link ICMProxyConnectionType }
     * 
     */
    public ICMProxyConnectionType createICMProxyConnectionType() {
        return new ICMProxyConnectionType();
    }

    /**
     * Create an instance of {@link GCInfo2Type }
     * 
     */
    public GCInfo2Type createGCInfo2Type() {
        return new GCInfo2Type();
    }

    /**
     * Create an instance of {@link AccessPointType }
     * 
     */
    public AccessPointType createAccessPointType() {
        return new AccessPointType();
    }

    /**
     * Create an instance of {@link LogFileType }
     * 
     */
    public LogFileType createLogFileType() {
        return new LogFileType();
    }

    /**
     * Create an instance of {@link SnapshotInfoType }
     * 
     */
    public SnapshotInfoType createSnapshotInfoType() {
        return new SnapshotInfoType();
    }

    /**
     * Create an instance of {@link InstancePropertyType }
     * 
     */
    public InstancePropertyType createInstancePropertyType() {
        return new InstancePropertyType();
    }

    /**
     * Create an instance of {@link J2EECacheType }
     * 
     */
    public J2EECacheType createJ2EECacheType() {
        return new J2EECacheType();
    }

    /**
     * Create an instance of {@link ICMThreadType }
     * 
     */
    public ICMThreadType createICMThreadType() {
        return new ICMThreadType();
    }

    /**
     * Create an instance of {@link J2EEWebSession2Type }
     * 
     */
    public J2EEWebSession2Type createJ2EEWebSession2Type() {
        return new J2EEWebSession2Type();
    }

    /**
     * Create an instance of {@link AlertType }
     * 
     */
    public AlertType createAlertType() {
        return new AlertType();
    }

    /**
     * Create an instance of {@link WorkProcessType }
     * 
     */
    public WorkProcessType createWorkProcessType() {
        return new WorkProcessType();
    }

    /**
     * Create an instance of {@link J2EEComponentInfoType }
     * 
     */
    public J2EEComponentInfoType createJ2EEComponentInfoType() {
        return new J2EEComponentInfoType();
    }

    /**
     * Create an instance of {@link SetProfileParameterType }
     * 
     */
    public SetProfileParameterType createSetProfileParameterType() {
        return new SetProfileParameterType();
    }

    /**
     * Create an instance of {@link J2EEWebSessionType }
     * 
     */
    public J2EEWebSessionType createJ2EEWebSessionType() {
        return new J2EEWebSessionType();
    }

    /**
     * Create an instance of {@link J2EEProcessType }
     * 
     */
    public J2EEProcessType createJ2EEProcessType() {
        return new J2EEProcessType();
    }

    /**
     * Create an instance of {@link J2EEThread2Type }
     * 
     */
    public J2EEThread2Type createJ2EEThread2Type() {
        return new J2EEThread2Type();
    }

    /**
     * Create an instance of {@link ParameterRestrictionType }
     * 
     */
    public ParameterRestrictionType createParameterRestrictionType() {
        return new ParameterRestrictionType();
    }

    /**
     * Create an instance of {@link InstanceVersionInfoType }
     * 
     */
    public InstanceVersionInfoType createInstanceVersionInfoType() {
        return new InstanceVersionInfoType();
    }

    /**
     * Create an instance of {@link DirEntryType }
     * 
     */
    public DirEntryType createDirEntryType() {
        return new DirEntryType();
    }

    /**
     * Create an instance of {@link ProfileParameterType }
     * 
     */
    public ProfileParameterType createProfileParameterType() {
        return new ProfileParameterType();
    }

    /**
     * Create an instance of {@link TaskHandlerQueueType }
     * 
     */
    public TaskHandlerQueueType createTaskHandlerQueueType() {
        return new TaskHandlerQueueType();
    }

    /**
     * Create an instance of {@link J2EEApplicationAliasType }
     * 
     */
    public J2EEApplicationAliasType createJ2EEApplicationAliasType() {
        return new J2EEApplicationAliasType();
    }

    /**
     * Create an instance of {@link OSProcessType }
     * 
     */
    public OSProcessType createOSProcessType() {
        return new OSProcessType();
    }

    /**
     * Create an instance of {@link WebDispServerType }
     * 
     */
    public WebDispServerType createWebDispServerType() {
        return new WebDispServerType();
    }

    /**
     * Create an instance of {@link SubProfileParameterType }
     * 
     */
    public SubProfileParameterType createSubProfileParameterType() {
        return new SubProfileParameterType();
    }

    /**
     * Create an instance of {@link AlertNodeType }
     * 
     */
    public AlertNodeType createAlertNodeType() {
        return new AlertNodeType();
    }

    /**
     * Create an instance of {@link GCInfoType }
     * 
     */
    public GCInfoType createGCInfoType() {
        return new GCInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfSubProfileParameterType }
     * 
     */
    public ArrayOfSubProfileParameterType createArrayOfSubProfileParameterType() {
        return new ArrayOfSubProfileParameterType();
    }

    /**
     * Create an instance of {@link SystemWorkProcessType }
     * 
     */
    public SystemWorkProcessType createSystemWorkProcessType() {
        return new SystemWorkProcessType();
    }

    /**
     * Create an instance of {@link J2EEProcess2Type }
     * 
     */
    public J2EEProcess2Type createJ2EEProcess2Type() {
        return new J2EEProcess2Type();
    }

    /**
     * Create an instance of {@link J2EERemoteObjectType }
     * 
     */
    public J2EERemoteObjectType createJ2EERemoteObjectType() {
        return new J2EERemoteObjectType();
    }

    /**
     * Create an instance of {@link J2EEClusterMsgType }
     * 
     */
    public J2EEClusterMsgType createJ2EEClusterMsgType() {
        return new J2EEClusterMsgType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogFileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "file", scope = ListLogFilesResponseElement.class)
    public JAXBElement<ArrayOfLogFileType> createListLogFilesResponseElementFile(ArrayOfLogFileType value) {
        return new JAXBElement<ArrayOfLogFileType>(_ListLogFilesResponseElementFile_QNAME, ArrayOfLogFileType.class, ListLogFilesResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = SnapshotInfoType.class)
    public JAXBElement<String> createSnapshotInfoTypeDescription(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeDescription_QNAME, String.class, SnapshotInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modtime", scope = SnapshotInfoType.class)
    public JAXBElement<String> createSnapshotInfoTypeModtime(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeModtime_QNAME, String.class, SnapshotInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filename", scope = SnapshotInfoType.class)
    public JAXBElement<String> createSnapshotInfoTypeFilename(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeFilename_QNAME, String.class, SnapshotInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "prioritylevel", scope = StartSystemElement.class)
    public JAXBElement<String> createStartSystemElementPrioritylevel(String value) {
        return new JAXBElement<String>(_StartSystemElementPrioritylevel_QNAME, String.class, StartSystemElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "runlevel", scope = StartSystemElement.class)
    public JAXBElement<String> createStartSystemElementRunlevel(String value) {
        return new JAXBElement<String>(_StartSystemElementRunlevel_QNAME, String.class, StartSystemElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGCInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gc", scope = J2EEGetVMGCHistoryResponseElement.class)
    public JAXBElement<ArrayOfGCInfoType> createJ2EEGetVMGCHistoryResponseElementGc(ArrayOfGCInfoType value) {
        return new JAXBElement<ArrayOfGCInfoType>(_J2EEGetVMGCHistoryResponseElementGc_QNAME, ArrayOfGCInfoType.class, J2EEGetVMGCHistoryResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "table", scope = J2EESharedTableInfoType.class)
    public JAXBElement<String> createJ2EESharedTableInfoTypeTable(String value) {
        return new JAXBElement<String>(_J2EESharedTableInfoTypeTable_QNAME, String.class, J2EESharedTableInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filename", scope = ReadSnapshotElement.class)
    public JAXBElement<String> createReadSnapshotElementFilename(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeFilename_QNAME, String.class, ReadSnapshotElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "proof", scope = GetSecNetworkIdResponseElement.class)
    public JAXBElement<String> createGetSecNetworkIdResponseElementProof(String value) {
        return new JAXBElement<String>(_GetSecNetworkIdResponseElementProof_QNAME, String.class, GetSecNetworkIdResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "key", scope = GetSecNetworkIdResponseElement.class)
    public JAXBElement<String> createGetSecNetworkIdResponseElementKey(String value) {
        return new JAXBElement<String>(_GetSecNetworkIdResponseElementKey_QNAME, String.class, GetSecNetworkIdResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "runlevel", scope = StartBypassHAElement.class)
    public JAXBElement<String> createStartBypassHAElementRunlevel(String value) {
        return new JAXBElement<String>(_StartSystemElementRunlevel_QNAME, String.class, StartBypassHAElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "analyse-endtime", scope = CreateSnapshotElement.class)
    public JAXBElement<String> createCreateSnapshotElementAnalyseEndtime(String value) {
        return new JAXBElement<String>(_CreateSnapshotElementAnalyseEndtime_QNAME, String.class, CreateSnapshotElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = CreateSnapshotElement.class)
    public JAXBElement<String> createCreateSnapshotElementDescription(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeDescription_QNAME, String.class, CreateSnapshotElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "analyse-starttime", scope = CreateSnapshotElement.class)
    public JAXBElement<String> createCreateSnapshotElementAnalyseStarttime(String value) {
        return new JAXBElement<String>(_CreateSnapshotElementAnalyseStarttime_QNAME, String.class, CreateSnapshotElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "datcol-param", scope = CreateSnapshotElement.class)
    public JAXBElement<String> createCreateSnapshotElementDatcolParam(String value) {
        return new JAXBElement<String>(_CreateSnapshotElementDatcolParam_QNAME, String.class, CreateSnapshotElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertNodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tree", scope = GetAlertTreeResponseElement.class)
    public JAXBElement<ArrayOfAlertNodeType> createGetAlertTreeResponseElementTree(ArrayOfAlertNodeType value) {
        return new JAXBElement<ArrayOfAlertNodeType>(_GetAlertTreeResponseElementTree_QNAME, ArrayOfAlertNodeType.class, GetAlertTreeResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startTime", scope = J2EEProcess2Type.class)
    public JAXBElement<String> createJ2EEProcess2TypeStartTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStartTime_QNAME, String.class, J2EEProcess2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restart", scope = J2EEProcess2Type.class)
    public JAXBElement<String> createJ2EEProcess2TypeRestart(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeRestart_QNAME, String.class, J2EEProcess2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = J2EEProcess2Type.class)
    public JAXBElement<String> createJ2EEProcess2TypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, J2EEProcess2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cpu", scope = J2EEProcess2Type.class)
    public JAXBElement<String> createJ2EEProcess2TypeCpu(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeCpu_QNAME, String.class, J2EEProcess2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exitCode", scope = J2EEProcess2Type.class)
    public JAXBElement<String> createJ2EEProcess2TypeExitCode(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeExitCode_QNAME, String.class, J2EEProcess2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "debug", scope = J2EEProcess2Type.class)
    public JAXBElement<String> createJ2EEProcess2TypeDebug(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeDebug_QNAME, String.class, J2EEProcess2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = J2EEProcess2Type.class)
    public JAXBElement<String> createJ2EEProcess2TypeType(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeType_QNAME, String.class, J2EEProcess2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "elapsedTime", scope = J2EEProcess2Type.class)
    public JAXBElement<String> createJ2EEProcess2TypeElapsedTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeElapsedTime_QNAME, String.class, J2EEProcess2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statetext", scope = J2EEProcess2Type.class)
    public JAXBElement<String> createJ2EEProcess2TypeStatetext(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStatetext_QNAME, String.class, J2EEProcess2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = HeapInfoType.class)
    public JAXBElement<String> createHeapInfoTypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, HeapInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = HeapInfoType.class)
    public JAXBElement<String> createHeapInfoTypeType(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeType_QNAME, String.class, HeapInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EEProcess2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "process", scope = J2EEGetProcessList2ResponseElement.class)
    public JAXBElement<ArrayOfJ2EEProcess2Type> createJ2EEGetProcessList2ResponseElementProcess(ArrayOfJ2EEProcess2Type value) {
        return new JAXBElement<ArrayOfJ2EEProcess2Type>(_J2EEGetProcessList2ResponseElementProcess_QNAME, ArrayOfJ2EEProcess2Type.class, J2EEGetProcessList2ResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "values", scope = SetProfileParameterType.class)
    public JAXBElement<ArrayOfStringType> createSetProfileParameterTypeValues(ArrayOfStringType value) {
        return new JAXBElement<ArrayOfStringType>(_SetProfileParameterTypeValues_QNAME, ArrayOfStringType.class, SetProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = SetProfileParameterType.class)
    public JAXBElement<String> createSetProfileParameterTypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, SetProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value", scope = SetProfileParameterType.class)
    public JAXBElement<String> createSetProfileParameterTypeValue(String value) {
        return new JAXBElement<String>(_SetProfileParameterTypeValue_QNAME, String.class, SetProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstanceVersionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "version", scope = GetVersionInfoResponseElement.class)
    public JAXBElement<ArrayOfInstanceVersionInfoType> createGetVersionInfoResponseElementVersion(ArrayOfInstanceVersionInfoType value) {
        return new JAXBElement<ArrayOfInstanceVersionInfoType>(_GetVersionInfoResponseElementVersion_QNAME, ArrayOfInstanceVersionInfoType.class, GetVersionInfoResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "language", scope = ReadLogFileElement.class)
    public JAXBElement<String> createReadLogFileElementLanguage(String value) {
        return new JAXBElement<String>(_ReadLogFileElementLanguage_QNAME, String.class, ReadLogFileElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filter", scope = ReadLogFileElement.class)
    public JAXBElement<String> createReadLogFileElementFilter(String value) {
        return new JAXBElement<String>(_ReadLogFileElementFilter_QNAME, String.class, ReadLogFileElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statecookie", scope = ReadLogFileElement.class)
    public JAXBElement<String> createReadLogFileElementStatecookie(String value) {
        return new JAXBElement<String>(_ReadLogFileElementStatecookie_QNAME, String.class, ReadLogFileElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value", scope = InstancePropertyType.class)
    public JAXBElement<String> createInstancePropertyTypeValue(String value) {
        return new JAXBElement<String>(_SetProfileParameterTypeValue_QNAME, String.class, InstancePropertyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "property", scope = InstancePropertyType.class)
    public JAXBElement<String> createInstancePropertyTypeProperty(String value) {
        return new JAXBElement<String>(_InstancePropertyTypeProperty_QNAME, String.class, InstancePropertyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "propertytype", scope = InstancePropertyType.class)
    public JAXBElement<String> createInstancePropertyTypePropertytype(String value) {
        return new JAXBElement<String>(_InstancePropertyTypePropertytype_QNAME, String.class, InstancePropertyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOSProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "process", scope = GetProcessListResponseElement.class)
    public JAXBElement<ArrayOfOSProcessType> createGetProcessListResponseElementProcess(ArrayOfOSProcessType value) {
        return new JAXBElement<ArrayOfOSProcessType>(_J2EEGetProcessList2ResponseElementProcess_QNAME, ArrayOfOSProcessType.class, GetProcessListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RootTid", scope = GetAlertsElement.class)
    public JAXBElement<String> createGetAlertsElementRootTid(String value) {
        return new JAXBElement<String>(_GetAlertsElementRootTid_QNAME, String.class, GetAlertsElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startPriority", scope = SAPInstanceType.class)
    public JAXBElement<String> createSAPInstanceTypeStartPriority(String value) {
        return new JAXBElement<String>(_SAPInstanceTypeStartPriority_QNAME, String.class, SAPInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "features", scope = SAPInstanceType.class)
    public JAXBElement<String> createSAPInstanceTypeFeatures(String value) {
        return new JAXBElement<String>(_SAPInstanceTypeFeatures_QNAME, String.class, SAPInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hostname", scope = SAPInstanceType.class)
    public JAXBElement<String> createSAPInstanceTypeHostname(String value) {
        return new JAXBElement<String>(_SAPInstanceTypeHostname_QNAME, String.class, SAPInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = GetTraceFileResponseElement.class)
    public JAXBElement<String> createGetTraceFileResponseElementName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, GetTraceFileResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "alert", scope = ABAPAcknowledgeAlertsResponseElement.class)
    public JAXBElement<ArrayOfIntType> createABAPAcknowledgeAlertsResponseElementAlert(ArrayOfIntType value) {
        return new JAXBElement<ArrayOfIntType>(_ABAPAcknowledgeAlertsResponseElementAlert_QNAME, ArrayOfIntType.class, ABAPAcknowledgeAlertsResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "unit", scope = SubProfileParameterType.class)
    public JAXBElement<String> createSubProfileParameterTypeUnit(String value) {
        return new JAXBElement<String>(_SubProfileParameterTypeUnit_QNAME, String.class, SubProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = SubProfileParameterType.class)
    public JAXBElement<String> createSubProfileParameterTypeDescription(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeDescription_QNAME, String.class, SubProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = SubProfileParameterType.class)
    public JAXBElement<String> createSubProfileParameterTypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, SubProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EEClusterMsgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "msg", scope = J2EEGetClusterMsgListResponseElement.class)
    public JAXBElement<ArrayOfJ2EEClusterMsgType> createJ2EEGetClusterMsgListResponseElementMsg(ArrayOfJ2EEClusterMsgType value) {
        return new JAXBElement<ArrayOfJ2EEClusterMsgType>(_J2EEGetClusterMsgListResponseElementMsg_QNAME, ArrayOfJ2EEClusterMsgType.class, J2EEGetClusterMsgListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EEWebSession2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "session", scope = J2EEGetWebSessionList2ResponseElement.class)
    public JAXBElement<ArrayOfJ2EEWebSession2Type> createJ2EEGetWebSessionList2ResponseElementSession(ArrayOfJ2EEWebSession2Type value) {
        return new JAXBElement<ArrayOfJ2EEWebSession2Type>(_J2EEGetWebSessionList2ResponseElementSession_QNAME, ArrayOfJ2EEWebSession2Type.class, J2EEGetWebSessionList2ResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startTime", scope = GCInfo2Type.class)
    public JAXBElement<String> createGCInfo2TypeStartTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStartTime_QNAME, String.class, GCInfo2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = GCInfo2Type.class)
    public JAXBElement<String> createGCInfo2TypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, GCInfo2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reason", scope = GCInfo2Type.class)
    public JAXBElement<String> createGCInfo2TypeReason(String value) {
        return new JAXBElement<String>(_GCInfo2TypeReason_QNAME, String.class, GCInfo2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = GCInfo2Type.class)
    public JAXBElement<String> createGCInfo2TypeType(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeType_QNAME, String.class, GCInfo2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "runlevel", scope = StartElement.class)
    public JAXBElement<String> createStartElementRunlevel(String value) {
        return new JAXBElement<String>(_StartSystemElementRunlevel_QNAME, String.class, StartElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lock-mode", scope = EnqLockType.class)
    public JAXBElement<String> createEnqLockTypeLockMode(String value) {
        return new JAXBElement<String>(_EnqLockTypeLockMode_QNAME, String.class, EnqLockType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lock-name", scope = EnqLockType.class)
    public JAXBElement<String> createEnqLockTypeLockName(String value) {
        return new JAXBElement<String>(_EnqLockTypeLockName_QNAME, String.class, EnqLockType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "client", scope = EnqLockType.class)
    public JAXBElement<String> createEnqLockTypeClient(String value) {
        return new JAXBElement<String>(_EnqLockTypeClient_QNAME, String.class, EnqLockType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transaction", scope = EnqLockType.class)
    public JAXBElement<String> createEnqLockTypeTransaction(String value) {
        return new JAXBElement<String>(_EnqLockTypeTransaction_QNAME, String.class, EnqLockType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "owner", scope = EnqLockType.class)
    public JAXBElement<String> createEnqLockTypeOwner(String value) {
        return new JAXBElement<String>(_EnqLockTypeOwner_QNAME, String.class, EnqLockType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "owner-vb", scope = EnqLockType.class)
    public JAXBElement<String> createEnqLockTypeOwnerVb(String value) {
        return new JAXBElement<String>(_EnqLockTypeOwnerVb_QNAME, String.class, EnqLockType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "object", scope = EnqLockType.class)
    public JAXBElement<String> createEnqLockTypeObject(String value) {
        return new JAXBElement<String>(_EnqLockTypeObject_QNAME, String.class, EnqLockType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user", scope = EnqLockType.class)
    public JAXBElement<String> createEnqLockTypeUser(String value) {
        return new JAXBElement<String>(_EnqLockTypeUser_QNAME, String.class, EnqLockType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lock-arg", scope = EnqLockType.class)
    public JAXBElement<String> createEnqLockTypeLockArg(String value) {
        return new JAXBElement<String>(_EnqLockTypeLockArg_QNAME, String.class, EnqLockType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaskHandlerQueueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "queue", scope = GetQueueStatisticResponseElement.class)
    public JAXBElement<ArrayOfTaskHandlerQueueType> createGetQueueStatisticResponseElementQueue(ArrayOfTaskHandlerQueueType value) {
        return new JAXBElement<ArrayOfTaskHandlerQueueType>(_GetQueueStatisticResponseElementQueue_QNAME, ArrayOfTaskHandlerQueueType.class, GetQueueStatisticResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnqLockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lock", scope = EnqRemoveLocksElement.class)
    public JAXBElement<ArrayOfEnqLockType> createEnqRemoveLocksElementLock(ArrayOfEnqLockType value) {
        return new JAXBElement<ArrayOfEnqLockType>(_EnqRemoveLocksElementLock_QNAME, ArrayOfEnqLockType.class, EnqRemoveLocksElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "host", scope = J2EEControlClusterElement.class)
    public JAXBElement<String> createJ2EEControlClusterElementHost(String value) {
        return new JAXBElement<String>(_J2EEControlClusterElementHost_QNAME, String.class, J2EEControlClusterElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accesspoint", scope = GetAccessPointListResponseElement.class)
    public JAXBElement<ArrayOfAccessPointType> createGetAccessPointListResponseElementAccesspoint(ArrayOfAccessPointType value) {
        return new JAXBElement<ArrayOfAccessPointType>(_GetAccessPointListResponseElementAccesspoint_QNAME, ArrayOfAccessPointType.class, GetAccessPointListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "unit", scope = ProfileParameterType.class)
    public JAXBElement<String> createProfileParameterTypeUnit(String value) {
        return new JAXBElement<String>(_SubProfileParameterTypeUnit_QNAME, String.class, ProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dynamic-values", scope = ProfileParameterType.class)
    public JAXBElement<ArrayOfStringType> createProfileParameterTypeDynamicValues(ArrayOfStringType value) {
        return new JAXBElement<ArrayOfStringType>(_ProfileParameterTypeDynamicValues_QNAME, ArrayOfStringType.class, ProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "values", scope = ProfileParameterType.class)
    public JAXBElement<ArrayOfStringType> createProfileParameterTypeValues(ArrayOfStringType value) {
        return new JAXBElement<ArrayOfStringType>(_SetProfileParameterTypeValues_QNAME, ArrayOfStringType.class, ProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dynamic-value", scope = ProfileParameterType.class)
    public JAXBElement<String> createProfileParameterTypeDynamicValue(String value) {
        return new JAXBElement<String>(_ProfileParameterTypeDynamicValue_QNAME, String.class, ProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = ProfileParameterType.class)
    public JAXBElement<String> createProfileParameterTypeDescription(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeDescription_QNAME, String.class, ProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = ProfileParameterType.class)
    public JAXBElement<String> createProfileParameterTypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, ProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value", scope = ProfileParameterType.class)
    public JAXBElement<String> createProfileParameterTypeValue(String value) {
        return new JAXBElement<String>(_SetProfileParameterTypeValue_QNAME, String.class, ProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubProfileParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sub-para", scope = ProfileParameterType.class)
    public JAXBElement<ArrayOfSubProfileParameterType> createProfileParameterTypeSubPara(ArrayOfSubProfileParameterType value) {
        return new JAXBElement<ArrayOfSubProfileParameterType>(_ProfileParameterTypeSubPara_QNAME, ArrayOfSubProfileParameterType.class, ProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "group", scope = ProfileParameterType.class)
    public JAXBElement<String> createProfileParameterTypeGroup(String value) {
        return new JAXBElement<String>(_ProfileParameterTypeGroup_QNAME, String.class, ProfileParameterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EERemoteObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "remoteobject", scope = J2EEGetRemoteObjectListResponseElement.class)
    public JAXBElement<ArrayOfJ2EERemoteObjectType> createJ2EEGetRemoteObjectListResponseElementRemoteobject(ArrayOfJ2EERemoteObjectType value) {
        return new JAXBElement<ArrayOfJ2EERemoteObjectType>(_J2EEGetRemoteObjectListResponseElementRemoteobject_QNAME, ArrayOfJ2EERemoteObjectType.class, J2EEGetRemoteObjectListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtask", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeSubtask(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeSubtask_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startTime", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeStartTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStartTime_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtaskupdateTime", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeSubtaskupdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeSubtaskupdateTime_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pool", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypePool(String value) {
        return new JAXBElement<String>(_J2EEThreadTypePool_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updateTime", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeUpdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeUpdateTime_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "task", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeTask(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeTask_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "classname", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeClassname(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeClassname_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeState(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeState_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeUser(String value) {
        return new JAXBElement<String>(_EnqLockTypeUser_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "taskupdateTime", scope = J2EEThreadType.class)
    public JAXBElement<String> createJ2EEThreadTypeTaskupdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeTaskupdateTime_QNAME, String.class, J2EEThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfileParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "parameter", scope = GetProcessParameterResponseElement.class)
    public JAXBElement<ArrayOfProfileParameterType> createGetProcessParameterResponseElementParameter(ArrayOfProfileParameterType value) {
        return new JAXBElement<ArrayOfProfileParameterType>(_GetProcessParameterResponseElementParameter_QNAME, ArrayOfProfileParameterType.class, GetProcessParameterResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRawSyslogEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "log", scope = ABAPReadRawSyslogResponseElement.class)
    public JAXBElement<ArrayOfRawSyslogEntryType> createABAPReadRawSyslogResponseElementLog(ArrayOfRawSyslogEntryType value) {
        return new JAXBElement<ArrayOfRawSyslogEntryType>(_ABAPReadRawSyslogResponseElementLog_QNAME, ArrayOfRawSyslogEntryType.class, ABAPReadRawSyslogResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startTime", scope = J2EEProcessType.class)
    public JAXBElement<String> createJ2EEProcessTypeStartTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStartTime_QNAME, String.class, J2EEProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restart", scope = J2EEProcessType.class)
    public JAXBElement<String> createJ2EEProcessTypeRestart(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeRestart_QNAME, String.class, J2EEProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = J2EEProcessType.class)
    public JAXBElement<String> createJ2EEProcessTypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, J2EEProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cpu", scope = J2EEProcessType.class)
    public JAXBElement<String> createJ2EEProcessTypeCpu(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeCpu_QNAME, String.class, J2EEProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exitCode", scope = J2EEProcessType.class)
    public JAXBElement<String> createJ2EEProcessTypeExitCode(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeExitCode_QNAME, String.class, J2EEProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "debug", scope = J2EEProcessType.class)
    public JAXBElement<String> createJ2EEProcessTypeDebug(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeDebug_QNAME, String.class, J2EEProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = J2EEProcessType.class)
    public JAXBElement<String> createJ2EEProcessTypeType(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeType_QNAME, String.class, J2EEProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "elapsedTime", scope = J2EEProcessType.class)
    public JAXBElement<String> createJ2EEProcessTypeElapsedTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeElapsedTime_QNAME, String.class, J2EEProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statetext", scope = J2EEProcessType.class)
    public JAXBElement<String> createJ2EEProcessTypeStatetext(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStatetext_QNAME, String.class, J2EEProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AppActive", scope = J2EEApplicationAliasType.class)
    public JAXBElement<String> createJ2EEApplicationAliasTypeAppActive(String value) {
        return new JAXBElement<String>(_J2EEApplicationAliasTypeAppActive_QNAME, String.class, J2EEApplicationAliasType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Alias", scope = J2EEApplicationAliasType.class)
    public JAXBElement<String> createJ2EEApplicationAliasTypeAlias(String value) {
        return new JAXBElement<String>(_J2EEApplicationAliasTypeAlias_QNAME, String.class, J2EEApplicationAliasType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AppName", scope = J2EEApplicationAliasType.class)
    public JAXBElement<String> createJ2EEApplicationAliasTypeAppName(String value) {
        return new JAXBElement<String>(_J2EEApplicationAliasTypeAppName_QNAME, String.class, J2EEApplicationAliasType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IgnoreCookie", scope = J2EEApplicationAliasType.class)
    public JAXBElement<String> createJ2EEApplicationAliasTypeIgnoreCookie(String value) {
        return new JAXBElement<String>(_J2EEApplicationAliasTypeIgnoreCookie_QNAME, String.class, J2EEApplicationAliasType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EESharedTableInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jsf", scope = J2EEGetSharedTableInfoResponseElement.class)
    public JAXBElement<ArrayOfJ2EESharedTableInfoType> createJ2EEGetSharedTableInfoResponseElementJsf(ArrayOfJ2EESharedTableInfoType value) {
        return new JAXBElement<ArrayOfJ2EESharedTableInfoType>(_J2EEGetSharedTableInfoResponseElementJsf_QNAME, ArrayOfJ2EESharedTableInfoType.class, J2EEGetSharedTableInfoResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startTime", scope = J2EEEJBSessionType.class)
    public JAXBElement<String> createJ2EEEJBSessionTypeStartTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStartTime_QNAME, String.class, J2EEEJBSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ejb", scope = J2EEEJBSessionType.class)
    public JAXBElement<String> createJ2EEEJBSessionTypeEjb(String value) {
        return new JAXBElement<String>(_J2EEEJBSessionTypeEjb_QNAME, String.class, J2EEEJBSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = J2EEEJBSessionType.class)
    public JAXBElement<String> createJ2EEEJBSessionTypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, J2EEEJBSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "application", scope = J2EEEJBSessionType.class)
    public JAXBElement<String> createJ2EEEJBSessionTypeApplication(String value) {
        return new JAXBElement<String>(_J2EEEJBSessionTypeApplication_QNAME, String.class, J2EEEJBSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transaction", scope = J2EEEJBSessionType.class)
    public JAXBElement<String> createJ2EEEJBSessionTypeTransaction(String value) {
        return new JAXBElement<String>(_EnqLockTypeTransaction_QNAME, String.class, J2EEEJBSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updateTime", scope = J2EEEJBSessionType.class)
    public JAXBElement<String> createJ2EEEJBSessionTypeUpdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeUpdateTime_QNAME, String.class, J2EEEJBSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "backingStore", scope = J2EEEJBSessionType.class)
    public JAXBElement<String> createJ2EEEJBSessionTypeBackingStore(String value) {
        return new JAXBElement<String>(_J2EEEJBSessionTypeBackingStore_QNAME, String.class, J2EEEJBSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state", scope = J2EEEJBSessionType.class)
    public JAXBElement<String> createJ2EEEJBSessionTypeState(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeState_QNAME, String.class, J2EEEJBSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user", scope = J2EEEJBSessionType.class)
    public JAXBElement<String> createJ2EEEJBSessionTypeUser(String value) {
        return new JAXBElement<String>(_EnqLockTypeUser_QNAME, String.class, J2EEEJBSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reference", scope = J2EEEJBSessionType.class)
    public JAXBElement<String> createJ2EEEJBSessionTypeReference(String value) {
        return new JAXBElement<String>(_J2EEEJBSessionTypeReference_QNAME, String.class, J2EEEJBSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "operation", scope = J2EEControlComponentsElement.class)
    public JAXBElement<String> createJ2EEControlComponentsElementOperation(String value) {
        return new JAXBElement<String>(_J2EEControlComponentsElementOperation_QNAME, String.class, J2EEControlComponentsElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processName", scope = J2EEControlComponentsElement.class)
    public JAXBElement<String> createJ2EEControlComponentsElementProcessName(String value) {
        return new JAXBElement<String>(_J2EEControlComponentsElementProcessName_QNAME, String.class, J2EEControlComponentsElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "componentNames", scope = J2EEControlComponentsElement.class)
    public JAXBElement<String> createJ2EEControlComponentsElementComponentNames(String value) {
        return new JAXBElement<String>(_J2EEControlComponentsElementComponentNames_QNAME, String.class, J2EEControlComponentsElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "componentType", scope = J2EEControlComponentsElement.class)
    public JAXBElement<String> createJ2EEControlComponentsElementComponentType(String value) {
        return new JAXBElement<String>(_J2EEControlComponentsElementComponentType_QNAME, String.class, J2EEControlComponentsElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EEComponentInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "component", scope = J2EEGetComponentListResponseElement.class)
    public JAXBElement<ArrayOfJ2EEComponentInfoType> createJ2EEGetComponentListResponseElementComponent(ArrayOfJ2EEComponentInfoType value) {
        return new JAXBElement<ArrayOfJ2EEComponentInfoType>(_J2EEGetComponentListResponseElementComponent_QNAME, ArrayOfJ2EEComponentInfoType.class, J2EEGetComponentListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startTime", scope = J2EESessionType.class)
    public JAXBElement<String> createJ2EESessionTypeStartTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStartTime_QNAME, String.class, J2EESessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = J2EESessionType.class)
    public JAXBElement<String> createJ2EESessionTypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, J2EESessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sticky", scope = J2EESessionType.class)
    public JAXBElement<String> createJ2EESessionTypeSticky(String value) {
        return new JAXBElement<String>(_J2EESessionTypeSticky_QNAME, String.class, J2EESessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updateTime", scope = J2EESessionType.class)
    public JAXBElement<String> createJ2EESessionTypeUpdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeUpdateTime_QNAME, String.class, J2EESessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "backingStore", scope = J2EESessionType.class)
    public JAXBElement<String> createJ2EESessionTypeBackingStore(String value) {
        return new JAXBElement<String>(_J2EEEJBSessionTypeBackingStore_QNAME, String.class, J2EESessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "corrupt", scope = J2EESessionType.class)
    public JAXBElement<String> createJ2EESessionTypeCorrupt(String value) {
        return new JAXBElement<String>(_J2EESessionTypeCorrupt_QNAME, String.class, J2EESessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "endcookie", scope = ReadLogFileResponseElement.class)
    public JAXBElement<String> createReadLogFileResponseElementEndcookie(String value) {
        return new JAXBElement<String>(_ReadLogFileResponseElementEndcookie_QNAME, String.class, ReadLogFileResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "format", scope = ReadLogFileResponseElement.class)
    public JAXBElement<String> createReadLogFileResponseElementFormat(String value) {
        return new JAXBElement<String>(_ReadLogFileResponseElementFormat_QNAME, String.class, ReadLogFileResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startcookie", scope = ReadLogFileResponseElement.class)
    public JAXBElement<String> createReadLogFileResponseElementStartcookie(String value) {
        return new JAXBElement<String>(_ReadLogFileResponseElementStartcookie_QNAME, String.class, ReadLogFileResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EEApplicationAliasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "alias", scope = J2EEGetApplicationAliasListResponseElement.class)
    public JAXBElement<ArrayOfJ2EEApplicationAliasType> createJ2EEGetApplicationAliasListResponseElementAlias(ArrayOfJ2EEApplicationAliasType value) {
        return new JAXBElement<ArrayOfJ2EEApplicationAliasType>(_J2EEGetApplicationAliasListResponseElementAlias_QNAME, ArrayOfJ2EEApplicationAliasType.class, J2EEGetApplicationAliasListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filename", scope = RequestLogonFileResponseElement.class)
    public JAXBElement<String> createRequestLogonFileResponseElementFilename(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeFilename_QNAME, String.class, RequestLogonFileResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHeapInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "heap", scope = J2EEGetVMHeapInfoResponseElement.class)
    public JAXBElement<ArrayOfHeapInfoType> createJ2EEGetVMHeapInfoResponseElementHeap(ArrayOfHeapInfoType value) {
        return new JAXBElement<ArrayOfHeapInfoType>(_J2EEGetVMHeapInfoResponseElementHeap_QNAME, ArrayOfHeapInfoType.class, J2EEGetVMHeapInfoResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cacheurl", scope = ICMCacheEntryType.class)
    public JAXBElement<String> createICMCacheEntryTypeCacheurl(String value) {
        return new JAXBElement<String>(_ICMCacheEntryTypeCacheurl_QNAME, String.class, ICMCacheEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cache", scope = ICMCacheEntryType.class)
    public JAXBElement<String> createICMCacheEntryTypeCache(String value) {
        return new JAXBElement<String>(_ICMCacheEntryTypeCache_QNAME, String.class, ICMCacheEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "expiration-time", scope = ICMCacheEntryType.class)
    public JAXBElement<String> createICMCacheEntryTypeExpirationTime(String value) {
        return new JAXBElement<String>(_ICMCacheEntryTypeExpirationTime_QNAME, String.class, ICMCacheEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = ICMCacheEntryType.class)
    public JAXBElement<String> createICMCacheEntryTypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, ICMCacheEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "last-access-time", scope = ICMCacheEntryType.class)
    public JAXBElement<String> createICMCacheEntryTypeLastAccessTime(String value) {
        return new JAXBElement<String>(_ICMCacheEntryTypeLastAccessTime_QNAME, String.class, ICMCacheEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creation-time", scope = ICMCacheEntryType.class)
    public JAXBElement<String> createICMCacheEntryTypeCreationTime(String value) {
        return new JAXBElement<String>(_ICMCacheEntryTypeCreationTime_QNAME, String.class, ICMCacheEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = J2EECacheType.class)
    public JAXBElement<String> createJ2EECacheTypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, J2EECacheType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updateTime", scope = J2EECacheType.class)
    public JAXBElement<String> createJ2EECacheTypeUpdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeUpdateTime_QNAME, String.class, J2EECacheType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = J2EECacheType.class)
    public JAXBElement<String> createJ2EECacheTypeType(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeType_QNAME, String.class, J2EECacheType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cachename", scope = J2EECacheType.class)
    public JAXBElement<String> createJ2EECacheTypeCachename(String value) {
        return new JAXBElement<String>(_J2EECacheTypeCachename_QNAME, String.class, J2EECacheType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = J2EEGetThreadTaskStackResponseElement.class)
    public JAXBElement<String> createJ2EEGetThreadTaskStackResponseElementName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, J2EEGetThreadTaskStackResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "starttime", scope = OSProcessType.class)
    public JAXBElement<String> createOSProcessTypeStarttime(String value) {
        return new JAXBElement<String>(_OSProcessTypeStarttime_QNAME, String.class, OSProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "elapsedtime", scope = OSProcessType.class)
    public JAXBElement<String> createOSProcessTypeElapsedtime(String value) {
        return new JAXBElement<String>(_OSProcessTypeElapsedtime_QNAME, String.class, OSProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = OSProcessType.class)
    public JAXBElement<String> createOSProcessTypeDescription(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeDescription_QNAME, String.class, OSProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = OSProcessType.class)
    public JAXBElement<String> createOSProcessTypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, OSProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "textstatus", scope = OSProcessType.class)
    public JAXBElement<String> createOSProcessTypeTextstatus(String value) {
        return new JAXBElement<String>(_OSProcessTypeTextstatus_QNAME, String.class, OSProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = ICMThreadType.class)
    public JAXBElement<String> createICMThreadTypeId(String value) {
        return new JAXBElement<String>(_ICMThreadTypeId_QNAME, String.class, ICMThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "status", scope = ICMThreadType.class)
    public JAXBElement<String> createICMThreadTypeStatus(String value) {
        return new JAXBElement<String>(_ICMThreadTypeStatus_QNAME, String.class, ICMThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = ICMThreadType.class)
    public JAXBElement<String> createICMThreadTypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, ICMThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requesttype", scope = ICMThreadType.class)
    public JAXBElement<String> createICMThreadTypeRequesttype(String value) {
        return new JAXBElement<String>(_ICMThreadTypeRequesttype_QNAME, String.class, ICMThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSyslogEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "log", scope = ABAPReadSyslogResponseElement.class)
    public JAXBElement<ArrayOfSyslogEntryType> createABAPReadSyslogResponseElementLog(ArrayOfSyslogEntryType value) {
        return new JAXBElement<ArrayOfSyslogEntryType>(_ABAPReadRawSyslogResponseElementLog_QNAME, ArrayOfSyslogEntryType.class, ABAPReadSyslogResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "key", scope = J2EEEnableDbgSessionResponseElement.class)
    public JAXBElement<String> createJ2EEEnableDbgSessionResponseElementKey(String value) {
        return new JAXBElement<String>(_GetSecNetworkIdResponseElementKey_QNAME, String.class, J2EEEnableDbgSessionResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "prioritylevel", scope = RestartSystemElement.class)
    public JAXBElement<String> createRestartSystemElementPrioritylevel(String value) {
        return new JAXBElement<String>(_StartSystemElementPrioritylevel_QNAME, String.class, RestartSystemElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "runlevel", scope = RestartSystemElement.class)
    public JAXBElement<String> createRestartSystemElementRunlevel(String value) {
        return new JAXBElement<String>(_StartSystemElementRunlevel_QNAME, String.class, RestartSystemElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfICMConnectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "connection", scope = ICMGetConnectionListResponseElement.class)
    public JAXBElement<ArrayOfICMConnectionType> createICMGetConnectionListResponseElementConnection(ArrayOfICMConnectionType value) {
        return new JAXBElement<ArrayOfICMConnectionType>(_ICMGetConnectionListResponseElementConnection_QNAME, ArrayOfICMConnectionType.class, ICMGetConnectionListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "runlevel", scope = RestartInstanceElement.class)
    public JAXBElement<String> createRestartInstanceElementRunlevel(String value) {
        return new JAXBElement<String>(_StartSystemElementRunlevel_QNAME, String.class, RestartInstanceElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Description", scope = AlertType.class)
    public JAXBElement<String> createAlertTypeDescription(String value) {
        return new JAXBElement<String>(_AlertTypeDescription_QNAME, String.class, AlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Time", scope = AlertType.class)
    public JAXBElement<String> createAlertTypeTime(String value) {
        return new JAXBElement<String>(_AlertTypeTime_QNAME, String.class, AlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Attribute", scope = AlertType.class)
    public JAXBElement<String> createAlertTypeAttribute(String value) {
        return new JAXBElement<String>(_AlertTypeAttribute_QNAME, String.class, AlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Tid", scope = AlertType.class)
    public JAXBElement<String> createAlertTypeTid(String value) {
        return new JAXBElement<String>(_AlertTypeTid_QNAME, String.class, AlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Aid", scope = AlertType.class)
    public JAXBElement<String> createAlertTypeAid(String value) {
        return new JAXBElement<String>(_AlertTypeAid_QNAME, String.class, AlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Object", scope = AlertType.class)
    public JAXBElement<String> createAlertTypeObject(String value) {
        return new JAXBElement<String>(_AlertTypeObject_QNAME, String.class, AlertType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "int-max", scope = ParameterRestrictionType.class)
    public JAXBElement<Long> createParameterRestrictionTypeIntMax(Long value) {
        return new JAXBElement<Long>(_ParameterRestrictionTypeIntMax_QNAME, Long.class, ParameterRestrictionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "float-max", scope = ParameterRestrictionType.class)
    public JAXBElement<Double> createParameterRestrictionTypeFloatMax(Double value) {
        return new JAXBElement<Double>(_ParameterRestrictionTypeFloatMax_QNAME, Double.class, ParameterRestrictionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "float-min", scope = ParameterRestrictionType.class)
    public JAXBElement<Double> createParameterRestrictionTypeFloatMin(Double value) {
        return new JAXBElement<Double>(_ParameterRestrictionTypeFloatMin_QNAME, Double.class, ParameterRestrictionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "valuemap", scope = ParameterRestrictionType.class)
    public JAXBElement<ArrayOfStringType> createParameterRestrictionTypeValuemap(ArrayOfStringType value) {
        return new JAXBElement<ArrayOfStringType>(_ParameterRestrictionTypeValuemap_QNAME, ArrayOfStringType.class, ParameterRestrictionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "int-min", scope = ParameterRestrictionType.class)
    public JAXBElement<Long> createParameterRestrictionTypeIntMin(Long value) {
        return new JAXBElement<Long>(_ParameterRestrictionTypeIntMin_QNAME, Long.class, ParameterRestrictionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "logfiles", scope = GetLogFileListResponseElement.class)
    public JAXBElement<ArrayOfStringType> createGetLogFileListResponseElementLogfiles(ArrayOfStringType value) {
        return new JAXBElement<ArrayOfStringType>(_GetLogFileListResponseElementLogfiles_QNAME, ArrayOfStringType.class, GetLogFileListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "details", scope = J2EEComponentInfoType.class)
    public JAXBElement<String> createJ2EEComponentInfoTypeDetails(String value) {
        return new JAXBElement<String>(_J2EEComponentInfoTypeDetails_QNAME, String.class, J2EEComponentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "status", scope = J2EEComponentInfoType.class)
    public JAXBElement<String> createJ2EEComponentInfoTypeStatus(String value) {
        return new JAXBElement<String>(_ICMThreadTypeStatus_QNAME, String.class, J2EEComponentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = J2EEComponentInfoType.class)
    public JAXBElement<String> createJ2EEComponentInfoTypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, J2EEComponentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "expectedstatus", scope = J2EEComponentInfoType.class)
    public JAXBElement<String> createJ2EEComponentInfoTypeExpectedstatus(String value) {
        return new JAXBElement<String>(_J2EEComponentInfoTypeExpectedstatus_QNAME, String.class, J2EEComponentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startupmode", scope = J2EEComponentInfoType.class)
    public JAXBElement<String> createJ2EEComponentInfoTypeStartupmode(String value) {
        return new JAXBElement<String>(_J2EEComponentInfoTypeStartupmode_QNAME, String.class, J2EEComponentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = J2EEComponentInfoType.class)
    public JAXBElement<String> createJ2EEComponentInfoTypeType(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeType_QNAME, String.class, J2EEComponentInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = ReadDeveloperTraceResponseElement.class)
    public JAXBElement<String> createReadDeveloperTraceResponseElementName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, ReadDeveloperTraceResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EEThreadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "thread", scope = J2EEGetThreadListResponseElement.class)
    public JAXBElement<ArrayOfJ2EEThreadType> createJ2EEGetThreadListResponseElementThread(ArrayOfJ2EEThreadType value) {
        return new JAXBElement<ArrayOfJ2EEThreadType>(_J2EEGetThreadListResponseElementThread_QNAME, ArrayOfJ2EEThreadType.class, J2EEGetThreadListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HASAPInterfaceVersion", scope = HAGetFailoverConfigResponseElement.class)
    public JAXBElement<String> createHAGetFailoverConfigResponseElementHASAPInterfaceVersion(String value) {
        return new JAXBElement<String>(_HAGetFailoverConfigResponseElementHASAPInterfaceVersion_QNAME, String.class, HAGetFailoverConfigResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HAActiveNode", scope = HAGetFailoverConfigResponseElement.class)
    public JAXBElement<String> createHAGetFailoverConfigResponseElementHAActiveNode(String value) {
        return new JAXBElement<String>(_HAGetFailoverConfigResponseElementHAActiveNode_QNAME, String.class, HAGetFailoverConfigResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HAProductVersion", scope = HAGetFailoverConfigResponseElement.class)
    public JAXBElement<String> createHAGetFailoverConfigResponseElementHAProductVersion(String value) {
        return new JAXBElement<String>(_HAGetFailoverConfigResponseElementHAProductVersion_QNAME, String.class, HAGetFailoverConfigResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HADocumentation", scope = HAGetFailoverConfigResponseElement.class)
    public JAXBElement<String> createHAGetFailoverConfigResponseElementHADocumentation(String value) {
        return new JAXBElement<String>(_HAGetFailoverConfigResponseElementHADocumentation_QNAME, String.class, HAGetFailoverConfigResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snapshots", scope = DeleteSnapshotsElement.class)
    public JAXBElement<ArrayOfStringType> createDeleteSnapshotsElementSnapshots(ArrayOfStringType value) {
        return new JAXBElement<ArrayOfStringType>(_DeleteSnapshotsElementSnapshots_QNAME, ArrayOfStringType.class, DeleteSnapshotsElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EEThread2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "thread", scope = J2EEGetThreadList2ResponseElement.class)
    public JAXBElement<ArrayOfJ2EEThread2Type> createJ2EEGetThreadList2ResponseElementThread(ArrayOfJ2EEThread2Type value) {
        return new JAXBElement<ArrayOfJ2EEThread2Type>(_J2EEGetThreadListResponseElementThread_QNAME, ArrayOfJ2EEThread2Type.class, J2EEGetThreadList2ResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "format", scope = AnalyseLogFilesResponseElement.class)
    public JAXBElement<String> createAnalyseLogFilesResponseElementFormat(String value) {
        return new JAXBElement<String>(_ReadLogFileResponseElementFormat_QNAME, String.class, AnalyseLogFilesResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfICMProxyConnectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "connection", scope = ICMGetProxyConnectionListResponseElement.class)
    public JAXBElement<ArrayOfICMProxyConnectionType> createICMGetProxyConnectionListResponseElementConnection(ArrayOfICMProxyConnectionType value) {
        return new JAXBElement<ArrayOfICMProxyConnectionType>(_ICMGetConnectionListResponseElementConnection_QNAME, ArrayOfICMProxyConnectionType.class, ICMGetProxyConnectionListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtask", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeSubtask(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeSubtask_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startTime", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeStartTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStartTime_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtaskupdateTime", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeSubtaskupdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeSubtaskupdateTime_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pool", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypePool(String value) {
        return new JAXBElement<String>(_J2EEThreadTypePool_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updateTime", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeUpdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeUpdateTime_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "task", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeTask(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeTask_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "classname", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeClassname(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeClassname_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeState(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeState_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeUser(String value) {
        return new JAXBElement<String>(_EnqLockTypeUser_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "taskupdateTime", scope = J2EEThread2Type.class)
    public JAXBElement<String> createJ2EEThread2TypeTaskupdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeTaskupdateTime_QNAME, String.class, J2EEThread2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = GetStartProfileResponseElement.class)
    public JAXBElement<String> createGetStartProfileResponseElementName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, GetStartProfileResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modtime", scope = LogFileType.class)
    public JAXBElement<String> createLogFileTypeModtime(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeModtime_QNAME, String.class, LogFileType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filename", scope = LogFileType.class)
    public JAXBElement<String> createLogFileTypeFilename(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeFilename_QNAME, String.class, LogFileType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "format", scope = LogFileType.class)
    public JAXBElement<String> createLogFileTypeFormat(String value) {
        return new JAXBElement<String>(_ReadLogFileResponseElementFormat_QNAME, String.class, LogFileType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = HACheckType.class)
    public JAXBElement<String> createHACheckTypeDescription(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeDescription_QNAME, String.class, HACheckType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "comment", scope = HACheckType.class)
    public JAXBElement<String> createHACheckTypeComment(String value) {
        return new JAXBElement<String>(_HACheckTypeComment_QNAME, String.class, HACheckType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = J2EEClusterMsgType.class)
    public JAXBElement<String> createJ2EEClusterMsgTypeId(String value) {
        return new JAXBElement<String>(_ICMThreadTypeId_QNAME, String.class, J2EEClusterMsgType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "service", scope = J2EEClusterMsgType.class)
    public JAXBElement<String> createJ2EEClusterMsgTypeService(String value) {
        return new JAXBElement<String>(_J2EEClusterMsgTypeService_QNAME, String.class, J2EEClusterMsgType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "workprocess", scope = ABAPGetWPTableResponseElement.class)
    public JAXBElement<ArrayOfWorkProcessType> createABAPGetWPTableResponseElementWorkprocess(ArrayOfWorkProcessType value) {
        return new JAXBElement<ArrayOfWorkProcessType>(_ABAPGetWPTableResponseElementWorkprocess_QNAME, ArrayOfWorkProcessType.class, ABAPGetWPTableResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startTime", scope = J2EEWebSessionType.class)
    public JAXBElement<String> createJ2EEWebSessionTypeStartTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStartTime_QNAME, String.class, J2EEWebSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = J2EEWebSessionType.class)
    public JAXBElement<String> createJ2EEWebSessionTypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, J2EEWebSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updateTime", scope = J2EEWebSessionType.class)
    public JAXBElement<String> createJ2EEWebSessionTypeUpdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeUpdateTime_QNAME, String.class, J2EEWebSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "backingStore", scope = J2EEWebSessionType.class)
    public JAXBElement<String> createJ2EEWebSessionTypeBackingStore(String value) {
        return new JAXBElement<String>(_J2EEEJBSessionTypeBackingStore_QNAME, String.class, J2EEWebSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state", scope = J2EEWebSessionType.class)
    public JAXBElement<String> createJ2EEWebSessionTypeState(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeState_QNAME, String.class, J2EEWebSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user", scope = J2EEWebSessionType.class)
    public JAXBElement<String> createJ2EEWebSessionTypeUser(String value) {
        return new JAXBElement<String>(_EnqLockTypeUser_QNAME, String.class, J2EEWebSessionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHACheckType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "check", scope = HACheckFailoverConfigResponseElement.class)
    public JAXBElement<ArrayOfHACheckType> createHACheckFailoverConfigResponseElementCheck(ArrayOfHACheckType value) {
        return new JAXBElement<ArrayOfHACheckType>(_HACheckFailoverConfigResponseElementCheck_QNAME, ArrayOfHACheckType.class, HACheckFailoverConfigResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnqLockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lock", scope = EnqGetLockTableResponseElement.class)
    public JAXBElement<ArrayOfEnqLockType> createEnqGetLockTableResponseElementLock(ArrayOfEnqLockType value) {
        return new JAXBElement<ArrayOfEnqLockType>(_EnqRemoveLocksElementLock_QNAME, ArrayOfEnqLockType.class, EnqGetLockTableResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfICMThreadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "thread", scope = ICMGetThreadListResponseElement.class)
    public JAXBElement<ArrayOfICMThreadType> createICMGetThreadListResponseElementThread(ArrayOfICMThreadType value) {
        return new JAXBElement<ArrayOfICMThreadType>(_J2EEGetThreadListResponseElementThread_QNAME, ArrayOfICMThreadType.class, ICMGetThreadListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "failover-status", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypeFailoverStatus(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeFailoverStatus_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "external-convid", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypeExternalConvid(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeExternalConvid_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "status", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypeStatus(String value) {
        return new JAXBElement<String>(_ICMThreadTypeStatus_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "local-address", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypeLocalAddress(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeLocalAddress_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "conid", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypeConid(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeConid_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tid-uid-mode", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypeTidUidMode(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeTidUidMode_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "peer-address", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypePeerAddress(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypePeerAddress_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "disconnect-time", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypeDisconnectTime(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeDisconnectTime_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "role", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypeRole(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeRole_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snc-context-length", scope = ICMProxyConnectionType.class)
    public JAXBElement<Integer> createICMProxyConnectionTypeSncContextLength(Integer value) {
        return new JAXBElement<Integer>(_ICMProxyConnectionTypeSncContextLength_QNAME, Integer.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "partner", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypePartner(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypePartner_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "objectid", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypeObjectid(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeObjectid_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "internal-convid", scope = ICMProxyConnectionType.class)
    public JAXBElement<String> createICMProxyConnectionTypeInternalConvid(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeInternalConvid_QNAME, String.class, ICMProxyConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value", scope = ParameterValueResponseElement.class)
    public JAXBElement<String> createParameterValueResponseElementValue(String value) {
        return new JAXBElement<String>(_SetProfileParameterTypeValue_QNAME, String.class, ParameterValueResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "User", scope = SyslogEntryType.class)
    public JAXBElement<String> createSyslogEntryTypeUser(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeUser_QNAME, String.class, SyslogEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Text", scope = SyslogEntryType.class)
    public JAXBElement<String> createSyslogEntryTypeText(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeText_QNAME, String.class, SyslogEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Time", scope = SyslogEntryType.class)
    public JAXBElement<String> createSyslogEntryTypeTime(String value) {
        return new JAXBElement<String>(_AlertTypeTime_QNAME, String.class, SyslogEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Tcode", scope = SyslogEntryType.class)
    public JAXBElement<String> createSyslogEntryTypeTcode(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeTcode_QNAME, String.class, SyslogEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MNo", scope = SyslogEntryType.class)
    public JAXBElement<String> createSyslogEntryTypeMNo(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeMNo_QNAME, String.class, SyslogEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Typ", scope = SyslogEntryType.class)
    public JAXBElement<String> createSyslogEntryTypeTyp(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeTyp_QNAME, String.class, SyslogEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Client", scope = SyslogEntryType.class)
    public JAXBElement<String> createSyslogEntryTypeClient(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeClient_QNAME, String.class, SyslogEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstancePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "properties", scope = GetInstancePropertiesResponseElement.class)
    public JAXBElement<ArrayOfInstancePropertiesType> createGetInstancePropertiesResponseElementProperties(ArrayOfInstancePropertiesType value) {
        return new JAXBElement<ArrayOfInstancePropertiesType>(_GetInstancePropertiesResponseElementProperties_QNAME, ArrayOfInstancePropertiesType.class, GetInstancePropertiesResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = J2EEGetThreadCallStackResponseElement.class)
    public JAXBElement<String> createJ2EEGetThreadCallStackResponseElementName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, J2EEGetThreadCallStackResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "env", scope = GetEnvironmentResponseElement.class)
    public JAXBElement<ArrayOfStringType> createGetEnvironmentResponseElementEnv(ArrayOfStringType value) {
        return new JAXBElement<ArrayOfStringType>(_GetEnvironmentResponseElementEnv_QNAME, ArrayOfStringType.class, GetEnvironmentResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Time", scope = AlertNodeType.class)
    public JAXBElement<String> createAlertNodeTypeTime(String value) {
        return new JAXBElement<String>(_AlertTypeTime_QNAME, String.class, AlertNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AlTime", scope = AlertNodeType.class)
    public JAXBElement<String> createAlertNodeTypeAlTime(String value) {
        return new JAXBElement<String>(_AlertNodeTypeAlTime_QNAME, String.class, AlertNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = AlertNodeType.class)
    public JAXBElement<String> createAlertNodeTypeDescription(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeDescription_QNAME, String.class, AlertNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = AlertNodeType.class)
    public JAXBElement<String> createAlertNodeTypeName(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeName_QNAME, String.class, AlertNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AnalyseTool", scope = AlertNodeType.class)
    public JAXBElement<String> createAlertNodeTypeAnalyseTool(String value) {
        return new JAXBElement<String>(_AlertNodeTypeAnalyseTool_QNAME, String.class, AlertNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Tid", scope = AlertNodeType.class)
    public JAXBElement<String> createAlertNodeTypeTid(String value) {
        return new JAXBElement<String>(_AlertTypeTid_QNAME, String.class, AlertNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AlDescription", scope = AlertNodeType.class)
    public JAXBElement<String> createAlertNodeTypeAlDescription(String value) {
        return new JAXBElement<String>(_AlertNodeTypeAlDescription_QNAME, String.class, AlertNodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EECache2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cache", scope = J2EEGetCacheStatistic2ResponseElement.class)
    public JAXBElement<ArrayOfJ2EECache2Type> createJ2EEGetCacheStatistic2ResponseElementCache(ArrayOfJ2EECache2Type value) {
        return new JAXBElement<ArrayOfJ2EECache2Type>(_ICMCacheEntryTypeCache_QNAME, ArrayOfJ2EECache2Type.class, J2EEGetCacheStatistic2ResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHACheckType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "check", scope = HACheckConfigResponseElement.class)
    public JAXBElement<ArrayOfHACheckType> createHACheckConfigResponseElementCheck(ArrayOfHACheckType value) {
        return new JAXBElement<ArrayOfHACheckType>(_HACheckFailoverConfigResponseElementCheck_QNAME, ArrayOfHACheckType.class, HACheckConfigResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processtype", scope = GetProcessParameterElement.class)
    public JAXBElement<String> createGetProcessParameterElementProcesstype(String value) {
        return new JAXBElement<String>(_GetProcessParameterElementProcesstype_QNAME, String.class, GetProcessParameterElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EECacheType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cache", scope = J2EEGetCacheStatisticResponseElement.class)
    public JAXBElement<ArrayOfJ2EECacheType> createJ2EEGetCacheStatisticResponseElementCache(ArrayOfJ2EECacheType value) {
        return new JAXBElement<ArrayOfJ2EECacheType>(_ICMCacheEntryTypeCache_QNAME, ArrayOfJ2EECacheType.class, J2EEGetCacheStatisticResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = J2EEEnableDbgSessionElement.class)
    public JAXBElement<String> createJ2EEEnableDbgSessionElementProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, J2EEEnableDbgSessionElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flags", scope = J2EEEnableDbgSessionElement.class)
    public JAXBElement<String> createJ2EEEnableDbgSessionElementFlags(String value) {
        return new JAXBElement<String>(_J2EEEnableDbgSessionElementFlags_QNAME, String.class, J2EEEnableDbgSessionElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Time", scope = InstanceVersionInfoType.class)
    public JAXBElement<String> createInstanceVersionInfoTypeTime(String value) {
        return new JAXBElement<String>(_AlertTypeTime_QNAME, String.class, InstanceVersionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VersionInfo", scope = InstanceVersionInfoType.class)
    public JAXBElement<String> createInstanceVersionInfoTypeVersionInfo(String value) {
        return new JAXBElement<String>(_InstanceVersionInfoTypeVersionInfo_QNAME, String.class, InstanceVersionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Filename", scope = InstanceVersionInfoType.class)
    public JAXBElement<String> createInstanceVersionInfoTypeFilename(String value) {
        return new JAXBElement<String>(_InstanceVersionInfoTypeFilename_QNAME, String.class, InstanceVersionInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "peer-address", scope = ICMConnectionType.class)
    public JAXBElement<String> createICMConnectionTypePeerAddress(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypePeerAddress_QNAME, String.class, ICMConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "protocol", scope = ICMConnectionType.class)
    public JAXBElement<String> createICMConnectionTypeProtocol(String value) {
        return new JAXBElement<String>(_ICMConnectionTypeProtocol_QNAME, String.class, ICMConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "connection-time", scope = ICMConnectionType.class)
    public JAXBElement<String> createICMConnectionTypeConnectionTime(String value) {
        return new JAXBElement<String>(_ICMConnectionTypeConnectionTime_QNAME, String.class, ICMConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "local-address", scope = ICMConnectionType.class)
    public JAXBElement<String> createICMConnectionTypeLocalAddress(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeLocalAddress_QNAME, String.class, ICMConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "role", scope = ICMConnectionType.class)
    public JAXBElement<String> createICMConnectionTypeRole(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeRole_QNAME, String.class, ICMConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requesttype", scope = ICMConnectionType.class)
    public JAXBElement<String> createICMConnectionTypeRequesttype(String value) {
        return new JAXBElement<String>(_ICMThreadTypeRequesttype_QNAME, String.class, ICMConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "conid", scope = ICMConnectionType.class)
    public JAXBElement<String> createICMConnectionTypeConid(String value) {
        return new JAXBElement<String>(_ICMProxyConnectionTypeConid_QNAME, String.class, ICMConnectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "endtime", scope = AnalyseLogFilesElement.class)
    public JAXBElement<String> createAnalyseLogFilesElementEndtime(String value) {
        return new JAXBElement<String>(_AnalyseLogFilesElementEndtime_QNAME, String.class, AnalyseLogFilesElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "starttime", scope = AnalyseLogFilesElement.class)
    public JAXBElement<String> createAnalyseLogFilesElementStarttime(String value) {
        return new JAXBElement<String>(_OSProcessTypeStarttime_QNAME, String.class, AnalyseLogFilesElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "prioritylevel", scope = StopSystemElement.class)
    public JAXBElement<String> createStopSystemElementPrioritylevel(String value) {
        return new JAXBElement<String>(_StartSystemElementPrioritylevel_QNAME, String.class, StopSystemElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWebDispServerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "server", scope = WebDispGetServerListResponseElement.class)
    public JAXBElement<ArrayOfWebDispServerType> createWebDispGetServerListResponseElementServer(ArrayOfWebDispServerType value) {
        return new JAXBElement<ArrayOfWebDispServerType>(_WebDispGetServerListResponseElementServer_QNAME, ArrayOfWebDispServerType.class, WebDispGetServerListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfICMCacheEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "entry", scope = ICMGetCacheEntriesResponseElement.class)
    public JAXBElement<ArrayOfICMCacheEntryType> createICMGetCacheEntriesResponseElementEntry(ArrayOfICMCacheEntryType value) {
        return new JAXBElement<ArrayOfICMCacheEntryType>(_ICMGetCacheEntriesResponseElementEntry_QNAME, ArrayOfICMCacheEntryType.class, ICMGetCacheEntriesResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = AccessPointType.class)
    public JAXBElement<String> createAccessPointTypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, AccessPointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "protocol", scope = AccessPointType.class)
    public JAXBElement<String> createAccessPointTypeProtocol(String value) {
        return new JAXBElement<String>(_ICMConnectionTypeProtocol_QNAME, String.class, AccessPointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address", scope = AccessPointType.class)
    public JAXBElement<String> createAccessPointTypeAddress(String value) {
        return new JAXBElement<String>(_AccessPointTypeAddress_QNAME, String.class, AccessPointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "active", scope = AccessPointType.class)
    public JAXBElement<String> createAccessPointTypeActive(String value) {
        return new JAXBElement<String>(_AccessPointTypeActive_QNAME, String.class, AccessPointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGCInfo2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gc", scope = J2EEGetVMGCHistory2ResponseElement.class)
    public JAXBElement<ArrayOfGCInfo2Type> createJ2EEGetVMGCHistory2ResponseElementGc(ArrayOfGCInfo2Type value) {
        return new JAXBElement<ArrayOfGCInfo2Type>(_J2EEGetVMGCHistoryResponseElementGc_QNAME, ArrayOfGCInfo2Type.class, J2EEGetVMGCHistory2ResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EEEJBSessionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ejbsession", scope = J2EEGetEJBSessionListResponseElement.class)
    public JAXBElement<ArrayOfJ2EEEJBSessionType> createJ2EEGetEJBSessionListResponseElementEjbsession(ArrayOfJ2EEEJBSessionType value) {
        return new JAXBElement<ArrayOfJ2EEEJBSessionType>(_J2EEGetEJBSessionListResponseElementEjbsession_QNAME, ArrayOfJ2EEEJBSessionType.class, J2EEGetEJBSessionListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "runlevel", scope = InstanceStartElement.class)
    public JAXBElement<String> createInstanceStartElementRunlevel(String value) {
        return new JAXBElement<String>(_StartSystemElementRunlevel_QNAME, String.class, InstanceStartElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "User", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeUser(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeUser_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Err", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeErr(String value) {
        return new JAXBElement<String>(_WorkProcessTypeErr_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Start", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeStart(String value) {
        return new JAXBElement<String>(_WorkProcessTypeStart_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Sem", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeSem(String value) {
        return new JAXBElement<String>(_WorkProcessTypeSem_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Table", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeTable(String value) {
        return new JAXBElement<String>(_WorkProcessTypeTable_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Typ", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeTyp(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeTyp_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Status", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeStatus(String value) {
        return new JAXBElement<String>(_WorkProcessTypeStatus_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cpu", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeCpu(String value) {
        return new JAXBElement<String>(_WorkProcessTypeCpu_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Time", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeTime(String value) {
        return new JAXBElement<String>(_AlertTypeTime_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Action", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeAction(String value) {
        return new JAXBElement<String>(_WorkProcessTypeAction_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Program", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeProgram(String value) {
        return new JAXBElement<String>(_WorkProcessTypeProgram_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Client", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeClient(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeClient_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Reason", scope = WorkProcessType.class)
    public JAXBElement<String> createWorkProcessTypeReason(String value) {
        return new JAXBElement<String>(_WorkProcessTypeReason_QNAME, String.class, WorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "challenge", scope = GetSecNetworkIdElement.class)
    public JAXBElement<String> createGetSecNetworkIdElementChallenge(String value) {
        return new JAXBElement<String>(_GetSecNetworkIdElementChallenge_QNAME, String.class, GetSecNetworkIdElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSystemWorkProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "workprocess", scope = ABAPGetSystemWPTableResponseElement.class)
    public JAXBElement<ArrayOfSystemWorkProcessType> createABAPGetSystemWPTableResponseElementWorkprocess(ArrayOfSystemWorkProcessType value) {
        return new JAXBElement<ArrayOfSystemWorkProcessType>(_ABAPGetWPTableResponseElementWorkprocess_QNAME, ArrayOfSystemWorkProcessType.class, ABAPGetSystemWPTableResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "protocolfile", scope = OSExecuteElement.class)
    public JAXBElement<String> createOSExecuteElementProtocolfile(String value) {
        return new JAXBElement<String>(_OSExecuteElementProtocolfile_QNAME, String.class, OSExecuteElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = J2EECache2Type.class)
    public JAXBElement<String> createJ2EECache2TypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, J2EECache2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updateTime", scope = J2EECache2Type.class)
    public JAXBElement<String> createJ2EECache2TypeUpdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeUpdateTime_QNAME, String.class, J2EECache2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = J2EECache2Type.class)
    public JAXBElement<String> createJ2EECache2TypeDescription(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeDescription_QNAME, String.class, J2EECache2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "owner", scope = J2EECache2Type.class)
    public JAXBElement<String> createJ2EECache2TypeOwner(String value) {
        return new JAXBElement<String>(_EnqLockTypeOwner_QNAME, String.class, J2EECache2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = J2EECache2Type.class)
    public JAXBElement<String> createJ2EECache2TypeType(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeType_QNAME, String.class, J2EECache2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSnapshotInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snapshots", scope = ListSnapshotsResponseElement.class)
    public JAXBElement<ArrayOfSnapshotInfoType> createListSnapshotsResponseElementSnapshots(ArrayOfSnapshotInfoType value) {
        return new JAXBElement<ArrayOfSnapshotInfoType>(_DeleteSnapshotsElementSnapshots_QNAME, ArrayOfSnapshotInfoType.class, ListSnapshotsResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RootTidName", scope = GetAlertsResponseElement.class)
    public JAXBElement<String> createGetAlertsResponseElementRootTidName(String value) {
        return new JAXBElement<String>(_GetAlertsResponseElementRootTidName_QNAME, String.class, GetAlertsResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "logfiles", scope = ConfigureLogFileListElement.class)
    public JAXBElement<ArrayOfStringType> createConfigureLogFileListElementLogfiles(ArrayOfStringType value) {
        return new JAXBElement<ArrayOfStringType>(_GetLogFileListResponseElementLogfiles_QNAME, ArrayOfStringType.class, ConfigureLogFileListElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startTime", scope = GCInfoType.class)
    public JAXBElement<String> createGCInfoTypeStartTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStartTime_QNAME, String.class, GCInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = GCInfoType.class)
    public JAXBElement<String> createGCInfoTypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, GCInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reason", scope = GCInfoType.class)
    public JAXBElement<String> createGCInfoTypeReason(String value) {
        return new JAXBElement<String>(_GCInfo2TypeReason_QNAME, String.class, GCInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = GCInfoType.class)
    public JAXBElement<String> createGCInfoTypeType(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeType_QNAME, String.class, GCInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "key", scope = GetNetworkIdResponseElement.class)
    public JAXBElement<String> createGetNetworkIdResponseElementKey(String value) {
        return new JAXBElement<String>(_GetSecNetworkIdResponseElementKey_QNAME, String.class, GetNetworkIdResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDirEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "file", scope = ListDeveloperTracesResponseElement.class)
    public JAXBElement<ArrayOfDirEntryType> createListDeveloperTracesResponseElementFile(ArrayOfDirEntryType value) {
        return new JAXBElement<ArrayOfDirEntryType>(_ListLogFilesResponseElementFile_QNAME, ArrayOfDirEntryType.class, ListDeveloperTracesResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modtime", scope = DirEntryType.class)
    public JAXBElement<String> createDirEntryTypeModtime(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeModtime_QNAME, String.class, DirEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filename", scope = DirEntryType.class)
    public JAXBElement<String> createDirEntryTypeFilename(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeFilename_QNAME, String.class, DirEntryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Typ", scope = TaskHandlerQueueType.class)
    public JAXBElement<String> createTaskHandlerQueueTypeTyp(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeTyp_QNAME, String.class, TaskHandlerQueueType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startTime", scope = J2EEWebSession2Type.class)
    public JAXBElement<String> createJ2EEWebSession2TypeStartTime(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeStartTime_QNAME, String.class, J2EEWebSession2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = J2EEWebSession2Type.class)
    public JAXBElement<String> createJ2EEWebSession2TypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, J2EEWebSession2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updateTime", scope = J2EEWebSession2Type.class)
    public JAXBElement<String> createJ2EEWebSession2TypeUpdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeUpdateTime_QNAME, String.class, J2EEWebSession2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "backingStore", scope = J2EEWebSession2Type.class)
    public JAXBElement<String> createJ2EEWebSession2TypeBackingStore(String value) {
        return new JAXBElement<String>(_J2EEEJBSessionTypeBackingStore_QNAME, String.class, J2EEWebSession2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state", scope = J2EEWebSession2Type.class)
    public JAXBElement<String> createJ2EEWebSession2TypeState(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeState_QNAME, String.class, J2EEWebSession2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AppName", scope = J2EEWebSession2Type.class)
    public JAXBElement<String> createJ2EEWebSession2TypeAppName(String value) {
        return new JAXBElement<String>(_J2EEApplicationAliasTypeAppName_QNAME, String.class, J2EEWebSession2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user", scope = J2EEWebSession2Type.class)
    public JAXBElement<String> createJ2EEWebSession2TypeUser(String value) {
        return new JAXBElement<String>(_EnqLockTypeUser_QNAME, String.class, J2EEWebSession2Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filename", scope = CreateSnapshotResponseElement.class)
    public JAXBElement<String> createCreateSnapshotResponseElementFilename(String value) {
        return new JAXBElement<String>(_SnapshotInfoTypeFilename_QNAME, String.class, CreateSnapshotResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EESessionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "session", scope = J2EEGetSessionListResponseElement.class)
    public JAXBElement<ArrayOfJ2EESessionType> createJ2EEGetSessionListResponseElementSession(ArrayOfJ2EESessionType value) {
        return new JAXBElement<ArrayOfJ2EESessionType>(_J2EEGetWebSessionList2ResponseElementSession_QNAME, ArrayOfJ2EESessionType.class, J2EEGetSessionListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processname", scope = J2EERemoteObjectType.class)
    public JAXBElement<String> createJ2EERemoteObjectTypeProcessname(String value) {
        return new JAXBElement<String>(_HeapInfoTypeProcessname_QNAME, String.class, J2EERemoteObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "protocol", scope = J2EERemoteObjectType.class)
    public JAXBElement<String> createJ2EERemoteObjectTypeProtocol(String value) {
        return new JAXBElement<String>(_ICMConnectionTypeProtocol_QNAME, String.class, J2EERemoteObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updateTime", scope = J2EERemoteObjectType.class)
    public JAXBElement<String> createJ2EERemoteObjectTypeUpdateTime(String value) {
        return new JAXBElement<String>(_J2EEThreadTypeUpdateTime_QNAME, String.class, J2EERemoteObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address", scope = J2EERemoteObjectType.class)
    public JAXBElement<String> createJ2EERemoteObjectTypeAddress(String value) {
        return new JAXBElement<String>(_AccessPointTypeAddress_QNAME, String.class, J2EERemoteObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "direction", scope = J2EERemoteObjectType.class)
    public JAXBElement<String> createJ2EERemoteObjectTypeDirection(String value) {
        return new JAXBElement<String>(_J2EERemoteObjectTypeDirection_QNAME, String.class, J2EERemoteObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creationTime", scope = J2EERemoteObjectType.class)
    public JAXBElement<String> createJ2EERemoteObjectTypeCreationTime(String value) {
        return new JAXBElement<String>(_J2EERemoteObjectTypeCreationTime_QNAME, String.class, J2EERemoteObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "host", scope = BootstrapElement.class)
    public JAXBElement<String> createBootstrapElementHost(String value) {
        return new JAXBElement<String>(_J2EEControlClusterElementHost_QNAME, String.class, BootstrapElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EEWebSessionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "session", scope = J2EEGetWebSessionListResponseElement.class)
    public JAXBElement<ArrayOfJ2EEWebSessionType> createJ2EEGetWebSessionListResponseElementSession(ArrayOfJ2EEWebSessionType value) {
        return new JAXBElement<ArrayOfJ2EEWebSessionType>(_J2EEGetWebSessionList2ResponseElementSession_QNAME, ArrayOfJ2EEWebSessionType.class, J2EEGetWebSessionListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "User", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeUser(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeUser_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Instance", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeInstance(String value) {
        return new JAXBElement<String>(_SystemWorkProcessTypeInstance_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Err", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeErr(String value) {
        return new JAXBElement<String>(_WorkProcessTypeErr_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Start", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeStart(String value) {
        return new JAXBElement<String>(_WorkProcessTypeStart_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Sem", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeSem(String value) {
        return new JAXBElement<String>(_WorkProcessTypeSem_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Table", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeTable(String value) {
        return new JAXBElement<String>(_WorkProcessTypeTable_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Typ", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeTyp(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeTyp_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Status", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeStatus(String value) {
        return new JAXBElement<String>(_WorkProcessTypeStatus_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cpu", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeCpu(String value) {
        return new JAXBElement<String>(_WorkProcessTypeCpu_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Time", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeTime(String value) {
        return new JAXBElement<String>(_AlertTypeTime_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Action", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeAction(String value) {
        return new JAXBElement<String>(_WorkProcessTypeAction_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Program", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeProgram(String value) {
        return new JAXBElement<String>(_WorkProcessTypeProgram_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Client", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeClient(String value) {
        return new JAXBElement<String>(_SyslogEntryTypeClient_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Reason", scope = SystemWorkProcessType.class)
    public JAXBElement<String> createSystemWorkProcessTypeReason(String value) {
        return new JAXBElement<String>(_WorkProcessTypeReason_QNAME, String.class, SystemWorkProcessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processtype", scope = SetProcessParameterElement.class)
    public JAXBElement<String> createSetProcessParameterElementProcesstype(String value) {
        return new JAXBElement<String>(_GetProcessParameterElementProcesstype_QNAME, String.class, SetProcessParameterElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snapshot", scope = ReadSnapshotResponseElement.class)
    public JAXBElement<byte[]> createReadSnapshotResponseElementSnapshot(byte[] value) {
        return new JAXBElement<byte[]>(_ReadSnapshotResponseElementSnapshot_QNAME, byte[].class, ReadSnapshotResponseElement.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSAPInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "instance", scope = GetSystemInstanceListResponseElement.class)
    public JAXBElement<ArrayOfSAPInstanceType> createGetSystemInstanceListResponseElementInstance(ArrayOfSAPInstanceType value) {
        return new JAXBElement<ArrayOfSAPInstanceType>(_GetSystemInstanceListResponseElementInstance_QNAME, ArrayOfSAPInstanceType.class, GetSystemInstanceListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJ2EEProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "process", scope = J2EEGetProcessListResponseElement.class)
    public JAXBElement<ArrayOfJ2EEProcessType> createJ2EEGetProcessListResponseElementProcess(ArrayOfJ2EEProcessType value) {
        return new JAXBElement<ArrayOfJ2EEProcessType>(_J2EEGetProcessList2ResponseElementProcess_QNAME, ArrayOfJ2EEProcessType.class, J2EEGetProcessListResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sid", scope = WebDispServerType.class)
    public JAXBElement<String> createWebDispServerTypeSid(String value) {
        return new JAXBElement<String>(_WebDispServerTypeSid_QNAME, String.class, WebDispServerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "protocol", scope = WebDispServerType.class)
    public JAXBElement<String> createWebDispServerTypeProtocol(String value) {
        return new JAXBElement<String>(_ICMConnectionTypeProtocol_QNAME, String.class, WebDispServerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "status", scope = WebDispServerType.class)
    public JAXBElement<String> createWebDispServerTypeStatus(String value) {
        return new JAXBElement<String>(_ICMThreadTypeStatus_QNAME, String.class, WebDispServerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hostname", scope = WebDispServerType.class)
    public JAXBElement<String> createWebDispServerTypeHostname(String value) {
        return new JAXBElement<String>(_SAPInstanceTypeHostname_QNAME, String.class, WebDispServerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = WebDispServerType.class)
    public JAXBElement<String> createWebDispServerTypeType(String value) {
        return new JAXBElement<String>(_J2EEProcess2TypeType_QNAME, String.class, WebDispServerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "instance", scope = WebDispServerType.class)
    public JAXBElement<String> createWebDispServerTypeInstance(String value) {
        return new JAXBElement<String>(_GetSystemInstanceListResponseElementInstance_QNAME, String.class, WebDispServerType.class, value);
    }

}
