/* tslint:disable */
/* eslint-disable */
/**
 * Catapult REST Endpoints
 * OpenAPI Specification of catapult-rest
 *
 * The version of the OpenAPI document: 1.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface NodeInfoDTO
 */
export interface NodeInfoDTO {
    /**
     * Version of the application.
     * @type {number}
     * @memberof NodeInfoDTO
     */
    version: number;
    /**
     * Public key.
     * @type {string}
     * @memberof NodeInfoDTO
     */
    publicKey: string;
    /**
     * 
     * @type {string}
     * @memberof NodeInfoDTO
     */
    networkGenerationHashSeed: string;
    /**
     * A number that defines the different roles the node provides. Possible roles are:
     * * 1 - Peer node.
     * * 2 - Api node.
     * * 4 - Voting node.
     * * 64 - IPv4 compatible node
     * * 128 - IPv6 compatible node.
     * 
     * The values are bitwise added together, Examples:
     * 1 = Just Peer.
     * 2 = Just Api.
     * 3 = Peer and Api node.
     * 7 = Peer, Api and Voting node.
     * 65 = IPv4 and Peer node.
     * 
     * @type {number}
     * @memberof NodeInfoDTO
     */
    roles: number;
    /**
     * Port used for the communication.
     * @type {number}
     * @memberof NodeInfoDTO
     */
    port: number;
    /**
     * 
     * @type {number}
     * @memberof NodeInfoDTO
     */
    networkIdentifier: number;
    /**
     * Node friendly name.
     * @type {string}
     * @memberof NodeInfoDTO
     */
    friendlyName: string;
    /**
     * Node IP address.
     * @type {string}
     * @memberof NodeInfoDTO
     */
    host: string;
    /**
     * Public key.
     * @type {string}
     * @memberof NodeInfoDTO
     */
    nodePublicKey?: string;
}

/**
 * Check if a given object implements the NodeInfoDTO interface.
 */
export function instanceOfNodeInfoDTO(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "version" in value;
    isInstance = isInstance && "publicKey" in value;
    isInstance = isInstance && "networkGenerationHashSeed" in value;
    isInstance = isInstance && "roles" in value;
    isInstance = isInstance && "port" in value;
    isInstance = isInstance && "networkIdentifier" in value;
    isInstance = isInstance && "friendlyName" in value;
    isInstance = isInstance && "host" in value;

    return isInstance;
}

export function NodeInfoDTOFromJSON(json: any): NodeInfoDTO {
    return NodeInfoDTOFromJSONTyped(json, false);
}

export function NodeInfoDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): NodeInfoDTO {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'version': json['version'],
        'publicKey': json['publicKey'],
        'networkGenerationHashSeed': json['networkGenerationHashSeed'],
        'roles': json['roles'],
        'port': json['port'],
        'networkIdentifier': json['networkIdentifier'],
        'friendlyName': json['friendlyName'],
        'host': json['host'],
        'nodePublicKey': !exists(json, 'nodePublicKey') ? undefined : json['nodePublicKey'],
    };
}

export function NodeInfoDTOToJSON(value?: NodeInfoDTO | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'version': value.version,
        'publicKey': value.publicKey,
        'networkGenerationHashSeed': value.networkGenerationHashSeed,
        'roles': value.roles,
        'port': value.port,
        'networkIdentifier': value.networkIdentifier,
        'friendlyName': value.friendlyName,
        'host': value.host,
        'nodePublicKey': value.nodePublicKey,
    };
}

