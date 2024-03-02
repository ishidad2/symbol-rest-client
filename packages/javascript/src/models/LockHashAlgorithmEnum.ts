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


/**
 * Algorithm used to hash the proof:
 * * 0 (Op_Sha3_256) - Proof is hashed using SHA3-256.
 * * 1 (Op_Hash_160) - Proof is hashed twice: first with SHA-256 and then with RIPEMD-160 (bitcoin's OP_HASH160).
 * * 2 (Op_Hash_256) - Proof is hashed twice with SHA3-256 (bitcoin's OP_HASH256).
 * 
 * @export
 */
export const LockHashAlgorithmEnum = {
    NUMBER_0: 0,
    NUMBER_1: 1,
    NUMBER_2: 2
} as const;
export type LockHashAlgorithmEnum = typeof LockHashAlgorithmEnum[keyof typeof LockHashAlgorithmEnum];


export function LockHashAlgorithmEnumFromJSON(json: any): LockHashAlgorithmEnum {
    return LockHashAlgorithmEnumFromJSONTyped(json, false);
}

export function LockHashAlgorithmEnumFromJSONTyped(json: any, ignoreDiscriminator: boolean): LockHashAlgorithmEnum {
    return json as LockHashAlgorithmEnum;
}

export function LockHashAlgorithmEnumToJSON(value?: LockHashAlgorithmEnum | null): any {
    return value as any;
}

